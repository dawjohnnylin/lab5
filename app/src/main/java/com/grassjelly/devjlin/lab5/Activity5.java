package com.grassjelly.devjlin.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    @Override
    public void finish() {
        String str = "Dave. I'm afraid I can't do that.";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.putExtra("five", str);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
