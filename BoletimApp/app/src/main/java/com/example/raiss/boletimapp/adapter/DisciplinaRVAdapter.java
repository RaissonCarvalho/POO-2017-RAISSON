package com.example.raiss.boletimapp.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raiss.boletimapp.R;
import com.example.raiss.boletimapp.model.Disciplina;

import java.util.List;

public class DisciplinaRVAdapter extends RecyclerView.Adapter<DisciplinaRVAdapter.ViewHolder>{

    private Context context;
    private List<Disciplina> listadisciplinas;

    public DisciplinaRVAdapter(Context context, List<Disciplina> listadisciplinas) {
        this.context = context;
        listadisciplinas = listadisciplinas;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        protected TextView tvNomeDisciplina;
        protected TextView tvMediaDisciplina;
        protected TextView tvStatusdDisciplina;

        public ViewHolder(View itemView) {
            super(itemView);

            tvMediaDisciplina = itemView.findViewById(R.id.tv_nome_disciplina);
            tvMediaDisciplina = itemView.findViewById(R.id.tv_media_disciplina);
            tvStatusdDisciplina = itemView.findViewById(R.id.tv_status_disciplina);

        }
    }

    @Override
    public DisciplinaRVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_disciplina, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DisciplinaRVAdapter.ViewHolder holder, int position) {

        Disciplina disciplina = this.listadisciplinas.get(position);

        holder.tvNomeDisciplina.setText(disciplina.getNomeDisciplina());
        holder.tvMediaDisciplina.setText(String.valueOf(disciplina.calcularMedia()));
        holder.tvStatusdDisciplina.setText(disciplina.verficarStatus(disciplina));

    }

    @Override
    public int getItemCount() {
        return listadisciplinas.size();
    }

}
