package com.grassjelly.devjlin.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void onSubmit (View view) {
        String str = ((EditText) findViewById(R.id.editText)).getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.putExtra("four", str);
        setResult(RESULT_OK, intent);
        finish();
    }
}
