package com.example.mdasifulislam.calcs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by md.asifulislam on 9/30/16.
 */
public class History extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);


    }


    public void back(View view){
        Intent i=new Intent(History.this,MainActivity1.class);
        startActivity(i);


    }
}