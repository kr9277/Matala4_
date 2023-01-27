package com.example.matala4_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView iv;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        iv = findViewById(R.id.ImageView);
    }
    public void kk(View view){
        Random rnd = new Random();
        int num = rnd.nextInt(3) + 1;
        button.setText("Click number: " + num);
        switch (num) {
            case 1:
                iv.setImageResource(R.drawable.one);
                break;
            case 2:
                iv.setImageResource(R.drawable.cattow);
                break;
            case 3:
                iv.setImageResource(R.drawable.dogthree);
                break;
        }
    }
}

