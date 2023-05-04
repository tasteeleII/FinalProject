package com.example.finalproject;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    public static final String EXTRA_NUMBER = " com.example.finalproject.EXTRA_NUMBER";
    private EditText carCostEdit;
    private EditText downPaymentEdit;
    private EditText interestEdit;
    private RadioGroup radioGroup;
    private TextView seekBarLabel;
    private SeekBar seekBar;
    private EditText paymentDisplay;
    private Button colorButton;
    private ConstraintLayout layout;
    private boolean loan;
    private TextView suvPriceDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        suvPriceDisplay = findViewById(R.id.suvPriceDisplay);
        carCostEdit = findViewById(R.id.car_cost_edit);
        downPaymentEdit = findViewById(R.id.down_payment_edit);
        interestEdit = findViewById(R.id.interest_edit);
        paymentDisplay = findViewById(R.id.payment_display);
        radioGroup = findViewById(R.id.radio_group);
        seekBarLabel = findViewById(R.id.seek_bar_label);
        seekBar = findViewById(R.id.seek_Bar);
        colorButton = findViewById(R.id.colorButton);
        layout = findViewById(R.id.layout);

        loan = true;

        Intent i = getIntent();
        double purchasePrice = i.getDoubleExtra(MainActivity2.EXTRA_NUMBER, 0);
        suvPriceDisplay.setText("$" +purchasePrice);

        Intent j = getIntent();
        double purchasePrice2 = j.getDoubleExtra(MainActivity2.EXTRA_NUMBER, 0);
        suvPriceDisplay.setText("$" +purchasePrice2);

        Intent k = getIntent();
        double purchasePrice3 = j.getDoubleExtra(MainActivity2.EXTRA_NUMBER, 0);
        suvPriceDisplay.setText("$" +purchasePrice3);

        Intent l = getIntent();
        double purchasePrice4 = j.getDoubleExtra(MainActivity2.EXTRA_NUMBER, 0);
        suvPriceDisplay.setText("$" +purchasePrice4);






        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openActivity8();
            }
        });

        EditListener el = new EditListener();
        carCostEdit.setOnEditorActionListener(el);
        interestEdit.setOnEditorActionListener(el);
        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                        loan = i == R.id.loan_radio_button;
                        calculate(); // when present it runs the calculation code
                    }
                }
        );

        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        seekBarLabel.setText(seekBar.getProgress() + "");
                        calculate();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
    }

    public void openActivity8() {
            TextView paymentDisplay = (TextView) findViewById(R.id.payment_display);
            String number = paymentDisplay.getText().toString();
            Intent i = new Intent(MainActivity7.this, MainActivity8.class);
            i.putExtra(EXTRA_NUMBER, number);
            startActivity(i);


    }

    public void calculate() {
        try {     // try isolates issues present in the code that causes the app to crash, doesnt fix the issue however, it will prevent the app from crashing
            double cost = Double.parseDouble(carCostEdit.getText().toString());
            double down = Double.parseDouble(downPaymentEdit.getText().toString());
            double apr = Double.parseDouble(interestEdit.getText().toString()) / 100;
            double mpr = apr / 12;
            int length = seekBar.getProgress();
            double principle = loan ? cost - down : (cost / 3) - down;
            double payment = principle * (mpr / (1 - Math.pow(1 + mpr, -length)));
            paymentDisplay.setText("$" + String.format("%.2f", payment));
        } catch (NumberFormatException ex) {
            paymentDisplay.setText("*Please input a value into all fields*"); // defaults text when all values needed are not present
        }
    }


    private class EditListener implements TextView.OnEditorActionListener {
        @Override
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

            calculate();
            return false;
        }
    }





}


