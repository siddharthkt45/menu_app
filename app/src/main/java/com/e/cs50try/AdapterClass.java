package com.e.cs50try;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class AdapterClass extends RecyclerView.Adapter<AdapterClass.AdapterViewHolder> {

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout linearLayout;
        public TextView textView,textView2;
        public ImageView imageView;

        AdapterViewHolder(View view){
            super(view);

            linearLayout = view.findViewById(R.id.linerlayout);
            textView = view.findViewById(R.id.textView);
            textView2 = view.findViewById(R.id.textView2);
            imageView = view.findViewById(R.id.imageView);
        }
    }

    public List<Menu> menu = Arrays.asList(
            new Menu(R.drawable.masala_dosa,"Dosa",45),
            new Menu(R.drawable.aloo_paratha,"Paratha",45),
            new Menu(R.drawable.samosa,"Samosa",15),
            new Menu(R.drawable.tea,"Tea",10)
    );

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
            Menu current = menu.get(position);
            holder.textView.setText(current.getItemName());
            holder.textView2.setText(Integer.toString(current.getPrice()));
            holder.imageView.setImageResource(current.getImage());
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }
}
