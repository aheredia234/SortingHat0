package com.example.angie.sortinghat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SetTwo extends AppCompatActivity {

    private int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_two);

        final ImageButton g2 = findViewById(R.id.imgG);
        final ImageButton r2 = findViewById(R.id.imgR);
        final ImageButton h2 = findViewById(R.id.imgH);
        final ImageButton s2 = findViewById(R.id.imgS);


        g2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2 = 5;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num2", 5); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

        r2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2= 10;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num2", 10); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

        h2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2 = 15;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num2", 15); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

        s2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2= 20;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num2", 20); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });
    }
}
