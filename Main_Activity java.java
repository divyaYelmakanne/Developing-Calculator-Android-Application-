package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private float valueOne, valueTwo;
    private boolean addition, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSub = findViewById(R.id.buttonSub);
        Button buttonMul = findViewById(R.id.buttonMul);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonEqual = findViewById(R.id.buttonEqual);

        button0.setOnClickListener(view -> editText.setText(editText.getText() + "0"));
        button1.setOnClickListener(view -> editText.setText(editText.getText() + "1"));
        button2.setOnClickListener(view -> editText.setText(editText.getText() + "2"));
        button3.setOnClickListener(view -> editText.setText(editText.getText() + "3"));
        button4.setOnClickListener(view -> editText.setText(editText.getText() + "4"));
        button5.setOnClickListener(view -> editText.setText(editText.getText() + "5"));
        button6.setOnClickListener(view -> editText.setText(editText.getText() + "6"));
        button7.setOnClickListener(view -> editText.setText(editText.getText() + "7"));
        button8.setOnClickListener(view -> editText.setText(editText.getText() + "8"));
        button9.setOnClickListener(view -> editText.setText(editText.getText() + "9"));
        buttonDot.setOnClickListener(view -> editText.setText(editText.getText() + "."));

        buttonAdd.setOnClickListener(view -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            addition = true;
            editText.setText("");
        });

        buttonSub.setOnClickListener(view -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            subtract = true;
            editText.setText("");
        });

        buttonMul.setOnClickListener(view -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            multiply = true;
            editText.setText("");
        });

        buttonDiv.setOnClickListener(view -> {
            valueOne = Float.parseFloat(editText.getText().toString());
            divide = true;
            editText.setText("");
        });

        buttonEqual.setOnClickListener(view -> {
            valueTwo = Float.parseFloat(editText.getText().toString());

            if (addition) {
                editText.setText(valueOne + valueTwo + "");
                addition = false;
            }

            if (subtract) {
                editText.setText(valueOne - valueTwo + "");
                subtract = false;
            }

            if (multiply) {
                editText.setText(valueOne * valueTwo + "");
                multiply = false;
            }

            if (divide) {
                editText.setText(valueOne / valueTwo + "");
                divide = false;
            }
        });
    }
}
