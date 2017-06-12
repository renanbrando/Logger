package com.reebrandogmail.logger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnStart)
    public void start(View view){
        Intent intent = new Intent(getApplicationContext(), Logger.class);
        startService(intent);
    }


    @OnClick(R.id.btnStop)
    public void stop(View view){
        Intent intent = new Intent(getApplicationContext(), Logger.class);
        stopService(intent);
    }
}
