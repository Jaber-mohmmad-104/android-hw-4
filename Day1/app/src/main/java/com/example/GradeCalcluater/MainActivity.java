package com.example.GradeCalcluater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.GradeCalcluater.R.id.*;
import static com.example.GradeCalcluater.R.id.Final;
import static com.example.GradeCalcluater.R.id.Homework;
import static com.example.GradeCalcluater.R.id.Quizes;

public abstract class MainActivity<calc> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView z = findViewById(Quizes);
        final TextView f = findViewById(Homework);
        final TextView a = findViewById(MidTerms);
        final TextView j = findViewById(Final);

        Button c = findViewById(R.id.Calcluate);
        Button t = findViewById(R.id.Reset);


        String QuizesString = z.getText().toString();
        String HomeworkString = f.getText().toString();
        String MidtermsString = a.getText().toString();
        String FinalString = j.getText().toString();

        final double Quizes = Double.parseDouble(QuizesString);
        final double Homework = Double.parseDouble(HomeworkString);
        final double Midterms = Double.parseDouble(MidtermsString);
        final double Final = Double.parseDouble(FinalString);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = (Quizes + Homework + Midterms + Final);
                System.out.println(c);

                Toast.makeText(MainActivity.this, "This is the result" + c, Toast.LENGTH_LONG);
            }
        });




     t.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            double t = (Quizes - Homework - Midterms - Final);
            System.out.println(t);

    }});}
    public static void X (int X){
            if (X >= 90) {

        System.out.println('A');
    } else if (X >= 80) {
        System.out.println('B');
    } else if (X >= 70) {
        System.out.println('C');
    } else if (X >= 60) {
        System.out.println('D');
    } else if (X >= 50) {
        System.out.println('F');
    }
}}