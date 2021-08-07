package com.example.app.flycombar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_settings);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("설정");

        TextView textView_al = (TextView) findViewById(R.id.textView_al);

        textView_al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntental = getPackageManager().getLaunchIntentForPackage("de.szalkowski.activitylauncher");
                startActivity(launchIntental);
            }
        });

        TextView textView_settings = (TextView) findViewById(R.id.textView_settings);

        textView_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntents = getPackageManager().getLaunchIntentForPackage("com.android.settings");
                startActivity(launchIntents);
            }
        });
    }
}
