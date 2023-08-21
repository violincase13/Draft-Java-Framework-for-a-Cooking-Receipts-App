package com.example.dapm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity_recettes extends AppCompatActivity {
    public Button clatite;
    public Button budinca;
    public Button omleta;
    public Button cake;
    public Button orez;
    public Button paste;
    public Button cartofi;
    public Button chia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recettes);

        clatite = findViewById(R.id.clatite);
        clatite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view_clatite) {
                Intent intent_clatite = new Intent(MainActivity_recettes.this, MainActivity_clatite.class);
                startActivity(intent_clatite);
            }
        });


        budinca = findViewById(R.id.budinca);
        budinca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view_budinca) {
                Intent intent_budinca = new Intent(MainActivity_recettes.this, MainActivity_budinca.class);
                startActivity(intent_budinca);

            }
        });

        omleta = findViewById(R.id.omleta);
        omleta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view_omleta){
                Intent intent_omleta = new Intent(MainActivity_recettes.this,MainActivity_omleta.class);
                startActivity(intent_omleta);
            }
        });

        cake = findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view_cake){
               Intent intent_cake = new Intent(MainActivity_recettes.this,MainActivity_cheesecake.class);
               startActivity(intent_cake);
           }
        });

        orez = findViewById(R.id.orez);
        orez.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view_orez){
                Intent intent_orez = new Intent(MainActivity_recettes.this,MainActivity_orez.class);
                startActivity(intent_orez);
            }
        });

        paste = findViewById(R.id.paste);
        paste.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view_paste){
                Intent intent_paste = new Intent(MainActivity_recettes.this,MainActivity_paste.class);
                startActivity(intent_paste);
            }
        });

        cartofi = findViewById(R.id.cartofi);
        cartofi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view_cartofi){
                Intent intent_cartofi = new Intent(MainActivity_recettes.this,MainActivity_cartofi_dulci.class);
                startActivity(intent_cartofi);
            }
        });

        chia =findViewById(R.id.chia);
        chia.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view_chia){
               Intent intent_chia = new Intent(MainActivity_recettes.this,MainActivity_pudding_chia.class);
               startActivity(intent_chia);
            }
    });
}
}