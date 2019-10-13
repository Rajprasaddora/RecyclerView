package com.example.android.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Newadapter extends RecyclerView.Adapter <Newadapter.Newholder>{

   List<Question> list;

    public Newadapter(ArrayList<Question> list) {
        this.list = list;
    }

    @Override
    public Newholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.single_row,viewGroup,false);
        return new Newholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Newholder newholder, int i) {
        newholder.question.setText(list.get(i).getQuestion());
        newholder.option1.setText(list.get(i).getOption1());
        newholder.option2.setText(list.get(i).getOption2());
        newholder.option3.setText(list.get(i).getOption3());
        newholder.option4.setText(list.get(i).getOption4());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class Newholder extends RecyclerView.ViewHolder {
        private TextView question;
        private TextView option1;
        private TextView option2;
        private TextView option4,option3;
        public Newholder(@NonNull View itemView)
        {
            super(itemView);
            question=(TextView) itemView.findViewById(R.id.question);
            option1=(TextView) itemView.findViewById(R.id.option1);
            option2=(TextView) itemView.findViewById(R.id.option2);
            option3=(TextView) itemView.findViewById(R.id.option3);
            option4=(TextView) itemView.findViewById(R.id.option4);
        }
    }


}
