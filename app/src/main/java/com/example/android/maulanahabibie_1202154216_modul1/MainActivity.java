package com.example.android.maulanahabibie_1202154216_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText MakananEditText;
    private EditText PorsiEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        MakananEditText = (EditText) findViewById(R.id.plaintextmakanan);
        PorsiEditText = (EditText) findViewById(R.id.plaintextporsi);
        String makanan = MakananEditText.getText().toString();
        String porsi = PorsiEditText.getText().toString();
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("tempat","eatbus");
        intent.putExtra("menumakanan",makanan);
        intent.putExtra("jumlahporsi",porsi);
        intent.putExtra("jumlahharga","50000");
        startActivity(intent);

    }

    public void abnormal(View view) {
        MakananEditText = (EditText) findViewById(R.id.plaintextmakanan);
        PorsiEditText = (EditText) findViewById(R.id.plaintextporsi);
        String makanan = MakananEditText.getText().toString();
        String porsi = PorsiEditText.getText().toString();
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("tempat","abnormal");
        intent.putExtra("menumakanan",makanan);
        intent.putExtra("jumlahporsi",porsi);
        intent.putExtra("jumlahharga","30000");
        startActivity(intent);

    }
}
