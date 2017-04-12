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

public class GiveProfile extends AppCompatActivity {

    private Button givingbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giveprofile);

        givingbtn = (Button) findViewById(R.id.giveButton);


        givingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiveProfile.this, SelectionActivity.class));
            }
        });






    }


}
