package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    private Button saveExitButton;
    private Button orderButton;
    TextView textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        saveExitButton = findViewById(R.id.saveExitButton);
        orderButton = findViewById(R.id.orderButton);
        textView10 = findViewById(R.id.textView10);

        Intent i = getIntent();
        String purchasePrice = i.getStringExtra(MainActivity7.EXTRA_NUMBER);
        textView10.setText(" " +purchasePrice);

        saveExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity6.class);

                startActivity(i);
            }
        });
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(i);
            }
        });

    }

}


