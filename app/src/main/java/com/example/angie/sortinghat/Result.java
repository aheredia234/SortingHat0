package com.example.angie.sortinghat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final TextView result = findViewById(R.id.result);
        final ImageView gry = findViewById(R.id.imgGryff);
        final ImageView rav = findViewById(R.id.imgRav);
        final ImageView huf = findViewById(R.id.imgHuff);
        final ImageView sly = findViewById(R.id.imgSly);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            num = extras.getInt("j");
        }
        num = num/2;
        if(num < 6)
        {
            result.setText("Gryffindor");
            gry.setVisibility(View.VISIBLE);
        }
        else if (num < 11)
        {
            result.setText("Ravenclaw");
            rav.setVisibility(View.VISIBLE);
        }
        else if (num < 16)
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
