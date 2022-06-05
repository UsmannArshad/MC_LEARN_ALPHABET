package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Images extends AppCompatActivity {

    private ImageView view;
    private TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        view=findViewById(R.id.imageView2);
        textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        String img_name=intent.getStringExtra("img_name");
        int img_id=Integer.parseInt(intent.getStringExtra("img_id"));
        view.setImageResource(img_id);
        textView.setText(img_name);
    }
}