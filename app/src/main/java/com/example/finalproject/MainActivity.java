package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     ImageView imageViewSUV;
     ImageView imageViewSEDAN;
     ImageView imageViewELECTRIC;
     ImageView imageViewSUPER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewSUV = findViewById(R.id.imageViewSUV);
        imageViewSEDAN = findViewById(R.id.imageViewELECTRIC);
        imageViewELECTRIC = findViewById(R.id.imageViewSEDAN);
        imageViewSUPER = findViewById(R.id.imageViewSUPER);



        imageViewSUV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                // i.putExtra("color", backgroundColor);
                startActivity(i);
            }
        });
        imageViewSEDAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                // i.putExtra("color", backgroundColor);
                startActivity(i);
            }
        });imageViewELECTRIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                // i.putExtra("color", backgroundColor);
                startActivity(i);
            }
        });imageViewSUPER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity5.class);
                // i.putExtra("color", backgroundColor);
                startActivity(i);
            }
        });





    }
}