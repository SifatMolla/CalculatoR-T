package com.example.mdasifulislam.calcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class History1 extends AppCompatActivity {

    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history1);
        String rec=getIntent().getStringExtra("h");
        t2=(TextView)findViewById(R.id.hh);
        t2.setText(rec);
    }


    public void back(View view){
        Intent i=new Intent(History1.this,MainActivity1.class);
        startActivity(i);

        finish();
    }

}
