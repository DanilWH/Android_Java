package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // create EXTRA constants.
    public static final String EXTRA_LAST_NAME = "com.example.example.EXTRA_LAST_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the button.
        Button button = (Button) findViewById(R.id.button);

        // create a listener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // we open the second activity if the button was pressed.
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        // initialize the EditText field.
        EditText last_name = (EditText) findViewById(R.id.editLastName);
        // get the text from the field.
        String last_name_text = last_name.getText().toString();

        /*** opens the 2'nd activity and passes the variable ***/
        Intent intent = new Intent(this, Main2Activity.class);
        // pass the user last name to the 2'nd activity.
        intent.putExtra(EXTRA_LAST_NAME, last_name_text);
        // start the activity.
        startActivity(intent);
    }
}
