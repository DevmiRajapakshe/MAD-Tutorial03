package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText editNo01;
    EditText editNo02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editNo01 = findViewById(R.id.editNo01);
        editNo02 = findViewById(R.id.editNo02);

        Button okay = (Button)findViewById(R.id.ok);
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(FirstActivity.this, "You just clicked the OK button", Toast.LENGTH_SHORT).show();

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();

                Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);
                    myIntent.putExtra("Number1",editNo01.getText().toString());
                    myIntent.putExtra("Number2",editNo02.getText().toString());
                    startActivity(myIntent);
            }
        });
    }



}