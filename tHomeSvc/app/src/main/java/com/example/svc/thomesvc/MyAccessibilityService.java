package com.example.svc.thomesvc;

import android.accessibilityservice.AccessibilityService;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class MyAccessibilityService extends AccessibilityService implements TextToSpeech.OnInitListener {

    private static final String LOG_TAG = "onAccessibilityEvent";
    private static final String TAG = "app";

    @Override
    public void onServiceConnected() {
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
            Log.e(TAG, "Catch Event Package Name : " + event.getPackageName());
            Log.e(TAG, "Catch Event TEXT : " + event.getText());
            Log.e(TAG, "Catch Event ContentDescription : " + event.getContentDescription());
            Log.e(TAG, "Catch Event getSource : " + event.getSource());
            Log.e(TAG, "=========================================================================");

    }


    @Override
    public void onInterrupt() {
        /* do nothing */
    }


    @Override
    public void onInit(int status) {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        return false;
    }
}
