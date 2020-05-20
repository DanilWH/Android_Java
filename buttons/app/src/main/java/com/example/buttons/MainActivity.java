package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* initialize the buttons. */
        Button button_act2 = (Button) findViewById(R.id.activity2Button);
        Button button_act3 = (Button) findViewById(R.id.activity3Button);
        Button button_act4 = (Button) findViewById(R.id.activity4Button);
        Button button_quit = (Button) findViewById(R.id.quitButton);

        /* listening the buttons. */
        button_act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(Activity2.class);
            }
        });

        button_act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(Activity3.class);
            }
        });

        button_act4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(Activity4.class);
            }
        });

        button_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quit();
            }
        });
    }

    public void openActivity(Class activity_class) {
        /*** opens an activity depending on which one is passed into the argument. ***/
        Intent intent = new Intent(this, activity_class);
        startActivity(intent);
    }

    public void quit() {
        /*** ends the application seance. ***/
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
