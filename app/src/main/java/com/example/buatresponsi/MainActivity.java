package com.example.buatresponsi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    List<Daftar_Makanan> List_Produk;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List_Produk = new ArrayList<>();

        recycler = (RecyclerView)findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        List_Produk.add(
                new Daftar_Makanan(
                        1,R.drawable.ayam_geprek_keju,"Ayam Geprek Keju", "Rp 20000","Ayam Geprek pake Keju"
                )
        );
        List_Produk.add(
                new Daftar_Makanan(
                        2,R.drawable.kari_ayam,"Kari Ayam", "Rp 17500","Ayam pake Kari"
                )
        );
        List_Produk.add(
                new Daftar_Makanan(
                        3,R.drawable.nasi_goreng_mercon,"Nasi Goreng Mercon", "Rp 14500","Nasi Gorengnya gak pake bubuk mesiu"
                )
        );
        List_Produk.add(
                new Daftar_Makanan(
                        4,R.drawable.pecel_lele,"Pecel Lele", "Rp 15000","Lelenya dipecel"
                )
        );
        List_Produk.add(
                new Daftar_Makanan(
                        5,R.drawable.salad_buah,"Salad Buah", "Rp 12000","Salad tapi Buah"
                )
        );
        List_Produk.add(
                new Daftar_Makanan(
                        6,R.drawable.tahu_bulat,"Tahu Bulat", "Rp 500","Tahu bentuknya Bulat"
                )
        );
        adapter = new Adapter(this,List_Produk);
        recycler.setAdapter(adapter);
    }
}
