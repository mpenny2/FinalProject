package com.example.gregoryesrig24.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.gregoryesrig24.finalproject.R.id.getButton;

/**
 * Created by gregoryesrig24 on 4/10/17.
 */

public class GetProfile extends AppCompatActivity {

    private Button getButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getprofile);
        getButton = (Button) findViewById(R.id.getButton);


        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetProfile.this, SelectionActivity.class));
            }
        });

    }
}
