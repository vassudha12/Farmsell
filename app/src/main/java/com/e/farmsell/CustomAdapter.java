package com.e.farmsell;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Activity activity ;
        Integer pictures[];
    String data[];



    public CustomAdapter(Activity activity,Integer pictures[],String data[])
    {
        this.activity=activity;
        this.pictures=pictures;
        this.data=data;



    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =activity.getLayoutInflater().inflate(R.layout.custom_layout,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;

    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(pictures[position]);
        holder.textView.setText(""+data[position]);

    }

    @Override
    public int getItemCount() {
        return pictures.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;


        public MyViewHolder(View itemView)
        {
            super(itemView);
            imageView =itemView.findViewById(R.id.imageViewCard);
            textView =itemView.findViewById(R.id.textViewCard);



        }
    }
}


