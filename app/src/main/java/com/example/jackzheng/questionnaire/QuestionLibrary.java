package com.example.jackzheng.questionnaire;

public class QuestionLibrary {
    private String mQuestions [] = {

            "What best describes your skin?",
            "What is your biggest concern?",
            "What is your price range?"
    };

    private String mChoices [][] = {
            {"Oily","Dry","Normal/Combination"},
            {"Age Prevention","Wrinkles","Large Pores"},
            {"Less than $40","$40-70","$70-100"}
    };


    private String mCorrectAnswers[] = {"Oily", "Large Pores", "$40-60"};
    private String nCorrectResponses[] = {"Dry","Age Prevention","$60-80"};
    private String oCorrectResults[] = {"Normal/Combination","Wrinkles","Less than $40"};



    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public String getCorrectResponse(int a) {
        String response = nCorrectResponses[a];
        return response;
    }

    public String getCorrectResult(int a) {
        String result = oCorrectResults[a];
        return result;
    }
}
