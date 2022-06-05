package com.example.learnalphabet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class TestActivity2 extends AppCompatActivity {
int image_id=0;
String correct_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        ArrayList<AlhabetInfo> arrayList=new ArrayList<>();
        int[] letter_a={R.drawable.apple,R.drawable.aeroplane,R.drawable.ant,R.drawable.axe,R.drawable.aligator};
        int[] letter_b={R.drawable.ball,R.drawable.banana,R.drawable.boat,R.drawable.boy,R.drawable.butterfly};
        int[] letter_c={R.drawable.cake,R.drawable.cap,R.drawable.car,R.drawable.cat,R.drawable.cup};
        int[] letter_d={R.drawable.diamond,R.drawable.dice,R.drawable.duck,R.drawable.door,R.drawable.dolphin};
        int[] letter_e={R.drawable.egg,R.drawable.elephant,R.drawable.envelope,R.drawable.eye,R.drawable.eraser};
        int[] letter_f={R.drawable.fire,R.drawable.fish,R.drawable.flag,R.drawable.frog,R.drawable.flower};
        int[] letter_g={R.drawable.gift,R.drawable.girl,R.drawable.giraffe,R.drawable.goat,R.drawable.grapes};
        int[] letter_h={R.drawable.hair,R.drawable.hat,R.drawable.hammer,R.drawable.house,R.drawable.horse};
        int[] letter_i={R.drawable.ice,R.drawable.ink,R.drawable.icecream,R.drawable.iron,R.drawable.igloo};
        int[] letter_j={R.drawable.jacket,R.drawable.jeep,R.drawable.jelly,R.drawable.jug,R.drawable.joker};
        int[] letter_k={R.drawable.key,R.drawable.king,R.drawable.keyboard,R.drawable.kite,R.drawable.knife};
        int[] letter_l={R.drawable.ladybug,R.drawable.leaf,R.drawable.lamp,R.drawable.lion,R.drawable.lollipop};
        int[] letter_m={R.drawable.magnet,R.drawable.mango,R.drawable.moon,R.drawable.mirror,R.drawable.monkey};
        int[] letter_n={R.drawable.needle,R.drawable.nest,R.drawable.net,R.drawable.nose,R.drawable.nuts};
        int[] letter_o={R.drawable.octagon,R.drawable.orange,R.drawable.onion,R.drawable.owl,R.drawable.octopus};
        int[] letter_p={R.drawable.panda,R.drawable.parrot,R.drawable.pencil,R.drawable.penguin,R.drawable.popcorn};
        int[] letter_q={R.drawable.quack,R.drawable.queen,R.drawable.queue,R.drawable.question,R.drawable.quill};
        int[] letter_r={R.drawable.radio,R.drawable.rat,R.drawable.rainbow,R.drawable.robot,R.drawable.rocket};
        int[] letter_s={R.drawable.scissors,R.drawable.soap,R.drawable.snake,R.drawable.star,R.drawable.sun};
        int[] letter_t={R.drawable.table,R.drawable.tiger,R.drawable.tree,R.drawable.train,R.drawable.turtle};
        int[] letter_u={R.drawable.ufo,R.drawable.umbrella,R.drawable.unicorn,R.drawable.utensils,R.drawable.uturn};
        int[] letter_v={R.drawable.van,R.drawable.vase,R.drawable.violin,R.drawable.volcano,R.drawable.vulture};
        int[] letter_w={R.drawable.watcj,R.drawable.well,R.drawable.watermelon,R.drawable.whale,R.drawable.whistle};
        int[] letter_x={R.drawable.xerox,R.drawable.xmax,R.drawable.xray,R.drawable.xylophone,R.drawable.axe};
        int[] letter_y={R.drawable.yak,R.drawable.yarn,R.drawable.yoga,R.drawable.yolk,R.drawable.yoyo};
        int[] letter_z={R.drawable.zebra,R.drawable.zero,R.drawable.zigzag,R.drawable.zip,R.drawable.zoo};
        Random random=new Random();
        int i=0;
        Boolean check=false;
        int[] selected_imgs=new int[4];
        String[] selected_names=new String[4];
        while (i!=4) {
            int random_letter = random.nextInt(27);
            int random_index = random.nextInt(5);
            check=false;
            switch (random_letter) {
                case 1:
                    image_id = letter_a[random_index];
                    break;
                case 2:
                    image_id = letter_b[random_index];
                    break;
                case 3:
                    image_id = letter_c[random_index];
                    break;
                case 4:
                    image_id = letter_d[random_index];
                    break;
                case 5:
                    image_id = letter_e[random_index];
                    break;
                case 6:
                    image_id = letter_f[random_index];
                    break;
                case 7:
                    image_id = letter_g[random_index];
                    break;
                case 8:
                    image_id = letter_h[random_index];
                    break;
                case 9:
                    image_id = letter_i[random_index];
                    break;
                case 10:
                    image_id = letter_j[random_index];
                    break;
                case 11:
                    image_id = letter_k[random_index];
                    break;
                case 12:
                    image_id = letter_l[random_index];
                    break;
                case 13:
                    image_id = letter_m[random_index];
                    break;
                case 14:
                    image_id = letter_n[random_index];
                    break;
                case 15:
                    image_id = letter_o[random_index];
                    break;
                case 16:
                    image_id = letter_p[random_index];
                    break;
                case 17:
                    image_id = letter_q[random_index];
                    break;
                case 18:
                    image_id = letter_r[random_index];
                    break;
                case 19:
                    image_id = letter_s[random_index];
                    break;
                case 20:
                    image_id = letter_t[random_index];
                    break;
                case 21:
                    image_id = letter_u[random_index];
                    break;
                case 22:
                    image_id = letter_v[random_index];
                    break;
                case 23:
                    image_id = letter_w[random_index];
                    break;
                case 24:
                    image_id = letter_x[random_index];
                    break;
                case 25:
                    image_id = letter_y[random_index];
                    break;
                case 26:
                    image_id = letter_z[random_index];
                    break;
            }
            for(int j=0;j<selected_imgs.length-1;j++)
            {
                if(image_id==selected_imgs[j])
                {
                    check=true;
                }
            }
            if(check==false) {
                String selected_name = getResources().getResourceEntryName(image_id);
                selected_imgs[i] = image_id;
                selected_names[i]=selected_name;
                arrayList.add(new AlhabetInfo(selected_name, image_id));
                i++;
            }
        }
        int asked_img_no=random.nextInt(4);
        correct_name = selected_names[asked_img_no];
        correct_name = correct_name.substring(0, 1).toUpperCase() + correct_name.substring(1).toLowerCase();
        TextView textView=findViewById(R.id.textView5);
        textView.setText("Which of the following is "+correct_name+" ?");
        ListView listView=findViewById(R.id.listview1);
        ListAdaptor_Test adaptor=new ListAdaptor_Test(this,0,arrayList);
        listView.setAdapter(adaptor);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(arrayList.get(i).name.equals(correct_name.toLowerCase()))
                {
                    Toast.makeText(TestActivity2.this,"heavy", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(TestActivity2.this,"False", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}