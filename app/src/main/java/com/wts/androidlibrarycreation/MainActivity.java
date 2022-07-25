package com.wts.androidlibrarycreation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.wts.calculationlibrary.CalculationActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.num1);
        et2 = findViewById(R.id.num2);
        et3 = findViewById(R.id.operator);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(view ->
        {
            Intent in = new Intent(MainActivity.this, CalculationActivity.class);
            in.putExtra("number1", et1.getText().toString());
            in.putExtra("number2", et2.getText().toString());
            in.putExtra("equation", et3.getText().toString());
            startActivity(in);

        });

    }
}