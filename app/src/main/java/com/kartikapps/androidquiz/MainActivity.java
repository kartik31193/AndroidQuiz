package com.kartikapps.androidquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i=0;
    TextView displayquestion;
    EditText edittext;
    int[] questiontext = new int[4];
    int score = 0;
    RadioButton r1, r2, r3, r4;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rg);

        questiontext[0] = R.string.question_1;
        questiontext[1] = R.string.question_2;
        questiontext[2] = R.string.question_3;
        questiontext[3] = R.string.question_4;

        displayquestion = (TextView) findViewById(R.id.question);
        displayquestion.setText(questiontext[i]);


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.r1:
                if (checked) {
                    if (i == 1) {
                        Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                        score++;
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }

                        //move to next question
                    } else {
                        Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }

                        //move to next question
                    }
                    break;
                }
            case R.id.r2:
                if (checked) {
                    if (i == 0) {
                        Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                        score++;
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }

                        //move to next question
                    } else {
                        Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }

                        //move to next question
                    }

                    break;
                }
            case R.id.r3:
                if (checked) {
                    if (i == 2) {
                        Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                        score++;
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }
                        //move to next question
                    } else {
                        Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }
                        //move to next question
                    }

                    break;
                }
            case R.id.r4:
                if (checked) {
                    if (i == 3) {
                        Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                        score++;
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }
                        //move to next question
                    } else {
                        Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                        //disable all radio buttons
                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            radioGroup.getChildAt(i).setEnabled(false);
                        }
                        //move to next question
                    }

                    break;
                }
        }
    }

    public void clickPrev(View view) {
        i--;
        displayquestion.setText(questiontext[i]);
        //enabling radiogroup
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            radioGroup.getChildAt(i).setEnabled(true);
        }

    }

    public void clickSub(View view) {
        //display score in large text
        //set radio group to gone
        displayquestion.setText("Your Score is " + score + "/4");
        radioGroup.setVisibility(View.GONE);
    }

    public void clickNext(View view) {
        //every time it get clicked ,
        //next question and options will be diplayed
        i++;
        displayquestion.setText(questiontext[i]);
        //uncheck radio button
        radioGroup.clearCheck();
        //enabling radiogroup
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            radioGroup.getChildAt(i).setEnabled(true);
        }


    }

}
