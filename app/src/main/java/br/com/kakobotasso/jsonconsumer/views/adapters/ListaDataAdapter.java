package br.com.kakobotasso.jsonconsumer.views.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.kakobotasso.jsonconsumer.R;
import br.com.kakobotasso.jsonconsumer.models.DataModel;

/**
 * Created by kakobotasso on 8/21/16.
 */
public class ListaDataAdapter extends RecyclerView.Adapter<ListaDataAdapter.DataModelViewHolder> {
    private List<DataModel> dataModelList;

    public ListaDataAdapter(List<DataModel> dataModelList){
        this.dataModelList = dataModelList;
    }

    @Override
    public  DataModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.cardview_usuario, parent, false);
        return new  DataModelViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DataModelViewHolder holder, int position) {
        DataModel dataModel = dataModelList.get(position);
        holder.idUsuario.setText("ID: " + dataModel.getId());
        holder.nomeUsuario.setText("Name: " + dataModel.getName());
        holder.pwdUsuario.setText("Pwd: " + dataModel.getPwd());
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public static class  DataModelViewHolder extends RecyclerView.ViewHolder{
        private TextView idUsuario;
        private TextView nomeUsuario;
        private TextView pwdUsuario;

        public DataModelViewHolder(View itemView) {
            super(itemView);
            this.idUsuario = (TextView) itemView.findViewById(R.id.id_usuario);
            this.nomeUsuario = (TextView) itemView.findViewById(R.id.nome_usuario);
            this.pwdUsuario = (TextView) itemView.findViewById(R.id.pwd_usuario);
        }
    }
}
