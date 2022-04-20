package com.example.lockerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    EditText PinT;
    int wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        PinT = findViewById(R.id.PinT);
    }
    public void one(View v){
    onButtonClick(button1,PinT,"1");
    }
    public void two(View v){
        onButtonClick(button2,PinT,"2");
    }
    public void three(View v){
        onButtonClick(button3,PinT,"3");
    }
    public void four(View v){
        onButtonClick(button4,PinT,"4");
    }
    public void five(View v){
        onButtonClick(button5,PinT,"5");
    }
    public void six(View v){
        onButtonClick(button6,PinT,"6");
    }
    public void seven(View v){
        onButtonClick(button7,PinT,"7");
    }
    public void eight(View v){
        onButtonClick(button8,PinT,"8");
    }
    public void nine(View v){
        onButtonClick(button9,PinT,"9");
    }
    public void zero(View v){
        onButtonClick(button10,PinT,"0");
    }
    public void back(View v){
    PinT.setText("");
    }
    public void open(View v){
    if(PinT.getText().toString().equals("1471")){
        Intent intent = new Intent(MainActivity.this,Unlocked.class);
        startActivity(intent);
    }else{
        Toast.makeText(this,"Please Enter Correct Pin !",Toast.LENGTH_SHORT).show();
        PinT.setText("");
    wrong++;
    }
    if(wrong==3){
        System.exit(0);
        Toast.makeText(this,"Sorry You cannot access Safe!",Toast.LENGTH_LONG).show();
    }
    }
    public void onButtonClick(Button button, EditText Num,String number){
        String prev = PinT.getText().toString();
        PinT.setText(prev + number);
    }
}