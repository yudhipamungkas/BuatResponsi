package com.example.buatresponsi;

public class Daftar_Makanan {
    private int id, gambar;
    private String title, harga, desc;

    public Daftar_Makanan(int id, int gambar, String title, String harga, String desc) {
        this.id = id;
        this.gambar = gambar;
        this.title = title;
        this.harga = harga;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public int getGambar() {
        return gambar;
    }

    public String getTitle() {
        return title;
    }

    public String getHarga() {
        return harga;
    }

    public String getDesc() {
        return desc;
    }
}
