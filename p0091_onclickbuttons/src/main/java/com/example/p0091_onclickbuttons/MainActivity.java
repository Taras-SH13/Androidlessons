package com.example.p0091_onclickbuttons;

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

        // найдем View элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // создаем обработчик нажатия

        View.OnClickListener oclBtnOk = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                tvOut.setText("Нажата кнопка OK");
            }
        };
        View.OnClickListener oclBtnCancel= v -> {
            //меняем текст в TextVie (tvOut)
            tvOut.setText("Нажата кнопка Cancel");
        };
        // присвоим обработчик кнопке ОК
        btnOk.setOnClickListener(oclBtnOk);
        // присвоим обработчик кнопке Cancel
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}