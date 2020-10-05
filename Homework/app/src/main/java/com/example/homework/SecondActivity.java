package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    public static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.textview_count);
        Intent intent = getIntent();
        int message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);
        Log.d(TAG, "onCreate: " + message);
        textView.setText(String.valueOf(message));
    }
}