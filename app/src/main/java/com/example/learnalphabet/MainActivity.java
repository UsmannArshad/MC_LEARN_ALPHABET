package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button clickedbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AlphabetClicked(View v)
    {
        switch(v.getId())
        {
            case R.id.button30:
                clickedbtn=findViewById(R.id.button30);
                break;
            case R.id.button29:
                clickedbtn=findViewById(R.id.button29);
                break;
            case R.id.button28:
                clickedbtn=findViewById(R.id.button28);
                break;
            case R.id.button27:
                clickedbtn=findViewById(R.id.button27);
                break;
            case R.id.button26:
                clickedbtn=findViewById(R.id.button26);
                break;
            case R.id.button25:
                clickedbtn=findViewById(R.id.button25);
                break;
            case R.id.button24:
                clickedbtn=findViewById(R.id.button24);
                break;
            case R.id.button23:
                clickedbtn=findViewById(R.id.button23);
                break;
            case R.id.button22:
                clickedbtn=findViewById(R.id.button22);
                break;
            case R.id.button21:
                clickedbtn=findViewById(R.id.button21);
                break;
            case R.id.button20:
                clickedbtn=findViewById(R.id.button20);
                break;
                case R.id.button19:
            clickedbtn=findViewById(R.id.button19);
            break;
            case R.id.button18:
            clickedbtn=findViewById(R.id.button18);
            break;
            case R.id.button17:
                clickedbtn=findViewById(R.id.button17);
                break;
            case R.id.button16:
                clickedbtn=findViewById(R.id.button16);
                break;
            case R.id.button15:
                clickedbtn=findViewById(R.id.button15);
                break;
            case R.id.button14:
                clickedbtn=findViewById(R.id.button14);
                break;
            case R.id.button13:
                clickedbtn=findViewById(R.id.button13);
                break;
            case R.id.button12:
                clickedbtn=findViewById(R.id.button12);
                break;
            case R.id.button11:
                clickedbtn=findViewById(R.id.button11);
                break;
            case R.id.button10:
                clickedbtn=findViewById(R.id.button10);
                break;
            case R.id.button9:
                clickedbtn=findViewById(R.id.button9);
                break;
            case R.id.button8:
                clickedbtn=findViewById(R.id.button8);
                break;
            case R.id.button7:
                clickedbtn=findViewById(R.id.button7);
                break;
            case R.id.button6:
                clickedbtn=findViewById(R.id.button6);
                break;
            case R.id.button:
                clickedbtn=findViewById(R.id.button);
                break;
        }
        Intent intent=new Intent(MainActivity.this,ListOfImage.class);
        intent.putExtra("Alphabet",clickedbtn.getText().toString());
        startActivity(intent);
    }
}