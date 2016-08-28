package com.marik.coolcalc;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalcActivity extends Activity {

    public enum Operation{ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUALS}

    String runningNumber = "";
    String leftValue = "";
    String rightValue="";


    TextView resultsView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneBtn = (Button)findViewById(R.id.oneBtn);
        Button twoBtn = (Button)findViewById(R.id.twoBtn);
        Button threeBtn = (Button)findViewById(R.id.threeBtn);
        Button fourBtn = (Button)findViewById(R.id.fourBtn);
        Button fiveBtn = (Button)findViewById(R.id.fiveBtn);
        Button sixBtn = (Button)findViewById(R.id.sixBtn);
        Button sevenBtn = (Button)findViewById(R.id.sevenBtn);
        Button eightBtn = (Button)findViewById(R.id.eightBtn);
        Button nineBtn = (Button)findViewById(R.id.nineBtn);
        Button zeroBtn = (Button)findViewById(R.id.zeroBtn);

        ImageButton calcBtn = (ImageButton)findViewById(R.id.calcBtn);
        ImageButton addBtn = (ImageButton)findViewById(R.id.addButn);
        ImageButton divideBtn = (ImageButton)findViewById(R.id.divideBtn);
        ImageButton multiplyBtn = (ImageButton)findViewById(R.id.multiplyBtn);
        ImageButton subtractBtn = (ImageButton)findViewById(R.id.subtractBtn);

        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        resultsView = (TextView)findViewById(R.id.resultsText);

        resultsView.setText("");

        oneBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(1);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(2);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(3);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(4);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(5);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(6);
            }
        });

       sevenBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(7);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(8);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(9);
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(0);
            }
        });


        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

    }

//    void processOperation(Opeartion operation) {
//
//    }

    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        resultsView.setText(runningNumber);

    }}
