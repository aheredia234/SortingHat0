package com.example.angie.sortinghat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class SetFour extends AppCompatActivity {

    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private boolean wizard = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_four);
        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            num1 = extras.getInt("num1");
            num2 = extras.getInt("num2");
            num3 = extras.getInt("num3");
        }

        final Button next = findViewById(R.id.btnNext);
        final TextView name = findViewById(R.id.name);
        final Switch witchard = findViewById(R.id.switch1);


        if(witchard.isChecked())
        {
            Intent nextScreen = new Intent(SetFour.this, Result.class);
            nextScreen.putExtra("wizard",wizard);
        }
        else
        {
            wizard = false;
            Intent nextScreen = new Intent(SetFour.this, Result.class);
            nextScreen.putExtra("wizard",wizard);
        }
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(SetFour.this, Result.class);
                nextScreen.putExtra("Name", name.getText().toString());
                nextScreen.putExtra("num2", num2);
                nextScreen.putExtra("num1",num1);
                nextScreen.putExtra("num3",num3);
                startActivity(nextScreen);

            }
        });
    }
}
