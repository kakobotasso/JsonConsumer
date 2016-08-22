package br.com.kakobotasso.jsonconsumer.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import br.com.kakobotasso.jsonconsumer.R;
import br.com.kakobotasso.jsonconsumer.models.DataContainer;
import br.com.kakobotasso.jsonconsumer.network.DataInterface;
import br.com.kakobotasso.jsonconsumer.views.adapters.ListaDataAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView listaUsuarios = (RecyclerView) findViewById(R.id.lista_usuarios);
        listaUsuarios.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaUsuarios.setLayoutManager(linearLayoutManager);

        DataInterface dataInterface = DataInterface.retrofit.create(DataInterface.class);
        Call<DataContainer> chamada = dataInterface.getData();
        final Context that = this;

        chamada.enqueue(new Callback<DataContainer>() {
            @Override
            public void onResponse(Call<DataContainer> call, Response<DataContainer> response) {
                ListaDataAdapter adapter = new ListaDataAdapter(response.body().getDataModelList());
                listaUsuarios.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<DataContainer> call, Throwable t) {
                Toast.makeText(that, "Não foi possivel conectar à API", Toast.LENGTH_LONG).show();
            }
        });


    }
}
