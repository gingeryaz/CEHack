package com.example.bytesizec;

public class Question2 {
    private String mQuestions [] = {
            "Which of the following expressions can be used if only one condition has to be true in order for the code to execute?",
            "If statements can only evaluate 1 condition",
            "Which of the following loops execute first then evaluates the condition given?",
            "If you want to iterate through a certain range which loop is going to be most efficient?\n"
    };
    private String mChoices [] []= {
            {"&&", ">", "||"},
            {"true", "false"},
            {"Do-while loop", "While loop", "If else statement", "For loop"}
    };

    private String mCorrectAnswers []=
            {"The address of the variable it points to",  "*pointer" , "int* pointer = &a ; *pointer = 5;"};

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
        String choice2 = mChoices[a][3];
        return choice2;
    }

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}