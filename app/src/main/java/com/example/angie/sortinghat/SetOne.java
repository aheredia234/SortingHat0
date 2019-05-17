package com.example.angie.sortinghat;

import android.content.Intent;
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
                nextScreen.putExtra("num1", 5);
                startActivity(nextScreen);
            }
        });

        r1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                nextScreen.putExtra("num1", 10);
                startActivity(nextScreen);
            }
        });

        h1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                nextScreen.putExtra("num1", 15);
                startActivity(nextScreen);
            }
        });

        s1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetOne.this, SetTwo.class);
                nextScreen.putExtra("num1", 20);
                startActivity(nextScreen);
            }
        });

    }
}