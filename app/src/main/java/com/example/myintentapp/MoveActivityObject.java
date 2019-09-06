package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityObject extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);
        textView = findViewById(R.id.textView);

        Mybiodata biodata = getIntent().getParcelableExtra("biodata");
        textView.setText("Nama Saya :" + biodata.getNama()+"umur saya"+ biodata.getUmur());
    }
}
