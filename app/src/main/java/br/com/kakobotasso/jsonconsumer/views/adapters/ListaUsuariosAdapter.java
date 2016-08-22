package br.com.kakobotasso.jsonconsumer.views.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.kakobotasso.jsonconsumer.R;
import br.com.kakobotasso.jsonconsumer.models.Usuario;

/**
 * Created by kakobotasso on 8/21/16.
 */
public class ListaUsuariosAdapter extends RecyclerView.Adapter<ListaUsuariosAdapter.UsuarioViewHolder> {
    private List<Usuario> usuariosList;

    public ListaUsuariosAdapter(List<Usuario> usuariosList){
        this.usuariosList = usuariosList;
    }

    @Override
    public UsuarioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.cardview_usuario, parent, false);
        return new UsuarioViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UsuarioViewHolder holder, int position) {
        Usuario usuario = usuariosList.get(position);
        holder.idUsuario.setText("ID: " + usuario.getId());
        holder.nomeUsuario.setText("Name: " + usuario.getNome());
        holder.pwdUsuario.setText("Pwd: " + usuario.getPwd());
    }

    @Override
    public int getItemCount() {
        return usuariosList.size();
    }

    public static class UsuarioViewHolder extends RecyclerView.ViewHolder{
        private TextView idUsuario;
        private TextView nomeUsuario;
        private TextView pwdUsuario;

        public UsuarioViewHolder(View itemView) {
            super(itemView);
            this.idUsuario = (TextView) itemView.findViewById(R.id.id_usuario);
            this.nomeUsuario = (TextView) itemView.findViewById(R.id.nome_usuario);
            this.pwdUsuario = (TextView) itemView.findViewById(R.id.pwd_usuario);
        }
    }
}
