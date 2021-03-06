package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainPage extends AppCompatActivity {
    private Button learnbutton,testbutton,repobutton,checkbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        learnbutton=findViewById(R.id.learn);
        testbutton=findViewById(R.id.test);
        repobutton=findViewById(R.id.repo);
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
                Intent intent=new Intent(MainPage.this,TestSelectActivity.class);
                startActivity(intent);
            }
        });
        repobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://github.com/UsmannArshad/MC_LEARN_ALPHABET";
                Uri webpage=Uri.parse(url);
                Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(intent);
            }
        });
    }
}