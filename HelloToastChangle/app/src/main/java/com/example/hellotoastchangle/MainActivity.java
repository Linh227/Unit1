package com.example.hellotoastchangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button btnZero;
    private Button btnCount;
    private Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnZero = (Button) findViewById(R.id.button_zero);
        btnCount = (Button) findViewById(R.id.button_count);
        btnToast = (Button) findViewById(R.id.button_toast);
    }


    //Shows a Toast when the TOAST button is clicked.
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
        btnToast.setBackgroundColor(getColor(R.color.colorRed));
    }

    //Increment the number when the Count button is cliked
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        btnZero.setBackgroundColor(getColor(R.color.colorPink));
        btnCount.setBackgroundColor(getColor(R.color.colorGreen));

    }

    public void ChangleColor(View view) {
        if (mShowCount != null)
        mShowCount.setText(Integer.toString(0));
        btnZero.setBackgroundColor(getColor(R.color.colorGray));
        btnCount.setBackgroundColor(getColor(R.color.colorPrimary));
        btnToast.setBackgroundColor(getColor(R.color.colorPrimary));
        mCount = 0;

    }
}