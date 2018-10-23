package com.onboard.jbschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button start,stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.btnSchedule);
        stop = findViewById(R.id.btnPauseSchedule);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start my scheduling job
            }
        });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stop schedule job

            }
        });
    }
}
