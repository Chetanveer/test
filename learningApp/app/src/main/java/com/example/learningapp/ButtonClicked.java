package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ButtonClicked extends AppCompatActivity {
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_clicked);
        txt1 = (TextView)findViewById(R.id.textView);

       Bundle b1=  getIntent().getExtras();
       String s1 = b1.getString("user");
       txt1.setText(s1);
    }
}