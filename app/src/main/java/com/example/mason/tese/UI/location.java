package com.example.mason.tese.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.mason.tese.R;

public class location extends AppCompatActivity {

    private ImageButton mHouse1Button;
    private ImageButton mHouse2Button;
    private ImageButton mHouse3Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        mHouse1Button = (ImageButton) findViewById(R.id.house1Button);
        mHouse2Button = (ImageButton) findViewById(R.id.house2Button);
        mHouse3Button = (ImageButton) findViewById(R.id.house3Button);

        mHouse1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(location.this, HouseActivity.class);
                startActivity(intent);

            }
        });

        mHouse2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(location.this, HouseActivity.class);
                startActivity(intent);

            }
        });

        mHouse3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(location.this, HouseActivity.class);
                startActivity(intent);

            }
        });



    }
}
