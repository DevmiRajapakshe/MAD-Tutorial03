package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText editNo1;
    EditText editNo2;
    TextView txtView;
    String num1, num2;
    Float no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editNo1 = findViewById(R.id.editno1);
        editNo2 = findViewById(R.id.editNo2);

        Intent myIntent = getIntent();
        num1 = myIntent.getStringExtra("Number1");
        num2 = myIntent.getStringExtra("Number2");

        editNo1.setText(num1);
        editNo2.setText(num2);

        txtView = (TextView) findViewById(R.id.result);
    }

    public void add(View view){
        no1 = Float.valueOf(editNo1.getText().toString());
        no2 = Float.valueOf(editNo2.getText().toString());
        txtView.setText(""+no1+"+"+no2+" = "+(no1+no2));
    }

    public void substract(View view){
        no1 = Float.valueOf(editNo1.getText().toString());
        no2 = Float.valueOf(editNo2.getText().toString());
        txtView.setText(""+no1+"-"+no2+" = "+(no1-no2));
    }

    public void multiply(View view){
        no1 = Float.valueOf(editNo1.getText().toString());
        no2 = Float.valueOf(editNo2.getText().toString());
        txtView.setText(""+no1+"*"+no2+" = "+(no1*no2));
    }

    public void divide(View view){
        no1 = Float.valueOf(editNo1.getText().toString());
        no2 = Float.valueOf(editNo2.getText().toString());
        txtView.setText(""+no1+"/"+no2+" = "+(no1/no2));
    }


}