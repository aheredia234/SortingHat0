package com.example.angie.sortinghat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SetThree extends AppCompatActivity {
    private int num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_three);

        final RadioButton potions = findViewById(R.id.rdBtnPotions);
        final RadioButton trans = findViewById(R.id.rdBtnTrans);
        final RadioButton charms = findViewById(R.id.rdBtnCharms);
        final RadioButton defense = findViewById(R.id.rdBtnDef);

        if(potions.isChecked())
        {
            num3 = 20;
            Intent nextScreen = new Intent(SetThree.this, SetFour.class);

            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("num3", 20); //InputString: from the EditText
            editor.commit();
        }
        if(trans.isChecked())
        {
            num3 = 10;
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("num3", 10); //InputString: from the EditText
            editor.commit();
        }
        if(charms.isChecked())
        {
            num3 = 15;
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("num3", 10); //InputString: from the EditText
            editor.commit();
        }
        if(defense.isChecked())
        {
            num3 = 5;
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("num3", 5); //InputString: from the EditText
            editor.commit();;
        }


        final Button next = findViewById(R.id.btnNext2);

        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetThree.this, SetFour.class);
                startActivity(nextScreen);
            }
        });
    }
}
