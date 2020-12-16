package com.example.p0101_listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // создание обработчика
        View.OnClickListener oclBtn = v -> {
            // по Id определяем кнопку, вызвавшую этот обработчик
            switch (v.getId()) {
                case R.id.btnOk:
                    // кнопка Ок
                    tvOut.setText("Нажата кнопка ОК");
                    break;
                case R.id.btnCancel:
                    // кнопка Cancel
                    tvOut.setText("Нажата кнопка Cancel");
                    break;
            }

        };
        btnCancel.setOnClickListener(oclBtn);
        btnOk.setOnClickListener(oclBtn);
    }
}