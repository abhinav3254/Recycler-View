package com.example.recyclerviewone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {

    String[] data;

    public MyAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class Holder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tv;

        public Holder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.img1);
            tv = (TextView) itemView.findViewById(R.id.t1);
        }
    }

}
