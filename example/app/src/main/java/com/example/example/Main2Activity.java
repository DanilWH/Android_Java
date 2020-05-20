package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        // get the user last name from the 1'st activity.
        String last_name_text = intent.getStringExtra(MainActivity.EXTRA_LAST_NAME);

        // initialize the viewer.
        TextView textview = (TextView) findViewById(R.id.textViewAct2);
        // show the user last name we got from the 1'st activity.
        textview.setText(last_name_text + " is the most beautiful last name!");
    }
}
