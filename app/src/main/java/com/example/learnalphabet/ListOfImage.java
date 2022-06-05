package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.aligator));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.aeroplane));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.ant));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.axe));
                break;
            case "B":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.boy));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.ball));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.banana));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.boat));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.butterfly));
                break;
            case "C":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.cat));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.cake));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.cap));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.cup));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.car));
                break;
            case "D":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.diamond));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.duck));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.dice));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.dolphin));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.door));
                break;
            case "E":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.elephant));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.egg));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.envelope));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.eye));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.eraser));
                break;
            case "F":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.fish));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.fire));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.flag));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.frog));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.flower));
                break;
            case "G":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.gift));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.grapes));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.girl));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.goat));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.giraffe));
                break;
            case "H":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.hair));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.house));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.hammer));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.hat));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.horse));
                break;
            case "I":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.icecream));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.ice));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.ink));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.igloo));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.iron));
                break;
            case "J":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.jeep));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.jacket));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.jelly));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.jug));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.joker));
                break;
            case "K":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.kite));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.key));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.keyboard));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.king));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.knife));
                break;
            case "L":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.lion));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.ladybug));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.lamp));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.lollipop));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.leaf));
                break;
            case "M":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.magnet));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.moon));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.mango));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.mirror));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.monkey));
                break;
            case "N":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.nest));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.needle));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.net));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.nose));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.nuts));
                break;
            case "O":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.owl));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.octagon));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.octopus));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.orange));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.onion));
                break;
            case "P":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.parrot));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.panda));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.pencil));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.penguin));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.popcorn));
                break;
            case "Q":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.queen));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.quack));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.question));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.queue));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.quill));
                break;
            case "R":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.rat));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.radio));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.rainbow));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.robot));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.rocket));
                break;
            case "S":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.soap));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.scissors));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.sun));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.star));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.snake));
                break;
            case "T":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.tiger));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.table));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.tree));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.train));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.turtle));
                break;
            case "U":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.umbrella));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.ufo));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.unicorn));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.utensils));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.uturn));
                break;
            case "V":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.vase));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.van));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.violin));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.vulture));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.volcano));
                break;
            case "W":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.watcj));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.watermelon));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.whistle));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.whale));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.well));
                break;
            case "X":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.xerox));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.xray));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.xmax));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.xylophone));
                break;
            case "Y":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.yak));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.yolk));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.yarn));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.yoga));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.yoyo));
                break;
            case "Z":
                arrayList.add(new AlhabetInfo("Apple",R.drawable.zero));
                arrayList.add(new AlhabetInfo("Alligator", R.drawable.zebra));
                arrayList.add(new AlhabetInfo("Aeroplane",R.drawable.zigzag));
                arrayList.add(new AlhabetInfo("Ant",R.drawable.zip));
                arrayList.add(new AlhabetInfo("Axe",R.drawable.zoo));
                break;
        }
        ListView listView=findViewById(R.id.listview);
        ListAdaptor adaptor=new ListAdaptor(this,0,arrayList);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(ListOfImage.this,Images.class);
                intent.putExtra("img_id",Integer.toString(arrayList.get(i).imageid));
                intent.putExtra("img_name",arrayList.get(i).name);
                startActivity(intent);
            }
        });
    }
}