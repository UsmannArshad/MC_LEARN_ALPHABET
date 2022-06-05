package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_image);
        Intent intent=getIntent();
        String alphabet=intent.getStringExtra("Alphabet");
        ArrayList<AlhabetInfo> arrayList=new ArrayList<>();
        switch(alphabet)
        {
            case "A":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.apple));
                arrayList.add(new AlhabetInfo("Boy", R.drawable.boy));
                arrayList.add(new AlhabetInfo("Apple",R.drawable.apple));
                arrayList.add(new AlhabetInfo("Boy",R.drawable.boy));
                arrayList.add(new AlhabetInfo("Apple",R.drawable.apple));
                break;
        }
        ListView listView=findViewById(R.id.listview);
        ListAdaptor adaptor=new ListAdaptor(this,0,arrayList);
        listView.setAdapter(adaptor);
    }
}