package com.grassjelly.devjlin.lab5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (data != null) {
            if (requestCode == 220) {
                if (resultCode == RESULT_OK) {
                    TextView textView = (TextView) findViewById(R.id.results);
                    textView.setText(data.getStringExtra("two"));
                }
            }
            if (requestCode == 330) {
                if (resultCode == RESULT_OK) {
                    TextView textView = (TextView) findViewById(R.id.results);
                    textView.setText(data.getStringExtra("three"));
                }
            }
        }
    }

    public void launchActivity2 (View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivityForResult(intent, 220);
    }

    public void launchActivity3 (View view) {
        Intent intent = new Intent(MainActivity.this, Activity3.class);
        startActivityForResult(intent, 330);
    }

    public void launchBrowser(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String url = "http://www.google.com";
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void locationSearch (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(MainActivity.this, "You need Google Maps for it to work", Toast.LENGTH_SHORT).show();
        }
    }
}
