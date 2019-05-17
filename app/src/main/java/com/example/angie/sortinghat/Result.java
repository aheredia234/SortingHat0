package com.example.angie.sortinghat;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class Result extends AppCompatActivity {

    private int num3;
    private int num2;
    private int num1;
    private int[] mesh = new int[3];
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private int count4 = 0;
    private boolean wiz = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final TextView gen = findViewById(R.id.txtgen);
        final TextView name = findViewById(R.id.theirName);
        final TextView result = findViewById(R.id.result);
        final ImageView gry = findViewById(R.id.imgGryff);
        final ImageView rav = findViewById(R.id.imgRav);
        final ImageView huf = findViewById(R.id.imgHuff);
        final ImageView sly = findViewById(R.id.imgSly);


        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            name.setText(extras.getString("Name"));
            wiz = extras.getBoolean("wizard");
        }


        if(wiz == true)
            gen.setText("Wizard");
        else
            gen.setText("Witch");
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        num1 = prefs.getInt("num1",11);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        num2 = prefs.getInt("num2",11);
        SharedPreferences pre = PreferenceManager.getDefaultSharedPreferences(this);
        num3 = prefs.getInt("num3",11);
        mesh[0]=num1;
        mesh[1]=num2;
        mesh[2]=num3;
        for(int i = 0; i < 3; i++)
        {
            if(mesh[i]==5)
                count1 = count1+1;
            if(mesh[i]==10)
                count2 = count2+1;
            if(mesh[i]==15)
                count3 = count3+1;
            if(mesh[i]==20)
                count4 = count4+1;
        }
        int[] nob = new int[4];
        nob[0]= count1;
        nob[1]= count2;
        nob[2]= count3;
        nob[3]= count4;


            Arrays.sort(nob);

        if(nob[3]==count1)//if the last number in the array (highest number picked after sorted) = count 1 which tracks gryffindor
        {
            result.setText("Gryffindor");
            gry.setVisibility(View.VISIBLE);
        }
        else if (nob[3]==count2)
        {
            result.setText("Ravenclaw");
            rav.setVisibility(View.VISIBLE);
        }
        else if (nob[3]==count3)
        {
            result.setText("Hufflepuff");
            huf.setVisibility(View.VISIBLE);
        }
        else
        {
            result.setText("Slytherin");
            sly.setVisibility(View.VISIBLE);
        }

    }
}
