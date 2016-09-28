package com.grassjelly.devjlin.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (data != null) {
            if (requestCode == 440) {
                if (resultCode == RESULT_OK) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.putExtra("three", data.getStringExtra("four"));
                    setResult(RESULT_OK, intent);
                    //finish();
                }
            }
            if (requestCode == 550) {
                if (resultCode == RESULT_OK) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.putExtra("three", data.getStringExtra("five"));
                    setResult(RESULT_OK, intent);
                    //finish();
                }
            }
        }
    }

    public void launchActivity4 (View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivityForResult(intent, 440);
    }

    public void launchActivity5 (View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivityForResult(intent, 550);
    }
}
