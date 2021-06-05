package com.nix.utspraktik_if2_10118048_nikoyama;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Nama : Niko Yama
 * NIM : 10118048
 * Kelas : IF-2
 * Tanggal Pengerjaan : 5 juni 2021
 */
public class KonfirmasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);
        Bundle b = getIntent().getExtras();
        TextView nik = findViewById(R.id.tv_nik);
        TextView nama = findViewById(R.id.tv_nama);
        TextView tl = findViewById(R.id.tv_tanggal_lahir);
        TextView jk = findViewById(R.id.tv_jenis_kelamin);
        TextView hubungan = findViewById(R.id.tv_hubungan);

        nik.setText(b.getString("nik"));
        nama.setText(b.getString("nama"));
        tl.setText(b.getString("tanggalLahir"));
        jk.setText(b.getString("jenisKelamin"));
        hubungan.setText(b.getString("hubungan"));

        Button btnSimpan = findViewById(R.id.btn_simpan);
        Button btnUbah = findViewById(R.id.btn_ubah);

        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(KonfirmasiActivity.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.dialog_berhasil, viewGroup, false);
                builder.setView(dialogView);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}