package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Initialize total score
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //this method occurs when pressing the submit button
    public void submit (View view){
        //checking the answer in the first question
        RadioButton answer1_1 = (RadioButton) findViewById(R.id.answer1_1);
        boolean answer1 = answer1_1.isChecked();
        if (answer1) {
            totalScore += +1;
        }
        //checking the answer in the second question
        EditText answer2_0 = (EditText) findViewById(R.id.answer2);
        String answer2 = answer2_0.getText().toString();
        if (answer2.equals("Odin")){
            totalScore += +1;
        }
        //checking the answer in the third question
        CheckBox answer3_3 = (CheckBox) findViewById(R.id.answer3_3);
        CheckBox answer3_1 = (CheckBox) findViewById(R.id.answer3_1);
        boolean answer3 = answer3_3.isChecked();
        boolean answer32 = answer3_1.isChecked();
        if (answer3 && answer32) {
            totalScore += +1;
        }
        //checking the answer in the fourth question
        RadioButton answer4_3 = (RadioButton) findViewById(R.id.answer4_3);
        boolean answer4 = answer4_3.isChecked();
        if (answer4) {
            totalScore += +1;
        }
        //checking the answer in the fifth question
        EditText answer5_0 = (EditText) findViewById(R.id.answer5);
        String answer5 = answer5_0.getText().toString();
        if (answer5.equals("Valkyries")){
            totalScore += +1;
        }
        //checking the answer in the sixth question
        CheckBox answer6_1 = (CheckBox) findViewById(R.id.answer6_1);
        CheckBox answer6_4 = (CheckBox) findViewById(R.id.answer6_4);
        boolean answer6 = answer6_1.isChecked();
        boolean answer62 = answer6_4.isChecked();
        if (answer6 && answer62) {
            totalScore += +1;
        }
        // Show toast
        String result = "You scored " + totalScore + "/6!";
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        if (totalScore == 0){
            Toast.makeText(this, "You are not worthy to enter Valhalla", Toast.LENGTH_SHORT).show();
        }
        else if (totalScore ==6){
            Toast.makeText(this, "You are worthy to enter Valhalla", Toast.LENGTH_SHORT).show();
        }
        //reset score
        totalScore = 0;
        //Show results
        TextView showResultsTextView = (TextView) findViewById(R.id.results);
        showResultsTextView.setText(results(answer1, answer2, answer3, answer4, answer5, answer6, answer62, answer32));
    }
    //method for showing the results
    public String results(boolean answer1, String answer2, boolean answer3, boolean answer4, String answer5, boolean answer6, boolean answer62, boolean answer32){
        String showResults = "Results:";
        showResults += "\nQuestion 1: " + answer1;
        if (answer2.equals("Odin")){
            showResults += "\nQuestion 2: " + "true";
        }
        else showResults += "\nQuestion 2: " + "false";
        showResults += "\nQuestion 3: " + "gap 1: " + answer32 + " , gap 2: " + answer3;
        showResults += "\nQuestion 4: " + answer4;
        if (answer5.equals("Valkyries")){
            showResults += "\nQuestion 5: " + "true";
        }
        else showResults += "\nQuestion 5: " + "false";
        showResults += "\nQuestion 6: " + "part 1: " + answer6 + " , part 2: " + answer62;
        return showResults;
    }
}
