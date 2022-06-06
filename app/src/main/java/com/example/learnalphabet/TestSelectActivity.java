package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class TestSelectActivity extends AppCompatActivity {
ImageView imgView;
Button test1,test2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_select);
        imgView=findViewById(R.id.imageView9);
        test1=findViewById(R.id.button4);
        test2=findViewById(R.id.button5);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TestSelectActivity.this,TestActivity.class);
                intent.putExtra("score","0");
                intent.putExtra("wrong","0");
                startActivity(intent);
            }
        });
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TestSelectActivity.this,TestActivity2.class);
                intent.putExtra("score","0");
                intent.putExtra("wrong","0");
                startActivity(intent);
            }
        });
    }
}