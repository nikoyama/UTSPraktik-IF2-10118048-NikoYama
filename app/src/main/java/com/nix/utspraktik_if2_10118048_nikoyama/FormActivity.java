package com.nix.utspraktik_if2_10118048_nikoyama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Nama : Niko Yama
 * NIM : 10118048
 * Kelas : IF-2
 * Tanggal Pengerjaan : 5 juni 2021
 */
public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btnSelanjutnya = findViewById(R.id.btn_selanjutnya);
        EditText etNik = findViewById(R.id.et_nik);
        EditText etNama = findViewById(R.id.et_nama);
        EditText etTanggalLahir = findViewById(R.id.et_tanggal_lahir);
        RadioGroup rgJenisKelamin = findViewById(R.id.rg_jenis_kelamin);
        RadioGroup rgHubungan = findViewById(R.id.rg_hubungan);

        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), KonfirmasiActivity.class);

                int selectedId = rgJenisKelamin.getCheckedRadioButtonId();
                RadioButton rbJenisKelamin = findViewById(selectedId);

                int selectedId2 = rgHubungan.getCheckedRadioButtonId();
                RadioButton rbHubungan = findViewById(selectedId2);

                Bundle b = new Bundle();
                b.putString("nik",etNik.getText().toString());
                b.putString("nama",etNama.getText().toString());
                b.putString("tanggalLahir",etTanggalLahir.getText().toString());
                b.putString("jenisKelamin",rbJenisKelamin.getText().toString());
                b.putString("hubungan",rbHubungan.getText().toString());

                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}