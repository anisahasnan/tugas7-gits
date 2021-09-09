package com.example.tugas7_anisahasna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private String[] listObat;
    private Integer[] listJumlah;
    private Context context;

    AdapterRecyclerView(Context context1, String[] listObat, Integer[] listJumlah) {

        this.listObat = listObat;
        this.listJumlah = listJumlah;
        context = context1;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNama;
        TextView textViewJumlah;

        ViewHolder(View v) {

            super(v);

            textViewNama = v.findViewById(R.id.nama);
            textViewJumlah = v.findViewById(R.id.jumlah);
        }
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textViewNama.setText(listObat[position]);
        holder.textViewJumlah.setText(listJumlah[position].toString());
    }

    @Override
    public int getItemCount() {

        return listObat.length;
    }
}
