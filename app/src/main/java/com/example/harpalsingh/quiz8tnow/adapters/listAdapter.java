package com.example.harpalsingh.quiz8tnow.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harpalsingh.quiz8tnow.R;
import com.example.harpalsingh.quiz8tnow.model.Quiz;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by harpalsingh on 2018-01-30.
 */

public class listAdapter extends RecyclerView.Adapter<listAdapter.MyViewHolder> {

   public List<Quiz> quizData;
   public listAdapter( List<Quiz> quizData)
   {
       this.quizData = quizData;
   }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
    return new MyViewHolder(view);
   }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
     holder.question.setText(quizData.get(position).getQuestion());
        holder.choice_one.setText(quizData.get(position).getChoice_one());
        holder.choice_two.setText(quizData.get(position).getChoice_two());
        holder.choice_three.setText(quizData.get(position).getChoice_three());
        holder.choice_four.setText(quizData.get(position).getChoice_four());
        holder.correct_answer.setText(quizData.get(position).getCorrect_answer());
    }

    @Override
    public int getItemCount() {
        return quizData.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView question,choice_one,choice_two,choice_three,choice_four,correct_answer;
        public MyViewHolder(View itemView) {
            super(itemView);
            question = (TextView) itemView.findViewById(R.id.question);
            choice_one = (TextView) itemView.findViewById(R.id.choice_one);
            choice_two = (TextView) itemView.findViewById(R.id.choice_two);
            choice_three = (TextView) itemView.findViewById(R.id.choice_three) ;
            choice_four = (TextView) itemView.findViewById(R.id.choice_four);
            correct_answer = (TextView) itemView.findViewById(R.id.correct_answer);
        }
    }
}
