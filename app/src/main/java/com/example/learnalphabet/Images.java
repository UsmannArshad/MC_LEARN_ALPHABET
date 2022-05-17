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
        String alphabet=intent.getStringExtra("Alphabet");
        switch(alphabet){
            case "A":
                view.setImageResource(R.drawable.apple);
                textView.setText("Apple");
                break;
            case "B":
                view.setImageResource(R.drawable.boy);
                textView.setText("Boy");
                break;
            case "C":
                view.setImageResource(R.drawable.cat);
                textView.setText("Cat");
                break;
            case "D":
                view.setImageResource(R.drawable.duck);
                textView.setText("Duck");
                break;
            case "E":
                view.setImageResource(R.drawable.elephant);
                textView.setText("Elephant");
                break;
            case "F":
                view.setImageResource(R.drawable.fish);
                textView.setText("Fish");
                break;
            case "G":
                view.setImageResource(R.drawable.grapes);
                textView.setText("Grapes");
                break;
            case "H":
                view.setImageResource(R.drawable.house);
                textView.setText("Hosue");
                break;
            case "I":
                view.setImageResource(R.drawable.icecream);
                textView.setText("Icecream");
                break;
            case "J":
                view.setImageResource(R.drawable.jeep);
                textView.setText("Jeep");
                break;
            case "K":
                view.setImageResource(R.drawable.kite);
                textView.setText("Kite");
                break;
            case "L":
                view.setImageResource(R.drawable.lion);
                textView.setText("Lion");
                break;
            case "M":
                view.setImageResource(R.drawable.moon);
                textView.setText("Moon");
                break;
            case "N":
                view.setImageResource(R.drawable.nest);
                textView.setText("Nest");
                break;
            case "O":
                view.setImageResource(R.drawable.owl);
                textView.setText("Owl");
                break;
            case "P":
                view.setImageResource(R.drawable.parrot);
                textView.setText("Parrot");
                break;
            case "Q":
                view.setImageResource(R.drawable.queen);
                textView.setText("Queen");
                break;
            case "R":
                view.setImageResource(R.drawable.rat);
                textView.setText("Rat");
                break;
            case "S":
                view.setImageResource(R.drawable.sun);
                textView.setText("Sun");
                break;
            case "T":
                view.setImageResource(R.drawable.tiger);
                textView.setText("Tiger");
                break;
            case "U":
                view.setImageResource(R.drawable.umbrella);
                textView.setText("Umbrella");
                break;
            case "V":
                view.setImageResource(R.drawable.van);
                textView.setText("Van");
                break;
            case "W":
                view.setImageResource(R.drawable.watcj);
                textView.setText("Watch");
                break;
            case "X":
                view.setImageResource(R.drawable.xray);
                textView.setText("X-Ray");
                break;
            case "Y":
                view.setImageResource(R.drawable.yolk);
                textView.setText("Yolk");
                break;
            case "Z":
                view.setImageResource(R.drawable.zebra);
                textView.setText("Zebra");
                break;
        }
    }
}