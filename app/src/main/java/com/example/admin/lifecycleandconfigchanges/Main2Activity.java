package com.example.admin.lifecycleandconfigchanges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG ="Main2ActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "onCreate2: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart2: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume2: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause2: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop2: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy2: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart2: ");
    }
}
