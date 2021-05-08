package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Show toast onClick handler called", Toast.LENGTH_LONG);
        toast.show();
    }

    public void incrementCount(View view) {
        ++count;
        if(mShowCount!=null) {
            mShowCount.setText(Integer.toString(count));
        }
    }
}