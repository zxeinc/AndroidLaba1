package com.example.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class HelloActivity extends Activity {

    final int[] count1 = {0};
    final int[] count2 = {0};
    public void btnAction(int[] ct,int[] ct2,  Button btn1, TextView txt1){

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloact);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView text1 = findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1[0]++;
                button1.setText("" + count1[0]);
                text1.setText(count1[0] + " : "+count2[0]);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2[0]++;
                button2.setText("" + count2[0]);
                text1.setText(count1[0] + " : "+count2[0]);

            }
        });

    }
}
