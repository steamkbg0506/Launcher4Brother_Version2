package com.example.app.flycombar;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.app.flycombar.databinding.ActivityMainBinding;


import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("암냠냠 촵촵");

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntentwt = getPackageManager().getLaunchIntentForPackage("wongi.weather");
                startActivity(launchIntentwt);
                finish();
            }
        });


        Button button_lf = (Button) findViewById(R.id.button_lf);
        button_lf.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntentlf = getPackageManager().getLaunchIntentForPackage("net.littlefox.lf_app_fragment");
                startActivity(launchIntentlf);
            }
        });

        Button button_ee = (Button) findViewById(R.id.button_ee);
        button_ee.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComponentName cn = new ComponentName("com.android.systemui","com.android.systemui.DessertCase");
                Intent intentb = new Intent(Intent.ACTION_MAIN);
                intentb.addCategory(Intent.CATEGORY_LAUNCHER);
                intentb.setComponent(cn);
                startActivity(intentb);
            }
        });

        Button button_wwf = (Button) findViewById(R.id.button_wwf);
        button_wwf.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent_activity1 = new Intent(MainActivity.this, BoilingWaterActivity.class);
                startActivity(intent_activity1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_nsettings){
            Intent launchIntents = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(launchIntents);
        }

        return super.onOptionsItemSelected(item);
    }

}