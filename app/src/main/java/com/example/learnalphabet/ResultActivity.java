package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        Double correct_count=intent.getDoubleExtra("correct",0.0);
        Double wrong_count=intent.getDoubleExtra("wrong",0.0);
        Double total=correct_count+wrong_count;
        int correct_int= correct_count.intValue();
        int wrong_int=wrong_count.intValue();
        int total_int=total.intValue();
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        t3=findViewById(R.id.textView4);
        t1.setText("Question Asked:"+Integer.toString(total_int));
        t2.setText("Correct Answer:"+Integer.toString(correct_int));
        t3.setText("Wrong Answers:"+Integer.toString(wrong_int));
    }
}