package com.example.digitalscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int intScoreL, intScoreR,intPenaltiL,intPenaltiR;
    private Button btnClear, btnScoreL, btnScoreR, btnPenaltiL, btnPenaltiR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear =findViewById(R.id.buttonClear);
        btnClear.setOnClickListener(this);

        btnPenaltiL = findViewById(R.id.penaltiLeft);
        btnPenaltiL.setOnClickListener(this);

        btnPenaltiR = findViewById(R.id.penaltiRight);
        btnPenaltiR.setOnClickListener(this);

        btnScoreL = findViewById(R.id.scoreLeft);
        btnScoreL.setOnClickListener(this);

        btnScoreR = findViewById(R.id.scoreRight);
        btnScoreR.setOnClickListener(this);


        intScoreL = Integer.parseInt(btnScoreL.getText().toString());
        intScoreR = Integer.parseInt(btnScoreR.getText().toString());
        intPenaltiL = Integer.parseInt(btnPenaltiL.getText().toString());
        intPenaltiR = Integer.parseInt(btnPenaltiR.getText().toString());

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.penaltiLeft:
                intPenaltiL++;
                btnPenaltiL.setText(""+intPenaltiL);
                break;
            case R.id.penaltiRight:
                intPenaltiR++;
                btnPenaltiR.setText(""+intPenaltiR);
                break;
            case R.id.scoreLeft:
                intScoreL++;
                btnScoreL.setText(""+intScoreL);
                break;
            case R.id.scoreRight:
                intScoreR++;
                btnScoreR.setText(""+intScoreR);
                break;
            case R.id.buttonClear:
                btnPenaltiL.setText(getResources().getString(R.string.score_text));
                btnPenaltiR.setText(getResources().getString(R.string.score_text));
                btnScoreL.setText(getResources().getString(R.string.score_text));
                btnScoreR.setText(getResources().getString(R.string.score_text));
                break;
        }
    }
}