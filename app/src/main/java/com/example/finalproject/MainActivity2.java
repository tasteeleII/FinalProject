package com.example.finalproject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_NUMBER = " com.example.finalproject.EXTRA_NUMBER";
    TextView testPrice;
    Button backButton;
    Button nextButton2;
    CheckBox checkBox17;
    CheckBox checkBox18;
    CheckBox checkBox19;
    CheckBox checkBox20;
    CheckBox checkBox21;
    CheckBox checkBox22;
    CheckBox checkBox23;
    CheckBox checkBox24;
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
        setContentView(R.layout.activity_main2);

        basePrice = 20000;
        optionPrice = 500;
        optionPrice2 = 1500;
        optionPrice3 = 2500;
        optionPrice4 = 800;
        optionPrice5 = 2000;
        optionPrice6 = 2750;
        optionPrice7 = 650;
        optionPrice8 = 1000;
        totalPrice = 0;
        testPrice = findViewById(R.id.testPrice);
        backButton = findViewById(R.id.backButton);
        nextButton2 = findViewById(R.id.nextButton2);
        checkBox17 = findViewById(R.id.checkBox17);
        checkBox18 = findViewById(R.id.checkBox18);
        checkBox19 = findViewById(R.id.checkBox19);
        checkBox20 = findViewById(R.id.checkBox20);
        checkBox21 = findViewById(R.id.checkBox21);
        checkBox22 = findViewById(R.id.checkBox22);
        checkBox23 = findViewById(R.id.checkBox23);
        checkBox24 = findViewById(R.id.checkBox24);


        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();

            }
        });

        checkBox17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice;
                } else {
                    totalPrice -= optionPrice;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice2;
                } else {
                    totalPrice -= optionPrice2;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice3;
                } else {
                    totalPrice -= optionPrice3;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice4;
                } else {
                    totalPrice -= optionPrice4;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice5;
                } else {
                    totalPrice -= optionPrice5;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice6;
                } else {
                    totalPrice -= optionPrice6;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });
        checkBox23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice7;
                } else {
                    totalPrice -= optionPrice7;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });

        checkBox24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    totalPrice += optionPrice8;
                } else {
                    totalPrice -= optionPrice8;
                }
                testPrice.setText(String.valueOf(basePrice + totalPrice));
            }
        });



    }

    public void openActivity() {
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);

    }

    public void openActivity7() {
        try {
            TextView testPrice = (TextView) findViewById(R.id.testPrice);
            double number= Double.parseDouble(testPrice.getText().toString());
            Intent i = new Intent(MainActivity2.this, MainActivity7.class);
            i.putExtra(EXTRA_NUMBER, number);
            startActivity(i);
        } catch (NumberFormatException ex) {
            testPrice.setText("*Please Select at Least 1 Option*");



        }
    }

}

















