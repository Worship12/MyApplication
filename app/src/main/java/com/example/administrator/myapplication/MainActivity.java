package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");

    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }
}
