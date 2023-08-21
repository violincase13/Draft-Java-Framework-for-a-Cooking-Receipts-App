package com.example.dapm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button retete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retete = findViewById(R.id.retete);
        retete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this,MainActivity_recettes.class);
                startActivity(intent);
            }
        });
    }
}