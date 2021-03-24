package com.example.monsterdex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openButton = findViewById(R.id.openBtn);



        openButton.setOnClickListener(view -> openMonsterdex());
    }

    public void openMonsterdex(){
        startActivity(new Intent(MainActivity.this, MonsterDetailsActivity.class));
    }



}