package com.example.android.maulanahabibie_1202154216_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private TextView tempat;
    private TextView menumakanan;
    private TextView jumlahporsi;
    private TextView jumlahharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tempat = (TextView) findViewById(R.id.tempat);
        menumakanan = (TextView) findViewById(R.id.menumakanan);
        jumlahporsi = (TextView) findViewById(R.id.jumlahporsi);
        jumlahharga = (TextView) findViewById(R.id.jumlahharga);
        Intent intent = getIntent();
        String valtempat= intent.getStringExtra("tempat");
        String valmenumakanan= intent.getStringExtra("menumakanan");
        String valjumlahporsi= intent.getStringExtra("jumlahporsi");
        String valjumlahharga= intent.getStringExtra("jumlahharga");
        int jumlah_harga = Integer.valueOf(valjumlahharga)*Integer.valueOf(valjumlahporsi);

        tempat.setText(valtempat);
        menumakanan.setText(valmenumakanan);
        jumlahporsi.setText(valjumlahporsi);
        jumlahharga.setText(String.valueOf(jumlah_harga));



        if(jumlah_harga > 65000){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan makan disini,kamu ga akan kuat,uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Makan disini kuy",Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
