package br.com.kakobotasso.jsonconsumer.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.kakobotasso.jsonconsumer.R;
import br.com.kakobotasso.jsonconsumer.models.Usuario;
import br.com.kakobotasso.jsonconsumer.views.adapters.ListaUsuariosAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView listaUsuarios = (RecyclerView) findViewById(R.id.lista_usuarios);
        listaUsuarios.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaUsuarios.setLayoutManager(linearLayoutManager);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("1234", "Afonso", "4321"));
        usuarios.add(new Usuario("4567", "Alana", "5342"));
        usuarios.add(new Usuario("7890", "Mancini", "7685"));

        ListaUsuariosAdapter adapter = new ListaUsuariosAdapter(usuarios);
        listaUsuarios.setAdapter(adapter);
    }
}
