package com.example.android.quizgame;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    String answer_1 = "india";
    int answer_2 = R.id.ans_2a;
    int answer_3 = R.id.ans_3b;
    int answer_4 = R.id.ans_4a;
    String answer_5 = "australia";
    int answer_6 = R.id.ans_6b;
    int answer_7 = R.id.ans_7b;
    int correctAnswers = 0;
    int incorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome To Quiz Game!!", Toast.LENGTH_SHORT).show();
    }

    // function call for every question in quiz to check the answer is correct or not//
    public void checkAnswer(View view) {
        String text = "Result:\n";
        if (question1()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question2()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question3()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question4()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question5()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question6()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question7()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        if (question8()) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }

        Toast.makeText(this, "Correct: " + correctAnswers + "\nIncorrect Answers: " + incorrectAnswers, Toast.LENGTH_LONG).show();
        EditText name = (EditText) findViewById(R.id.name_edit_view);
        String nameString = "Name: " + name.getText().toString();
        text += nameString;
        display(text);
        correctAnswers = 0;
        incorrectAnswers = 0;
    }

    public String display(String text) {
        EditText age = (EditText) findViewById(R.id.age_edit_view);
        text += "\nAge: " + age.getText().toString();
        EditText email = (EditText) findViewById(R.id.email_edit_view);
        text += "\nEmail: " + email.getText().toString();
        text += "\nCorrect: " + correctAnswers;
        text += "\nIncorrect: " + incorrectAnswers;
        TextView t1 = (TextView) findViewById(R.id.result);
        t1.setText(text);
        return text;
    }

    // Getting Answer ist checked//
    private boolean question1(){
        EditText text = (EditText) findViewById(R.id.ans_1);
        return text.getText().toString().equalsIgnoreCase(answer_1);
    }

    // Getting Answer 2nd checked//
    private boolean question2(){
        RadioGroup r1 = (RadioGroup) findViewById(R.id.ans_2);
        if( r1.getCheckedRadioButtonId()== answer_2 ){
            return true;
        }
        return false;
    }

    // Getting Answer 3rd checked//
    private boolean question3(){
        RadioGroup r1 = (RadioGroup) findViewById(R.id.ans_3);
        if( r1.getCheckedRadioButtonId()== answer_3 ){
            return true;
        }
        return false;
    }

    // Getting Answer 4th checked//
    private boolean question4(){
        RadioGroup r1 = (RadioGroup) findViewById(R.id.ans_4);
        if( r1.getCheckedRadioButtonId()== answer_4 ){
            return true;
        }
        return false;
    }

    // Getting Answer 5th checked//
    private boolean question5(){
        EditText text = (EditText) findViewById(R.id.ans_5);
        return text.getText().toString().equalsIgnoreCase(answer_5);
    }

    // Getting Answer 6th checked//
    private boolean question6(){
        RadioGroup r1 = (RadioGroup) findViewById(R.id.ans_6);
        if( r1.getCheckedRadioButtonId()== answer_6 ){
            return true;
        }
        return false;
    }

    // Getting Answer 7th checked//
    private boolean question7(){
        RadioGroup r1 = (RadioGroup) findViewById(R.id.ans_7);
        if( r1.getCheckedRadioButtonId()== answer_7 ){
            return true;
        }
        return false;
    }

    // Getting Answer 8th checked//
    private boolean question8(){
        CheckBox a = (CheckBox) findViewById(R.id.ans_8a);
        CheckBox b = (CheckBox) findViewById(R.id.ans_8b);
        CheckBox c = (CheckBox) findViewById(R.id.ans_8c);
        CheckBox d = (CheckBox) findViewById(R.id.ans_8d);
        if(a.isChecked() && !b.isChecked() && !c.isChecked() && d.isChecked()){
            return true;
        }
        return false;
    }
}