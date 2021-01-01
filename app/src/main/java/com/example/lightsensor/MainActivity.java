package com.example.lightsensor;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    //Button btn;
    EditText year;
    Button btn;
    TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        year =  findViewById(R.id.year);
        btn = (Button) findViewById(R.id.btn);
        age = findViewById(R.id.age);
        // click --
        // get Years from edit text --
        // calculate
        // display


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int years = Integer.parseInt(String.valueOf(year.getText()));
                int myAge = 2021 - years;
                age.setText(String.valueOf(myAge));
            }
        });


        //btn = findViewById(R.id.btn);
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"U Click ME !!", Toast.LENGTH_LONG).show();
            }
        });
        */
    }


}
