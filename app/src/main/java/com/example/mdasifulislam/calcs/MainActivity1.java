package com.example.mdasifulislam.calcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity1 extends AppCompatActivity {
  TextView t1=null, textView=null,textViewe=null;
    Button b1;
    EditText textView1,editText;
ScrollView scrollView;
    double i=0,num=0,full=0,ii=0,numnum=0,fulful=0;

    String string="",string2="",string3="";
    Character op = 'o',opop='o';
    int pi=0,too=0;


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main1);
//        t1 = (TextView) findViewById(R.id.te);
//        b1 = (Button) findViewById(R.id.button);
//        editText = (EditText) findViewById(R.id.editText);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                t1.setText(editText.getText());
//            }
//        });
        textViewe=(TextView) findViewById(R.id.textViewe);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        textView=(TextView) findViewById(R.id.textView);



        if (icicle != null){
            string = icicle.getString("params");
            string2 = icicle.getString("params2");
            string3 = icicle.getString("params3");
           num =icicle.getDouble("paramn");
           i =icicle.getDouble("parami");
           ii =icicle.getDouble("paramii");
           numnum =icicle.getDouble("paramnn");
           full =icicle.getDouble("paramf");
           fulful =icicle.getDouble("paramff ");
           pi =icicle.getInt("parampi");
           too =icicle.getInt("paramptoo");
           op =icicle.getChar("paramo");
           opop =icicle.getChar("paramoo");


        }
        if(string.equals("")&&too==0) {
            textView.setText("0");

        }else {textView.setText(string);}
        if(!op.equals('o')){
            textViewe.setText(i+""+op.toString());
            textView.setText(string);
        }else if(!string3.equals("")&&string.equals("")){
            textViewe.setText(string3);
            textView.setText(""+fulful);
        }else if(!string3.equals("")&&!string.equals("")){
            textViewe.setText(string3);
            textView.setText(""+string);
        }else if(!string.equals("")&&too==0) {
            textView.setText(""+string);

        }else {

            textView.setText("0");

        }

    }


/* dfgdgdgd dfsfsdf  sdfsf sasdasdasdasdasdasdadsadadaadadadadadadadaa*/

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
        if(string.contains("."))
        {
            return;
        } else {
            insert(".");
        }
        }

    public void buttonEqual(View V) {
        calculate();


    }

    public void operation() {

        if(pi==0){



        try{
            num = Double.valueOf(string);

        }catch (Exception e){
            Toast.makeText(this,"Wrong! Type again",Toast.LENGTH_LONG).show();

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
        i = num;

        string ="";
        textView.setText("");
        pi=1;
        }else if (pi==1){


            string ="";
            textView.setText("");
            pi=1;
        }
        else if (pi==2){
            insert((textView.getText().toString()));


            try{
                num = Double.valueOf(string);

            }catch (Exception e){
                Toast.makeText(this,"Wrong! Type again",Toast.LENGTH_LONG).show();

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
            i = num;

            string ="";
            textView.setText("");
            pi=1;
        }

    }

    public void insert(String j) {



        string += j;
        textView.setText(string.toString());
        pi=0;




//        try {
//            string += j;
//            num = Double.valueOf(string);
//            textView.setText(string);
//
//        }catch (Exception e){
//
//        }



    }

    public void buttonMinus(View V) {
        if(i!=0.0 && op!='o'&&num!=0){
            calculate();
        }
        operation();
        op='-';
        textViewe.setText(i+""+op.toString());
        textView.setText("");

    }

    public void buttonPlus(View V) {
        if(i!=0.0 && op!='o'&&num!=0){
            calculate();
        }
        operation();
        op='+';
        textViewe.setText(i+""+op.toString());
        textView.setText("");


    }

    public void buttonMultiple(View V) {
        if(i!=0.0 && op!='o'&&num!=0){
            calculate();
        }
        operation();
        op='*';
        textViewe.setText(i+""+op.toString());
        textView.setText("");


    }

    public void buttonDivide(View V) {
        if(i!=0.0 && op!='o'&&num!=0){
            calculate();
        }
        operation();
        op='/';
        textViewe.setText(i+""+op.toString());
        textView.setText("");


    }

   public void justClear(View V) {

        if(i==0.0 && op=='o'){
            string="";
            num=0.0;
            i=0.0;
            op='o';
            textView.setText("0");
            pi=0;
        }else{
            string="";
            num=0.0;
            textView.setText("0");
            pi=1;

        }
    }




    public void calculate() {

        try{
            num = Double.valueOf(string);

        }catch (Exception e){
            Toast.makeText(this,"Wrong! Type again",Toast.LENGTH_LONG).show();

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

        if(op=='+'){

            full=i+num;
        }
        else if (op=='-'){
            full=i-num;
        }
        else if (op=='/'){
           full=i/num;

//            try{
//                num=i/num;
//            }catch (Exception e){
//
//            }

        }
        else if (op=='*'){
            full=i*num;
        }
        string3=i+""+op.toString()+""+num+"=";
       textViewe.setText(string3);
       // textViewe.append(string3);
        scrollView.fullScroll(View.FOCUS_DOWN);
        fulful=full;

        too=1;
        textView.setText(""+full);
        string="";
        numnum=num;

        num=0.0;
        ii=i;
        i=0.0;
        opop=op;
        op='o';
        pi=2;



    }
    public void allClear(View V) {

        string="";
        string3="";
        string2="";
        num=0.0;
        i=0.0;
        op='o';
        textView.setText("0");
        string2=ii+""+opop.toString()+""+numnum+"="+full;
        textViewe.setText(string2);
        pi=0;
        too=0;
    }



    public void history(View view) {

        if(string.length()>0&&string !=null){
            string=string.substring(0,string.length()-1);
            textView.setText(string.toString());
            pi=0;
        }

//        String h=textView.getText().toString();
//        Intent i=new Intent(MainActivity1.this,History1.class);
//        i.putExtra("h", h);
//        startActivity(i);


    }

    public void fulllclear(View view) {

        string="";
        num=0.0;
        i=0.0;
        op='o';

        string3="";
        string2="";
        textView.setText("0");

        textViewe.setText("");
        pi=0;
        too=0;
    }

    protected void onSaveInstanceState(Bundle icicle) {
        super.onSaveInstanceState(icicle);
        //here sould save by a object value that is save all instead of saving them one by one
        icicle.putString("params", string );
        icicle.putString("params2", string2 );
        icicle.putString("params3", string3 );
        icicle.putDouble("paramn", num );
        icicle.putDouble("parami", i );
        icicle.putDouble("paramf", full );
        icicle.putDouble("paramnn", numnum );
        icicle.putDouble("paramii", ii );
        icicle.putDouble("paramff", fulful );
        icicle.putChar("paramo", op );
        icicle.putChar("paramoo", opop );
        icicle.putInt("parampi", pi );
        icicle.putInt("paramtoo", too );

     super.onSaveInstanceState(icicle);






    }
}
