package com.example.buatresponsi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Produk> {
    private Context Ctx;
    private List<Daftar_Makanan> List_Produk;

    public Adapter(Context ctx1, List<Daftar_Makanan> list_produk){

        Ctx = ctx1;
        List_Produk = list_produk;
    }

    @NonNull
    @Override
    public Adapter.Produk onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater = LayoutInflater.from(Ctx);
        View view = Inflater.inflate(R.layout.list_makanan,null);
        return new Produk(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Produk holder, int position) {
        final Daftar_Makanan product = List_Produk.get(position);
        holder.textTitle.setText(product.getTitle());
        holder.textHarga.setText(product.getHarga());
        holder.textDesc.setText(product.getDesc());
        holder.imageView.setImageDrawable(Ctx.getResources().getDrawable(product.getGambar()));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ctx,DetailActivity.class);
                intent.putExtra("gambar",product.getGambar());
                intent.putExtra("nama",product.getTitle());
                intent.putExtra("desc",product.getDesc());
                intent.putExtra("harga",product.getHarga());
                Ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return List_Produk.size();
    }

    public class Produk extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textTitle, textHarga, textDesc;
        RelativeLayout relativeLayout;

        public Produk(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textTitle = itemView.findViewById(R.id.nama);
            textHarga = itemView.findViewById(R.id.harga);
            textDesc = itemView.findViewById(R.id.deskripsi);

            relativeLayout = itemView.findViewById(R.id.relative);
        }
    }
}
