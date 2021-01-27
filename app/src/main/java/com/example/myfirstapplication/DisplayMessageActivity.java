package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        TextView tv = findViewById(R.id.et2);
        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        int num = 0;

        // try {..} catch(ExceptionType e) {...} JAVA syntax :- Tries the code in try and if there is an
        // exception we catch that exception using one or multiple catch statements
        // multiple catch's can be used to perform different actions on different types of exceptions
        // Here we handle NumberFormatException
        // Exception name can be anything, preferably related to the exception type

        try {
            num = Integer.parseInt(message);
        } catch(NumberFormatException kuchbhi) {
            tv.setText("");
            textView.setText("Invalid Input!");
        }

        if(num < 1 || num > 1000000) {
            tv.setText("");
            textView.setText("Invalid Input!");
        }
        else {
            Random rand = new Random();     // JAVA syntax : Random rand = new Random()
                                            // means rand is a new instance of class Random
            int ans = rand.nextInt(num) + 1;
            textView.setText(Integer.toString(ans));
            tv.setText("A random number between 1 and " + Integer.toString(num) + " is : ");
        }
    }
}