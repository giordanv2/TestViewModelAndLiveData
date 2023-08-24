package com.example.testviewmodelandlivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numberTextView = findViewById(R.id.numberTextView);
        Button plusOneButton = findViewById(R.id.plusOneButton);
        Button minusOneButton = findViewById(R.id.minusOneButton);
        Button resetButton = findViewById(R.id.resetButton);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        plusOneButton.setOnClickListener(v -> {
            incrementNumber();
            numberTextView.setText(String.valueOf(viewModel.firstNumber));
        });

        minusOneButton.setOnClickListener(v -> {
            decrementNumber();
            numberTextView.setText(String.valueOf(viewModel.firstNumber));
        });

        resetButton.setOnClickListener(v -> {
            resetNumber();
            numberTextView.setText(String.valueOf(viewModel.firstNumber));
        });
    }

    void incrementNumber() {
        viewModel.firstNumber++;
    }
    void decrementNumber() {
        if(viewModel.firstNumber > 0){
            viewModel.firstNumber--;
        }
    }
    void resetNumber() {
        viewModel.firstNumber = 0;
    }
}