package com.example.harpalsingh.quiz8tnow.model;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Quiz {
    @SerializedName("question")
    private String question;
    @SerializedName("choice_one")
    private String choice_one;
    @SerializedName("choice_two")
    private String choice_two;
    @SerializedName("choice_three")
    private String choice_three;
    @SerializedName("choice_four")
    private String choice_four;
    @SerializedName("correct_answer")
    private String correct_answer;

    public Quiz(String question,String choice_one, String choice_two, String choice_three, String choice_four,String correct_answer)
    {
        this.question = question;
        this.choice_one = choice_one;
        this.choice_two = choice_two;
        this.choice_three = choice_three;
        this.choice_four = choice_four;
        this.correct_answer = correct_answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getChoice_one() {
        return choice_one;
    }

    public String getChoice_two() {
        return choice_two;
    }

    public String getChoice_three() {
        return choice_three;
    }

    public String getChoice_four() {
        return choice_four;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoice_one(String choice_one) {
        this.choice_one = choice_one;
    }

    public void setChoice_two(String choice_two) {
        this.choice_two = choice_two;
    }

    public void setChoice_three(String choice_three) {
        this.choice_three = choice_three;
    }

    public void setChoice_four(String choice_four) {
        this.choice_four = choice_four;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }
}