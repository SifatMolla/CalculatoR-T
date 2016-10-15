package com.example.mdasifulislam.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    TextView t1, textView;
    Button b1;
    EditText editText;
    double i=0;
    double num=0;
    String string = "";
    Character op = 'o';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        t1 = (TextView) findViewById(R.id.te);
        b1 = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(editText.getText());
            }
        });
        textView=(TextView)findViewById(R.id.textView);
    }




    public void button1(View V) {
        insert("1");

    }

    public void button2(View V) {
        insert("2");
    }

    public void button3(View V) {
        insert("3");
    }

    public void button4(View V) {
        insert("4");
    }

    public void button5(View V) {
        insert("5");
    }

    public void button6(View V) {
        insert("6");
    }

    public void button7(View V) {
        insert("7");
    }

    public void button8(View V) {
        insert("8");
    }

    public void button9(View V) {
        insert("9");
    }

    public void button0(View V) {
        insert("0");
    }


    public void buttonDecimal(View V) {
        insert(".");
    }

    public void buttonEqual(View V) {
        calculate();


    }

    public void buttonMinus(View V) {
        operation();
        op='-';
    }

    public void buttonPlus(View V) {
        operation();
        op='+';
    }

    public void buttonMultiple(View V) {
        operation();
        op='*';
    }

    public void buttonDivide(View V) {
        operation();
        op='/';
    }

   public void justClear(View V) {

        if(i==0.0 && op=='o'){
            string="";
            num=0.0;
            i=0.0;
            op='o';
            textView.setText("");
        }else{
            string="";
            num=0.0;
            textView.setText("");

        }
    }
    public void allClear(View V) {

        string="";
        num=0.0;
        i=0.0;
        op='o';
        textView.setText("");
    }

    public void insert(String j) {
        string += j;
        num = Double.valueOf(string);
        textView.setText(string);


    }

    public void operation() {
        string = "";
        i = num;
        textView.setText("");

    }

    public void calculate() {

        if(op=='+'){

            num=i+num;
        }
        else if (op=='-'){
            num=i-num;
        }
        else if (op=='/'){
           // num=i/num;
            try{
                num=i/num;
            }catch (Exception e){
          string="something wrong";
            }

        }
        else if (op=='*'){
            num=i*num;
        }
        textView.setText(""+num);
        string="";
        num=0.0;
        i=0.0;
        op='o';
        

    }



    public void history(View view) {
        String h=textView.getText().toString();
        Intent i=new Intent(MainActivity1.this,History1.class);
        i.putExtra("h", h);
        startActivity(i);


    }

}
