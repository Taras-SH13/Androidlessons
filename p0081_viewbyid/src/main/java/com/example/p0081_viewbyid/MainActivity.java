package com.example.p0081_viewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("This is list of adapters");

        Button myButton = (Button) findViewById(R.id.button);
        myButton.setText("Send");
        myButton.setEnabled(true);
        CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox.setChecked(true);
    }
}