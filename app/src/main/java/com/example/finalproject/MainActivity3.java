package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    public static final String EXTRA_NUMBER = " com.example.finalproject.EXTRA_NUMBER";
    TextView testPrice2;
    private Button backButton2;
    private Button nextButton3;
    private CheckBox checkBox25;
    private CheckBox checkBox26;
    private CheckBox checkBox27;
    private CheckBox checkBox28;
    private CheckBox checkBox29;
    private CheckBox checkBox30;
    private CheckBox checkBox31;
    private CheckBox checkBox32;

    int basePrice;
    int optionPrice;
    int optionPrice2;
    int optionPrice3;
    int optionPrice4;
    int optionPrice5;
    int optionPrice6;
    int optionPrice7;
    int optionPrice8;
    private int totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        basePrice = 25050;
        optionPrice = 1500;
        optionPrice2 = 2500;
        optionPrice3 = 1750;
        optionPrice4 = 950;
        optionPrice5 = 200;
        optionPrice6 = 2022;
        optionPrice7 = 3579;
        optionPrice8 = 1995;
        totalPrice = 0;
        testPrice2 = findViewById(R.id.testPrice2);
        backButton2 = findViewById(R.id.backButton2);
        nextButton3 = findViewById(R.id.nextButton3);
        checkBox25 = findViewById(R.id.checkBox25);
        checkBox26 = findViewById(R.id.checkBox26);
        checkBox27 = findViewById(R.id.checkBox27);
        checkBox28 = findViewById(R.id.checkBox28);
        checkBox29 = findViewById(R.id.checkBox29);
        checkBox30 = findViewById(R.id.checkBox30);
        checkBox31 = findViewById(R.id.checkBox31);
        checkBox32 = findViewById(R.id.checkBox32);


        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();

            }
        });

        checkBox25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice;
                } else {
                    totalPrice -= optionPrice;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice2;
                } else {
                    totalPrice -= optionPrice2;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice3;
                } else {
                    totalPrice -= optionPrice3;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice4;
                } else {
                    totalPrice -= optionPrice4;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice5;
                } else {
                    totalPrice -= optionPrice5;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice6;
                } else {
                    totalPrice -= optionPrice6;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });
        checkBox31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice7;
                } else {
                    totalPrice -= optionPrice7;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice8;
                } else {
                    totalPrice -= optionPrice8;
                }
                testPrice2.setText(String.valueOf(basePrice + totalPrice));
            }
        });
    }
    public void openActivity() {
        Intent j = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(j);

    }

    public void openActivity7() {
        try {
            TextView testPrice = (TextView) findViewById(R.id.testPrice2);
            double number= Double.parseDouble(testPrice.getText().toString());
            Intent j = new Intent(MainActivity3.this, MainActivity7.class);
            j.putExtra(EXTRA_NUMBER, number);
            startActivity(j);
        } catch (NumberFormatException ex) {
            testPrice2.setText("*Please Select at Least 1 Option*");



        }
    }
}