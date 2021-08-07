package com.example.svc.kioskvideoviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton;
        Button endButton;

        startButton = (Button)findViewById(R.id.mStartLockButton);
        endButton = (Button)findViewById(R.id.mEndLockButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LockUtil.lock(MainActivity.this);
                startLockTask();
            }
        });
    }


}