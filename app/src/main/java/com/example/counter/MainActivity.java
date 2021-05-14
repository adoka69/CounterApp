package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView CounterText;
    private Button CounterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CounterText = findViewById(R.id.CounterText);
        CounterButton = findViewById(R.id.CounterButton);
        int counter =1;
        CounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String score = String.valueOf(CounterText.getText());
                score=String.valueOf(Integer.parseInt(score)+1);
                if(Integer.parseInt(score)>0&&Integer.parseInt(score)<10){
                    CounterText.setText("000"+score);
                }
                else if(Integer.parseInt(score)>9&&Integer.parseInt(score)<100){
                    CounterText.setText("00"+score);
                }
                else if(Integer.parseInt(score)>99&&Integer.parseInt(score)<1000){
                    CounterText.setText("0"+score);
                }
                else if(Integer.parseInt(score)>999&&Integer.parseInt(score)<10000){
                    CounterText.setText("0"+score);
                }
                else if(Integer.parseInt(score)<=9999){
                    CounterText.setText("9999");
                }



            }

        });
    }
}