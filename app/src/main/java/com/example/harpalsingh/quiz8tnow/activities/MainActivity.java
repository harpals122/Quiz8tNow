package com.example.harpalsingh.quiz8tnow.activities;

import com.example.harpalsingh.quiz8tnow.adapters.listAdapter;
import  com.example.harpalsingh.quiz8tnow.model.Quiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.harpalsingh.quiz8tnow.R;
import com.example.harpalsingh.quiz8tnow.model.Quiz;
import com.example.harpalsingh.quiz8tnow.util.ApiClient;
import com.example.harpalsingh.quiz8tnow.util.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private listAdapter listAdapter;
    private List<Quiz> list;
    private ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.listview);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call <List<Quiz>> call = apiInterface.getQuizData();
         call.enqueue(new Callback<List<Quiz>>() {
             @Override
             public void onResponse(Call<List<Quiz>> call, Response<List<Quiz>> response) {
                 list = response.body();
                 listAdapter = new listAdapter(list);
                 recyclerView.setAdapter(listAdapter);
                }

             @Override
             public void onFailure(Call<List<Quiz>> call, Throwable t) {
                 Toast.makeText(getApplicationContext(),"fail",Toast.LENGTH_LONG).show();
             }
         });
    }
}
