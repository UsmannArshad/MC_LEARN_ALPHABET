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
                arrayList.add(new AlhabetInfo("Boy",R.drawable.boy));
                arrayList.add(new AlhabetInfo("Ball", R.drawable.ball));
                arrayList.add(new AlhabetInfo("Banana",R.drawable.banana));
                arrayList.add(new AlhabetInfo("Boat",R.drawable.boat));
                arrayList.add(new AlhabetInfo("Butterfly",R.drawable.butterfly));
                break;
            case "C":
                arrayList.add(new AlhabetInfo("Cat",R.drawable.cat));
                arrayList.add(new AlhabetInfo("Cake", R.drawable.cake));
                arrayList.add(new AlhabetInfo("Cap",R.drawable.cap));
                arrayList.add(new AlhabetInfo("Cup",R.drawable.cup));
                arrayList.add(new AlhabetInfo("Car",R.drawable.car));
                break;
            case "D":
                arrayList.add(new AlhabetInfo("Diamond",R.drawable.diamond));
                arrayList.add(new AlhabetInfo("Duck", R.drawable.duck));
                arrayList.add(new AlhabetInfo("Dice",R.drawable.dice));
                arrayList.add(new AlhabetInfo("Dolphin",R.drawable.dolphin));
                arrayList.add(new AlhabetInfo("Door",R.drawable.door));
                break;
            case "E":
                arrayList.add(new AlhabetInfo("Elephant",R.drawable.elephant));
                arrayList.add(new AlhabetInfo("Egg", R.drawable.egg));
                arrayList.add(new AlhabetInfo("Envelope",R.drawable.envelope));
                arrayList.add(new AlhabetInfo("Eye",R.drawable.eye));
                arrayList.add(new AlhabetInfo("Eraser",R.drawable.eraser));
                break;
            case "F":
                arrayList.add(new AlhabetInfo("Fish",R.drawable.fish));
                arrayList.add(new AlhabetInfo("Fire", R.drawable.fire));
                arrayList.add(new AlhabetInfo("Flag",R.drawable.flag));
                arrayList.add(new AlhabetInfo("Frog",R.drawable.frog));
                arrayList.add(new AlhabetInfo("Flower",R.drawable.flower));
                break;
            case "G":
                arrayList.add(new AlhabetInfo("Gift",R.drawable.gift));
                arrayList.add(new AlhabetInfo("Grapes", R.drawable.grapes));
                arrayList.add(new AlhabetInfo("Girl",R.drawable.girl));
                arrayList.add(new AlhabetInfo("Goat",R.drawable.goat));
                arrayList.add(new AlhabetInfo("Giraffe",R.drawable.giraffe));
                break;
            case "H":
                arrayList.add(new AlhabetInfo("Hair",R.drawable.hair));
                arrayList.add(new AlhabetInfo("House", R.drawable.house));
                arrayList.add(new AlhabetInfo("Hammer",R.drawable.hammer));
                arrayList.add(new AlhabetInfo("Hat",R.drawable.hat));
                arrayList.add(new AlhabetInfo("Horse",R.drawable.horse));
                break;
            case "I":
                arrayList.add(new AlhabetInfo("Icecream",R.drawable.icecream));
                arrayList.add(new AlhabetInfo("Ice", R.drawable.ice));
                arrayList.add(new AlhabetInfo("Ink",R.drawable.ink));
                arrayList.add(new AlhabetInfo("Igloo",R.drawable.igloo));
                arrayList.add(new AlhabetInfo("Iron",R.drawable.iron));
                break;
            case "J":
                arrayList.add(new AlhabetInfo("Jeep",R.drawable.jeep));
                arrayList.add(new AlhabetInfo("Jacket", R.drawable.jacket));
                arrayList.add(new AlhabetInfo("Jelly",R.drawable.jelly));
                arrayList.add(new AlhabetInfo("Jug",R.drawable.jug));
                arrayList.add(new AlhabetInfo("Joker",R.drawable.joker));
                break;
            case "K":
                arrayList.add(new AlhabetInfo("Kite",R.drawable.kite));
                arrayList.add(new AlhabetInfo("Key", R.drawable.key));
                arrayList.add(new AlhabetInfo("Keyboard",R.drawable.keyboard));
                arrayList.add(new AlhabetInfo("King",R.drawable.king));
                arrayList.add(new AlhabetInfo("Knife",R.drawable.knife));
                break;
            case "L":
                arrayList.add(new AlhabetInfo("Lion",R.drawable.lion));
                arrayList.add(new AlhabetInfo("Ladybug", R.drawable.ladybug));
                arrayList.add(new AlhabetInfo("Lamp",R.drawable.lamp));
                arrayList.add(new AlhabetInfo("Lollipop",R.drawable.lollipop));
                arrayList.add(new AlhabetInfo("Leaf",R.drawable.leaf));
                break;
            case "M":
                arrayList.add(new AlhabetInfo("Magnet",R.drawable.magnet));
                arrayList.add(new AlhabetInfo("Moon", R.drawable.moon));
                arrayList.add(new AlhabetInfo("Mango",R.drawable.mango));
                arrayList.add(new AlhabetInfo("Mirror",R.drawable.mirror));
                arrayList.add(new AlhabetInfo("Monkey",R.drawable.monkey));
                break;
            case "N":
                arrayList.add(new AlhabetInfo("Nest",R.drawable.nest));
                arrayList.add(new AlhabetInfo("Needle", R.drawable.needle));
                arrayList.add(new AlhabetInfo("Net",R.drawable.net));
                arrayList.add(new AlhabetInfo("Nose",R.drawable.nose));
                arrayList.add(new AlhabetInfo("Nuts",R.drawable.nuts));
                break;
            case "O":
                arrayList.add(new AlhabetInfo("Owl",R.drawable.owl));
                arrayList.add(new AlhabetInfo("Octagon", R.drawable.octagon));
                arrayList.add(new AlhabetInfo("Octopus",R.drawable.octopus));
                arrayList.add(new AlhabetInfo("Orange",R.drawable.orange));
                arrayList.add(new AlhabetInfo("Onion",R.drawable.onion));
                break;
            case "P":
                arrayList.add(new AlhabetInfo("Parrot",R.drawable.parrot));
                arrayList.add(new AlhabetInfo("Panda", R.drawable.panda));
                arrayList.add(new AlhabetInfo("Pencil",R.drawable.pencil));
                arrayList.add(new AlhabetInfo("Penguin",R.drawable.penguin));
                arrayList.add(new AlhabetInfo("Popcorn",R.drawable.popcorn));
                break;
            case "Q":
                arrayList.add(new AlhabetInfo("Queen",R.drawable.queen));
                arrayList.add(new AlhabetInfo("Quack", R.drawable.quack));
                arrayList.add(new AlhabetInfo("QuestionMark",R.drawable.question));
                arrayList.add(new AlhabetInfo("Queue",R.drawable.queue));
                arrayList.add(new AlhabetInfo("Quill",R.drawable.quill));
                break;
            case "R":
                arrayList.add(new AlhabetInfo("Rat",R.drawable.rat));
                arrayList.add(new AlhabetInfo("Radio", R.drawable.radio));
                arrayList.add(new AlhabetInfo("Rainbow",R.drawable.rainbow));
                arrayList.add(new AlhabetInfo("Robot",R.drawable.robot));
                arrayList.add(new AlhabetInfo("Rocket",R.drawable.rocket));
                break;
            case "S":
                arrayList.add(new AlhabetInfo("Soap",R.drawable.soap));
                arrayList.add(new AlhabetInfo("Scissors", R.drawable.scissors));
                arrayList.add(new AlhabetInfo("Sun",R.drawable.sun));
                arrayList.add(new AlhabetInfo("Star",R.drawable.star));
                arrayList.add(new AlhabetInfo("Snake",R.drawable.snake));
                break;
            case "T":
                arrayList.add(new AlhabetInfo("Tiger",R.drawable.tiger));
                arrayList.add(new AlhabetInfo("Table", R.drawable.table));
                arrayList.add(new AlhabetInfo("Tree",R.drawable.tree));
                arrayList.add(new AlhabetInfo("Train",R.drawable.train));
                arrayList.add(new AlhabetInfo("Turtle",R.drawable.turtle));
                break;
            case "U":
                arrayList.add(new AlhabetInfo("Umbrella",R.drawable.umbrella));
                arrayList.add(new AlhabetInfo("UFO", R.drawable.ufo));
                arrayList.add(new AlhabetInfo("Unicorn",R.drawable.unicorn));
                arrayList.add(new AlhabetInfo("Utensils",R.drawable.utensils));
                arrayList.add(new AlhabetInfo("U-Turn",R.drawable.uturn));
                break;
            case "V":
                arrayList.add(new AlhabetInfo("Vase",R.drawable.vase));
                arrayList.add(new AlhabetInfo("Van", R.drawable.van));
                arrayList.add(new AlhabetInfo("Violin",R.drawable.violin));
                arrayList.add(new AlhabetInfo("Vulture",R.drawable.vulture));
                arrayList.add(new AlhabetInfo("Volcano",R.drawable.volcano));
                break;
            case "W":
                arrayList.add(new AlhabetInfo("Watch",R.drawable.watcj));
                arrayList.add(new AlhabetInfo("Watermelon", R.drawable.watermelon));
                arrayList.add(new AlhabetInfo("Whistle",R.drawable.whistle));
                arrayList.add(new AlhabetInfo("Whale",R.drawable.whale));
                arrayList.add(new AlhabetInfo("Well",R.drawable.well));
                break;
            case "X":
                arrayList.add(new AlhabetInfo("Xerox",R.drawable.xerox));
                arrayList.add(new AlhabetInfo("X-ray", R.drawable.xray));
                arrayList.add(new AlhabetInfo("Xmas",R.drawable.xmax));
                arrayList.add(new AlhabetInfo("Xylophone",R.drawable.xylophone));
                break;
            case "Y":
                arrayList.add(new AlhabetInfo("Yak",R.drawable.yak));
                arrayList.add(new AlhabetInfo("Yolk", R.drawable.yolk));
                arrayList.add(new AlhabetInfo("Yarn",R.drawable.yarn));
                arrayList.add(new AlhabetInfo("Yoga",R.drawable.yoga));
                arrayList.add(new AlhabetInfo("Yoyo",R.drawable.yoyo));
                break;
            case "Z":
                arrayList.add(new AlhabetInfo("Zero",R.drawable.zero));
                arrayList.add(new AlhabetInfo("Zebra", R.drawable.zebra));
                arrayList.add(new AlhabetInfo("Zigzag",R.drawable.zigzag));
                arrayList.add(new AlhabetInfo("Zip",R.drawable.zip));
                arrayList.add(new AlhabetInfo("Zoo",R.drawable.zoo));
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