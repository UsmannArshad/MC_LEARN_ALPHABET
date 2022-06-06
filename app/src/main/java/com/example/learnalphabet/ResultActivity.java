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
        String correct_count=intent.getStringExtra("score");
        String wrong_count=intent.getStringExtra("wrong");
        int correct_int= Integer.parseInt(correct_count);
        int wrong_int=Integer.parseInt(wrong_count);
        int total=correct_int+wrong_int;
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        t3=findViewById(R.id.textView4);
        t1.setText("Question Asked:"+Integer.toString(total));
        t2.setText("Correct Answer:"+Integer.toString(correct_int));
        t3.setText("Wrong Answers:"+Integer.toString(wrong_int));
    }
}