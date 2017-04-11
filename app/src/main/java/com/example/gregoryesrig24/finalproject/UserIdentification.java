package com.example.gregoryesrig24.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

/**
 * Created by gregoryesrig24 on 4/10/17.
 */

public class UserIdentification extends AppCompatActivity {

    private Button givingbtn, receivingbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userident);

        givingbtn = (Button) findViewById(R.id.btn_donator);
        receivingbtn = (Button) findViewById(R.id.btn_receiver);


        givingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserIdentification.this, GiveProfile.class));
            }
        });

        receivingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserIdentification.this, GetProfile.class));
            }
        });




    }


}
