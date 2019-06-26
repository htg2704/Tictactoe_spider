package com.example.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    long start,end;
    long time;
    TextView tv;
    MyDB mDatabaseHelper;

    public static final String mypref = "MyPrefs";
    public static final String best_time = "best";
    SharedPreferences sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabaseHelper = new MyDB(this);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        tv = findViewById(R.id.tv1);
        start = System.currentTimeMillis();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals("")){
                    b1.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")){
                    b2.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")){
                    b3.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {if(b1.getText().toString().equals("")){
                b1.setText("X");
                compturn();
                check();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
            }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")){
                    b4.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")){
                    b5.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")){
                    b6.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")){
                    b7.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")){
                    b8.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_LONG).show();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")){
                    b9.setText("X");
                    compturn();
                    check();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please make a valid move",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start = System.currentTimeMillis();
                clear();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), list.class);
                startActivity(intent);
            }
        });

    }



    public void compturn(){
        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();
        if(s1.equals("X")&&s2.equals("X")&&s3.equals("")){
            b3.setText("O");
            return;
        }
        if(s1.equals("X")&&s3.equals("X")&&s2.equals("")){
            b2.setText("O");
            return;
        }
        if(s1.equals("X")&&s4.equals("X")&&s7.equals("")){
            b7.setText("O");
            return;
        }
        if(s1.equals("X")&&s7.equals("X")&&s4.equals("")){
            b4.setText("O");
            return;
        }
        if(s1.equals("X")&&s5.equals("X")&&s9.equals("")){
            b9.setText("O");
            return;
        }
        if(s1.equals("X")&&s9.equals("X")&&s5.equals("")){
            b5.setText("O");
            return;
        }
        if(s2.equals("X")&&s3.equals("X")&&s1.equals("")){
            b1.setText("O");
            return;
        }
        if(s2.equals("X")&&s5.equals("X")&&s8.equals("")){
            b8.setText("O");
            return;
        }
        if(s2.equals("X")&&s8.equals("X")&&s5.equals("")){
            b5.setText("O");
            return;
        }
        if(s3.equals("X")&&s5.equals("X")&&s7.equals("")){
            b7.setText("O");
            return;
        }
        if(s3.equals("X")&&s7.equals("X")&&s5.equals("")){
            b5.setText("O");
            return;
        }
        if(s3.equals("X")&&s9.equals("X")&&s6.equals("")){
            b6.setText("O");return;
        }
        if(s3.equals("X")&&s6.equals("X")&&s9.equals("")){
            b9.setText("O");return;
        }
        if(s4.equals("X")&&s7.equals("X")&&s1.equals("")){
            b1.setText("O");return;
        }
        if(s4.equals("X")&&s5.equals("X")&&s6.equals("")){
            b6.setText("O");
            return;
        }
        if(s4.equals("X")&&s6.equals("X")&&s5.equals("")){
            b5.setText("O");return;
        }
        if(s5.equals("X")&&s6.equals("X")&&s4.equals("")){
            b4.setText("O");return;
        }
        if(s5.equals("X")&&s7.equals("X")&&s3.equals("")){
            b3.setText("O");return;
        }
        if(s5.equals("X")&&s8.equals("X")&&s2.equals("")){
            b2.setText("O");return;
        }
        if(s5.equals("X")&&s9.equals("X")&&s1.equals("")){
            b1.setText("O");return;
        }
        if(s6.equals("X")&&s9.equals("X")&&s3.equals("")){
            b3.setText("O");return;
        }
        if(s7.equals("X")&&s8.equals("X")&&s9.equals("")){
            b9.setText("O");return;
        }if(s7.equals("X")&&s9.equals("X")&&s8.equals("")){
            b8.setText("O");return;
        }
        if(s8.equals("X")&&s9.equals("X")&&s7.equals("")){
            b7.setText("O");return;
        }
        if(s1.equals("")){
            if(s2.equals("X")&&s3.equals("X")){
                b1.setText("O");
                return;
            }
            else
                if(s4.equals("X")&&s7.equals("X")){
                b1.setText("O");
            }
            else
                if(s5.equals("X")&&s9.equals("X")){
                    b1.setText("O");
                }
            if(s2.equals("O")&&s3.equals("O")){
                b1.setText("O");
                return;
            }
            else
            if(s4.equals("O")&&s7.equals("O")){
                b1.setText("O");
            }
            else
            if(s5.equals("O")&&s9.equals("O")){
                b1.setText("O");
            }
            if(s2.equals("O")||s3.equals("O")){
                b1.setText("O");
                return;
            }
            else
            if(s4.equals("O")||s7.equals("O")){
                b1.setText("O");
            }
            else
            if(s5.equals("O")||s9.equals("O")){
                b1.setText("O");
            }else
                b1.setText("O");
        return;
        }
        if(s2.equals("")){
            if(s1.equals("X")&&s3.equals("X")){
                b2.setText("O");
                return;
            }
            else if(s5.equals("X")&&s8.equals("X")){
                b2.setText("O");
            }
            else if(s1.equals("O")&&s3.equals("O")){
                b2.setText("O");
                return;
            }
            else if(s5.equals("O")&&s8.equals("O")){
                b2.setText("O");
            }else if(s1.equals("O")||s3.equals("O")){
                b2.setText("O");
                return;
            }
            else if(s5.equals("O")||s8.equals("O")){
                b2.setText("O");
            }else
                b2.setText("O");
            return;
        }
        if(s3.equals("")){
            if(s1.equals("X")&&s2.equals("X")){
                b3.setText("O");

            }else
            if(s5.equals("X")&&s7.equals("X")){
                b3.setText("O");
            }
            else
            if(s6.equals("X")&&s9.equals("X")){
                b3.setText("O");
            }else
                if(s1.equals("O")&&s2.equals("O")){
                b3.setText("O");

            }else
            if(s5.equals("O")&&s7.equals("O")){
                b3.setText("O");
            }
            else
            if(s6.equals("O")&&s9.equals("O")){
                b3.setText("O");
            }
            else
                if(s1.equals("O")||s2.equals("O")){
                b3.setText("O");

            }else
            if(s5.equals("O")||s7.equals("O")){
                b3.setText("O");
            }
            else
            if(s6.equals("O")||s9.equals("O")){
                b3.setText("O");
            }else
                b3.setText("O");
            return;
        }
        if(s4.equals("")){
            if(s1.equals("X")&&s7.equals("X")){
                b4.setText("O");

            }
            else
            if(s5.equals("X")&&s6.equals("X")){
                b4.setText("O");
            }else
            if(s1.equals("O")&&s7.equals("O")){
                b4.setText("O");

            }
            else
            if(s5.equals("O")&&s6.equals("O")){
                b4.setText("O");
            }else
            if(s1.equals("O")||s7.equals("O")){
                b4.setText("O");

            }
            else
            if(s5.equals("O")||s6.equals("O")){
                b4.setText("O");
            }else
                b4.setText("O");
        return;
        }
        if(s5.equals("")){
            if(s1.equals("X")&&s9.equals("X")){
                b5.setText("O");
                return;
            }
            else
            if(s2.equals("X")&&s8.equals("X")){
                b5.setText("O");

            }else
            if(s4.equals("X")&&s6.equals("X")){
                b5.setText("O");
            }
            else if(s3.equals("X")&&s7.equals("X")){
                b5.setText("O");
            }
            else if(s1.equals("O")&&s9.equals("O")){
                b5.setText("O");
                            }
            else
            if(s2.equals("O")&&s8.equals("O")){
                b5.setText("O");

            }else
            if(s4.equals("O")&&s6.equals("O")){
                b5.setText("O");
            }
            else if(s3.equals("O")&&s7.equals("O")){
                b5.setText("O");
            }
            else if(s1.equals("O")||s9.equals("O")){
                b5.setText("O");
            }
            else
            if(s2.equals("O")||s8.equals("O")){
                b5.setText("O");

            }else
            if(s4.equals("O")||s6.equals("O")){
                b5.setText("O");
            }
            else if(s3.equals("O")||s7.equals("O")){
                b5.setText("O");
            }
            else
                b5.setText("O");

            return;
        }
        if(s6.equals("")){
            if(s4.equals("X")&&s5.equals("X")){
                b6.setText("O");
            }
            else if(s3.equals("X")&&s9.equals("X")){
                b6.setText("O");
            }
            else if(s4.equals("O")&&s5.equals("O")){
                b6.setText("O");
            }
            else if(s3.equals("O")&&s9.equals("O")){
                b6.setText("O");
            } else if(s4.equals("O")||s5.equals("O")){
                b6.setText("O");
            }
            else if(s3.equals("O")||s9.equals("O")){
                b6.setText("O");
            }else
                b6.setText("O");
return;
        }
        if(s7.equals("")){
            if(s3.equals("X")&&s5.equals("X")){
                b7.setText("O");
            }
            else if(s8.equals("X")&&s9.equals("X")){
                b7.setText("O");
            }
            else if(s1.equals("X")&&s4.equals("X")) {
                b7.setText("O");
            }
            else
            if(s3.equals("O")&&s5.equals("O")){
                b7.setText("O");
            }
            else if(s8.equals("O")&&s9.equals("O")){
                b7.setText("O");
            }
            else if(s1.equals("O")&&s4.equals("O")) {
                b7.setText("O");
            }
            else
            if(s3.equals("O")||s5.equals("O")){
                b7.setText("O");
            }
            else if(s8.equals("O")||s9.equals("O")){
                b7.setText("O");
            }
            else if(s1.equals("O")||s4.equals("O")) {
                b7.setText("O");
            }else
                b7.setText("O");
             return;
        }
        if(s8.equals("")){
            if(s2.equals("X")&&s5.equals("X")){
                b8.setText("O");

            }
            else
            if(s7.equals("X")&&s9.equals("X")){
                b8.setText("O");
            }else if(s2.equals("O")&&s5.equals("O")){
                b8.setText("O");

            }
            else
            if(s7.equals("O")&&s9.equals("O")){
                b8.setText("O");
            }else if(s2.equals("O")||s5.equals("O")){
                b8.setText("O");

            }
            else
            if(s7.equals("O")||s9.equals("O")){
                b8.setText("O");
            }else
                b8.setText("O");
            return;
        }
        if(s9.equals("")){
            if(s1.equals("X")&&s5.equals("X")){
                b9.setText("O");
                  }
            else if(s3.equals("X")&&s6.equals("X")){
                b9.setText("O");
            }else
            if(s7.equals("X")&&s8.equals("X")){
                b9.setText("O");
            }else
            if(s1.equals("O")&&s5.equals("O")){
                b9.setText("O");

            }else if(s3.equals("O")&&s6.equals("O")){
                b9.setText("O");
            }else
            if(s7.equals("O")&&s8.equals("O")){
                b9.setText("O");
            }else
            if(s1.equals("O")||s5.equals("O")){
                b9.setText("O");

            }else if(s3.equals("O")||s6.equals("O")){
                b9.setText("O");
            }else
            if(s7.equals("O")||s8.equals("O")){
                b9.setText("O");
            }
            else
                b9.setText("O");

        }
        /*if(s1.equals("X")&&s2.equals("X")){
            b3.setText("O");
            return;
        }
        if(s1.equals("X")&&s3.equals("X")){
            b2.setText("O");
            return;
        }
        if(s1.equals("X")&&s4.equals("X")){
            b7.setText("O");
            return;
        }
        if(s1.equals("X")&&s7.equals("X")){
            b4.setText("O");
            return;
        }
        if(s1.equals("X")&&s5.equals("X")){
            b9.setText("O");
            return;
        }
        if(s1.equals("X")&&s9.equals("X")){
            b5.setText("O");
            return;
        }
        if(s2.equals("X")&&s3.equals("X")){
            b1.setText("O");
            return;
        }
        if(s2.equals("X")&&s5.equals("X")){
            b8.setText("O");
            return;
        }
        if(s2.equals("X")&&s8.equals("X")){
            b5.setText("O");
            return;
        }
        if(s3.equals("X")&&s5.equals("X")){
            b7.setText("O");
        }
        if(s3.equals("X")&&s9.equals("X")){
            b7.setText("O");
        }
        if(s3.equals("X")&&s6.equals("X")){
            b9.setText("O");
        }
        if(s4.equals("X")&&s7.equals("X")){
            b1.setText("O");
        }
        if(s4.equals("X")&&s5.equals("X")){
            b6.setText("O");
        }
        if(s4.equals("X")&&s6.equals("X")){
            b5.setText("O");
        }
        if(s5.equals("X")&&s6.equals("X")){
            b4.setText("O");
        }
        if(s5.equals("X")&&s7.equals("X")){
            b3.setText("O");
        }
        if(s5.equals("X")&&s8.equals("X")){
            b2.setText("O");
        }
        if(s5.equals("X")&&s9.equals("X")){
            b1.setText("O");
        }
        if(s6.equals("X")&&s9.equals("X")){
            b3.setText("O");
        }
        if(s7.equals("X")&&s8.equals("X")){
            b9.setText("O");
        }if(s7.equals("X")&&s9.equals("X")){
            b8.setText("O");
        }
        if(s8.equals("X")&&s9.equals("X")){
            b7.setText("O");
        }*/



    }
    public void check(){
        sh = getSharedPreferences(mypref, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sh.edit();

        long x;
        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();
        if(s1.equals("X")&&s2.equals("X")&&s3.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s4.equals("X")&&s5.equals("X")&&s6.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s7.equals("X")&&s8.equals("X")&&s9.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");
                Log.i("imp","if"+x);
            }
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
                Log.i("imp","else");

            }
            clear();
        }else
        if(s1.equals("X")&&s4.equals("X")&&s7.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s2.equals("X")&&s5.equals("X")&&s8.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s6.equals("X")&&s9.equals("X")&&s3.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s1.equals("X")&&s5.equals("X")&&s9.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s3.equals("X")&&s5.equals("X")&&s7.equals("X")){
            Toast.makeText(getApplicationContext(),"You won",Toast.LENGTH_LONG).show();
            end = System.currentTimeMillis();
            time = Math.abs((start - end)/1000);
            mDatabaseHelper.addData(time);
            x = sh.getLong(best_time,0);
            if(x==0||time<x){
                editor.putLong(best_time,time);
                editor.apply();
                tv.setText("Best time till now is " + time/60 + " minutes "+ time%60+" seconds");}
            else{
                tv.setText("Best time till now is " + x/60 + " minutes "+ Math.abs(x%60)+" seconds");
            }
            clear();
        }else
        if(s1.equals("O")&&s2.equals("O")&&s3.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s4.equals("O")&&s5.equals("O")&&s6.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s7.equals("O")&&s8.equals("O")&&s9.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s1.equals("O")&&s4.equals("O")&&s7.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s2.equals("O")&&s5.equals("O")&&s8.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s3.equals("O")&&s6.equals("O")&&s8.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s3.equals("O")&&s5.equals("O")&&s7.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
        if(s1.equals("O")&&s5.equals("O")&&s9.equals("O")){
            Toast.makeText(getApplicationContext(),"LOL, The AI won",Toast.LENGTH_LONG).show();
            clear();
        }else
            if(!s1.equals("")&&!s2.equals("")&&!s3.equals("")&&!s4.equals("")&&!s5.equals("")&&!s6.equals("")&&!s7.equals("")&&!s8.equals("")&&!s9.equals("")){
                Toast.makeText(getApplicationContext(),"DRAW",Toast.LENGTH_LONG).show();
                clear();
            }

    }
    public void clear(){

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        start = System.currentTimeMillis();

    }

}
