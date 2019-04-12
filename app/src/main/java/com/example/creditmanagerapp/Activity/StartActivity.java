package com.example.creditmanagerapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.creditmanagerapp.R;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    private Button allUsers, allTransfers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        allUsers = findViewById(R.id.all_users_button);
        allTransfers = findViewById(R.id.all_transfers_button);
        allUsers.setOnClickListener(this);
        allTransfers.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.all_users_button : {
                startActivity(new Intent(this, AllUser.class));
            } break;

            case R.id.all_transfers_button : {
                startActivity(new Intent(this, MyTransfers.class));
            }break;
        }
    }
}