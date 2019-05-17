package com.example.angie.sortinghat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SetTwo extends AppCompatActivity {

    private int num1 =0;
    private int num2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_two);

        final ImageButton g2 = findViewById(R.id.imgG);
        final ImageButton r2 = findViewById(R.id.imgR);
        final ImageButton h2 = findViewById(R.id.imgH);
        final ImageButton s2 = findViewById(R.id.imgS);

        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            num1 = extras.getInt("num1");
        }
        g2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2 = 5;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                nextScreen.putExtra("num2", num2);
                nextScreen.putExtra("num1",num1);
                startActivity(nextScreen);
            }
        });

        r2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2 = 10;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                nextScreen.putExtra("num2", num2);
                nextScreen.putExtra("num1",num1);
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
                nextScreen.putExtra("num2", num2);
                nextScreen.putExtra("num1",num1);
                startActivity(nextScreen);
            }
        });

        s2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2 = 20;
                Intent nextScreen = new Intent(SetTwo.this, SetThree.class);
                nextScreen.putExtra("num2", num2);
                nextScreen.putExtra("num1",num1);
                startActivity(nextScreen);
            }
        });
    }
}
