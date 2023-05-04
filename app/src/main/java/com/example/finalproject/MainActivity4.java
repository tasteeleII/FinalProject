package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    public static final String EXTRA_NUMBER = " com.example.finalproject.EXTRA_NUMBER";
    TextView testPrice4;
    private Button backButton3;
    private Button nextButton4;
    private CheckBox checkBox9;
    private CheckBox checkBox10;
    private CheckBox checkBox11;
    private CheckBox checkBox12;
    private CheckBox checkBox13;
    private CheckBox checkBox14;
    private CheckBox checkBox15;
    private CheckBox checkBox16;
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
        setContentView(R.layout.activity_main4);
        basePrice = 225050;
        optionPrice = 12700;
        optionPrice2 = 22200;
        optionPrice3 = 3750;
        optionPrice4 = 8750;
        optionPrice5 = 2999;
        optionPrice6 = 3398;
        optionPrice7 = 3458;
        optionPrice8 = 1776;
        totalPrice = 0;
        testPrice4 = findViewById(R.id.testPrice4);
        backButton3 = findViewById(R.id.backButton3);
        nextButton4 = findViewById(R.id.nextButton4);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);
        checkBox11 = findViewById(R.id.checkBox11);
        checkBox12 = findViewById(R.id.checkBox12);
        checkBox13 = findViewById(R.id.checkBox13);
        checkBox14 = findViewById(R.id.checkBox14);
        checkBox15 = findViewById(R.id.checkBox15);
        checkBox16 = findViewById(R.id.checkBox16);

        nextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

        backButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();

            }
        });

        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice;
                } else {
                    totalPrice -= optionPrice;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice2;
                } else {
                    totalPrice -= optionPrice2;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice3;
                } else {
                    totalPrice -= optionPrice3;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice4;
                } else {
                    totalPrice -= optionPrice4;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice5;
                } else {
                    totalPrice -= optionPrice5;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice6;
                } else {
                    totalPrice -= optionPrice6;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });
        checkBox15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice7;
                } else {
                    totalPrice -= optionPrice7;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice8;
                } else {
                    totalPrice -= optionPrice8;
                }
                testPrice4.setText(String.valueOf(basePrice + totalPrice));
            }
        });
    }
    public void openActivity() {
        Intent l = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(l);

    }

    public void openActivity7() {
        try {
            TextView testPrice = (TextView) findViewById(R.id.testPrice4);
            double number= Double.parseDouble(testPrice.getText().toString());
            Intent l = new Intent(MainActivity4.this, MainActivity7.class);
            l.putExtra(EXTRA_NUMBER, number);
            startActivity(l);
        } catch (NumberFormatException ex) {
            testPrice4.setText("*Please Select at Least 1 Option*");



        }
    }
}