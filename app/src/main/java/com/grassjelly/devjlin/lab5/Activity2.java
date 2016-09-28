package com.grassjelly.devjlin.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void onClick_One (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.putExtra("two", "Activity 2: One, 1, uno, un/une");
        setResult(RESULT_OK, intent);
        //finish();
    }

    public void onClick_Two (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.putExtra("two", "Activity 2: Two, 2, due, deux");
        setResult(RESULT_OK, intent);
        //finish();
    }
}
