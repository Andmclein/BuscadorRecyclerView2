package com.example.buscadorrecyclerview;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.UsuarioViewHolder>{

   Context context;
   List<Usuario>listaUsuarios;

    public AdaptadorUsuarios(Context context, List<Usuario> listaUsuarios) {
        this.context = context;
        this.listaUsuarios = listaUsuarios;

    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_usuario, viewGroup,false);
        return new UsuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.tvLibro.setText(listaUsuarios.get(i).getLibro());
        usuarioViewHolder.tvCodigo.setText(listaUsuarios.get(i).getCodigo());
        usuarioViewHolder.tvCategoria.setText(listaUsuarios.get(i).getCategoria());

    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }
    public class UsuarioViewHolder extends RecyclerView.ViewHolder{

        TextView tvLibro, tvCodigo, tvCategoria;
        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLibro = itemView.findViewById(R.id.tvLibro);
            tvCodigo = itemView.findViewById(R.id.tvCodigo);
            tvCategoria = itemView.findViewById(R.id.tvCategoria);
        }
    }
    public void filtrar(ArrayList<Usuario> filtroUsuarios){
        this.listaUsuarios=filtroUsuarios;
        notifyDataSetChanged();
    }
    }

