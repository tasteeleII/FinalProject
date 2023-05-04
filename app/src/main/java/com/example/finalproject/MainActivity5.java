package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    public static final String EXTRA_NUMBER = " com.example.finalproject.EXTRA_NUMBER";
    TextView testPrice3;
    private Button backButton4;
    private Button nextButton;
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private CheckBox checkBox8;

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
        setContentView(R.layout.activity_main5);
        basePrice = 59750;
        optionPrice = 4500;
        optionPrice2 = 7500;
        optionPrice3 = 3750;
        optionPrice4 = 9050;
        optionPrice5 = 2200;
        optionPrice6 = 12022;
        optionPrice7 = 3579;
        optionPrice8 = 1995;
        totalPrice = 0;
        testPrice3 = findViewById(R.id.testPrice3);
        backButton4 = findViewById(R.id.backButton4);
        nextButton = findViewById(R.id.nextButton);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

        backButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();

            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice;
                } else {
                    totalPrice -= optionPrice;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice2;
                } else {
                    totalPrice -= optionPrice2;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice3;
                } else {
                    totalPrice -= optionPrice3;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice4;
                } else {
                    totalPrice -= optionPrice4;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice5;
                } else {
                    totalPrice -= optionPrice5;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice6;
                } else {
                    totalPrice -= optionPrice6;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice7;
                } else {
                    totalPrice -= optionPrice7;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice8;
                } else {
                    totalPrice -= optionPrice8;
                }
                testPrice3.setText(String.valueOf(basePrice + totalPrice));
            }
        });
    }
    public void openActivity() {
        Intent k = new Intent(MainActivity5.this, MainActivity.class);
        startActivity(k);

    }

    public void openActivity7() {
        try {
            TextView testPrice = (TextView) findViewById(R.id.testPrice3);
            double number= Double.parseDouble(testPrice.getText().toString());
            Intent k = new Intent(MainActivity5.this, MainActivity7.class);
            k.putExtra(EXTRA_NUMBER, number);
            startActivity(k);
        } catch (NumberFormatException ex) {
            testPrice3.setText("*Please Select at Least 1 Option*");



        }
    }
}