package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainPage extends AppCompatActivity {
    private Button learnbutton,testbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        learnbutton=findViewById(R.id.learn);
        testbutton=findViewById(R.id.test);
        learnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        testbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPage.this,TestActivity.class);
                intent.putExtra("score",0.0);
                intent.putExtra("wrong",0.0);
                startActivity(intent);
            }
        });
    }
}