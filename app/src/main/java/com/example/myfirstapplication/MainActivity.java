package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "kuch bhi chalta hai idhar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {        // This method is the onClick Attribute of
                                                // activity_main.button in .xml file
                                                // alternative to setOnClickListener()
                                                //** This method must be public and should
        //                                      // have argument (View v) to work**
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        // Intent is a pathway for communication between "this" (current activity)
        // and Activity2.class.
        // startActivity(intent) initiates the communication.
        // Intent class has a method putExtra() which can be used to pass "packages" between
        // the 2 activities.
        // Without putExtra() the method will simply navigate to Activity with no data
        // here EXTRA_MESSAGE is a key which stores the value of the string message
        // The initial value of EXTRA_MESSAGE is redundant.
        // One intent can have multiple data and we use the key to access the required data
    }
}