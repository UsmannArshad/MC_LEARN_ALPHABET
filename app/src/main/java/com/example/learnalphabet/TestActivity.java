package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Random random=new Random();
        int randno=random.nextInt(27);
        switch (randno){
            case 1:

        }
    }
}