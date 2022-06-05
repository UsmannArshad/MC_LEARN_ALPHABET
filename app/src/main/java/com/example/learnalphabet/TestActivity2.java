package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TestActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        ArrayList<AlhabetInfo> arrayList=new ArrayList<>();
        arrayList.add(new AlhabetInfo("Apple",R.drawable.apple));
        arrayList.add(new AlhabetInfo("Alligator", R.drawable.aligator));
        arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.aeroplane));
        arrayList.add(new AlhabetInfo("Ant",R.drawable.ant));
        arrayList.add(new AlhabetInfo("Axe",R.drawable.axe));

        ListView listView=findViewById(R.id.listview1);
        ListAdaptor_Test adaptor=new ListAdaptor_Test(this,0,arrayList);
        listView.setAdapter(adaptor);
    }
}