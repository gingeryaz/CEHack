package com.example.bytesizec;

public class Question2 {
    private String mQuestions [] = {
            "Which of these is not a data type?",
            "If I declare the variable num as an int, which of these could be a possible output for num?",
            "Which data type is more precise?",
            "What do we use in order for our code to ask the user for an input?",
            "What is the paper format for Cin?"
    };
    private String mChoices [] []= {
            {"int", "bool", "wholenum", "char"},
            {"20.5", "Eight", "14", "None of the above"},
            {"float", "double", "Both are equally as precise"},
            {"cin","cout", "Both of the above", "None of the above"},
            {"cin<<","cin=", "cin>>", "cin;"}
    };

    private String mCorrectAnswers []=
            {"wholenum", "14" , "double", "cin", "cin>>"};

    public String getQuestion (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2 (int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4 (int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getChoice5 (int a) {
        String choice4 = mChoices[a][4];
        return choice4;
    }

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

