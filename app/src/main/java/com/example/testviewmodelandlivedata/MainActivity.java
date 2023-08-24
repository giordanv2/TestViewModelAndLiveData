package com.example.testviewmodelandlivedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int firstNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numberTextView = findViewById(R.id.numberTextView);
        Button plusOneButton = findViewById(R.id.plusOneButton);
        Button minusOneButton = findViewById(R.id.minusOneButton);
        Button resetButton = findViewById(R.id.resetButton);

        plusOneButton.setOnClickListener(v -> {
            incrementNumber();
            numberTextView.setText(String.valueOf(firstNumber));
        });

        minusOneButton.setOnClickListener(v -> {
            decrementNumber();
            numberTextView.setText(String.valueOf(firstNumber));
        });

        resetButton.setOnClickListener(v -> {
            resetNumber();
            numberTextView.setText(String.valueOf(firstNumber));
        });
    }

    void incrementNumber() {
        firstNumber++;
    }
    void decrementNumber() {
        if(firstNumber > 0){
            firstNumber--;
        }
    }
    void resetNumber() {
        firstNumber = 0;
    }
}