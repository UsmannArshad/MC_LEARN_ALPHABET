package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.widget.ImageView;

public class TestActivity extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        img=findViewById(R.id.imageView4);
        String[] arr=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Boolean[] boolarr=new Boolean[26];
        String[] other=new String[3];
        String correctans="";
        Random random=new Random();
        int index=0;
        int randno=random.nextInt(27);
        for(int i=0;i<26;i++)
        {
            if(i==randno-1)
            {
                correctans=arr[i];
                boolarr[i]=true;
            }
        }
        while(true)
        {
            int randnos=random.nextInt(27);
            if(boolarr[randnos-1]==false)
            {
                other[index]=arr[randnos-1];
                index++;
            }
            if(index==3)
            {
                break;
            }
        }
        switch (randno){
            case 1:
                img.setImageResource(R.drawable.apple);
                break;
            case 2:
                img.setImageResource(R.drawable.boy);
                break;
            case 3:
                img.setImageResource(R.drawable.cat);
                break;
            case 4:
                img.setImageResource(R.drawable.duck);
                break;
            case 5:
                img.setImageResource(R.drawable.elephant);
                break;
            case 6:
                img.setImageResource(R.drawable.fish);
                break;
            case 7:
                img.setImageResource(R.drawable.grapes);
                break;
            case 8:
                img.setImageResource(R.drawable.house);
                break;
            case 9:
                img.setImageResource(R.drawable.icecream);
                break;
            case 10:
                img.setImageResource(R.drawable.jeep);
                break;
            case 11:
                img.setImageResource(R.drawable.kite);
                break;
            case 12:
                img.setImageResource(R.drawable.lion);
                break;
            case 13:
                img.setImageResource(R.drawable.moon);
                break;
            case 14:
                img.setImageResource(R.drawable.nest);
                break;
            case 15:
                img.setImageResource(R.drawable.owl);
                break;
            case 16:
                img.setImageResource(R.drawable.parrot);
                break;
            case 17:
                img.setImageResource(R.drawable.queen);
                break;
            case 18:
                img.setImageResource(R.drawable.rat);
                break;
            case 19:
                img.setImageResource(R.drawable.sun);
                break;
            case 20:
                img.setImageResource(R.drawable.tiger);
                break;
            case 21:
                img.setImageResource(R.drawable.umbrella);
                break;
            case 22:
                img.setImageResource(R.drawable.van);
                break;
            case 23:
                img.setImageResource(R.drawable.watcj);
                break;
            case 24:
                img.setImageResource(R.drawable.xray);
                break;
            case 25:
                img.setImageResource(R.drawable.yolk);
                break;
            case 26:
                img.setImageResource(R.drawable.zebra);
                break;
        }
    }
}