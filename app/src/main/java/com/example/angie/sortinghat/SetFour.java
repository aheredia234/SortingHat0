package com.example.angie.sortinghat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class SetFour extends AppCompatActivity {

    private boolean wizard = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_four);


        final Button next = findViewById(R.id.btnNext);
        final TextView name = findViewById(R.id.name);
        final Switch witchard = findViewById(R.id.switch1);


        if(witchard.isChecked())
        {
            wizard = true;
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
                if(name.getText().toString().isEmpty())
                {
                    name.setError("Invalid First Name");
                    name.requestFocus();
                }
                startActivity(nextScreen);

            }
        });

    }
}
