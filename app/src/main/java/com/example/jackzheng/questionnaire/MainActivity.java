package com.example.jackzheng.questionnaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;


    private String mAnswer;
    private String nResponse;
    private String oResult;

    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else if(mButtonChoice1.getText() == nResponse){
                    //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();

                }else{
                    mScore = mScore + 3;
                    updateScore(mScore);
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == nResponse){
                    mScore = mScore + 10;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else if(mButtonChoice2.getText() == mAnswer){
                    //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mScore = mScore + 30;
                    updateScore(mScore);
                    updateQuestion();

                }else{
                    mScore = mScore + 20;
                    updateScore(mScore);
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 200;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else if(mButtonChoice3.getText() == nResponse){
                    //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mScore = mScore + 300;
                    updateScore(mScore);
                    updateQuestion();
/*                }else if(mButtonChoice3.getText() == oResult){
                    //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mScore = mScore + 100;
                    updateScore(mScore);
                    updateQuestion();*/
                }else{
                    mScore = mScore + 100;
                    updateScore(mScore);
                     updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3

    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));


        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        nResponse = mQuestionLibrary.getCorrectResponse(mQuestionNumber);
        oResult = mQuestionLibrary.getCorrectResult(mQuestionNumber);

        mQuestionNumber++;
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
