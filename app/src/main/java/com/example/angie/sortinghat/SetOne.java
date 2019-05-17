package com.example.angie.sortinghat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_one);
        final Button g1 = findViewById(R.id.btn_G1);
        final Button r1 = findViewById(R.id.btn_R1);
        final Button h1 = findViewById(R.id.btn_H1);
        final Button s1 = findViewById(R.id.btn_S1);

        g1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num1", 5); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

        r1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num1", 10); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

        h1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num1", 15); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

        s1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                Activity myActivity=(Activity)(v.getContext());
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(myActivity);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("num1", 20); //InputString: from the EditText
                editor.commit();
                startActivity(nextScreen);
            }
        });

    }
}