package com.example.harpalsingh.quiz8tnow.util;

import com.example.harpalsingh.quiz8tnow.model.Quiz;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface ApiInterface {
    @POST("quizData.php")
    Call<List<Quiz>> getQuizData();


}