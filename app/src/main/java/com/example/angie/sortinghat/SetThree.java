package com.example.angie.sortinghat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SetThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_three);

        final RadioButton potions = findViewById(R.id.rdBtnPotions);
        final RadioButton trans = findViewById(R.id.rdBtnTrans);
        final RadioButton charms = findViewById(R.id.rdBtnCharms);
        final RadioButton defense = findViewById(R.id.rdBtnDef);

        final Button next = findViewById(R.id.btnNext2);

        next.setOnClickListener(new View.OnClickListener()
        {
            private int num3 = 0;
            private int num2 = 0;
            private int num1 = 0;
            @Override
            public void onClick(View v)
            {
                Intent nextScreen = new Intent(SetThree.this, SetFour.class);
                startActivity(nextScreen);

                Bundle extras = getIntent().getExtras();
                if(extras != null)
                {
                    num1 = extras.getInt("num1");
                    num2 = extras.getInt("num2");
                }


                if(potions.isChecked())
                {
                    num3 = 20;
                    nextScreen.putExtra("num2", num2);
                    nextScreen.putExtra("num1",num1);
                    nextScreen.putExtra("num3",num3);
                }
                if(trans.isChecked())
                {
                    num3 = 10;
                    nextScreen.putExtra("num2", num2);
                    nextScreen.putExtra("num1",num1);
                    nextScreen.putExtra("num3",num3);
                }
                if(charms.isChecked())
                {
                    num3 = 15;
                    nextScreen.putExtra("num2", num2);
                    nextScreen.putExtra("num1",num1);
                    nextScreen.putExtra("num3",num3);
                }
                if(defense.isChecked())
                {
                    num3 = 5;
                    nextScreen.putExtra("num2", num2);
                    nextScreen.putExtra("num1",num1);
                    nextScreen.putExtra("num3",num3);
                }
            }
        });
    }
}
