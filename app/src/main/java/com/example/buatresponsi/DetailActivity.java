package com.example.buatresponsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textNama, textHarga, textDesc;
    int image;
    String nama,harga,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.image_detail);
        textNama = findViewById(R.id.nama_detail);
        textDesc = findViewById(R.id.desc_detail);
        textHarga = findViewById(R.id.harga_detail);

        nama = getIntent().getStringExtra("nama");
        harga = getIntent().getStringExtra("harga");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getIntExtra("gambar",0);

        textNama.setText(nama);
        textHarga.setText(harga);
        textDesc.setText(desc);
        imageView.setImageResource(image);
    }
}
