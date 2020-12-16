package com.example.p0102activitylistener2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnStart;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        btnStart = (Button) findViewById(R.id.buttonStart);
        btnStop = (Button) findViewById(R.id.buttonStop);

    }


    public void onClickBtn(View v) {
        switch (v.getId()) {
            case R.id.buttonStart:
                // кнопка ОК
                textView.setText("Стартуем!!!");
                break;
            case R.id.buttonStop:
                // кнопка Cancel
                textView.setText("Тормозим!!!");
                break;

        }
    }
}