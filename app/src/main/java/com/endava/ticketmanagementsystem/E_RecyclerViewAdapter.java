package com.endava.ticketmanagementsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class E_RecyclerViewAdapter extends RecyclerView.Adapter<E_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<EventModel> eventModels;


    public E_RecyclerViewAdapter(Context context, ArrayList<EventModel> eventModels){
        this.context = context;
        this.eventModels = eventModels;
    }

    @NonNull
    @Override
    public E_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);
        return new E_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull E_RecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.textView.setText(eventModels.get(position).getDescription());
        holder.imageView.setImageResource(eventModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return eventModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        TextInputLayout textInputLayout1;
        TextInputLayout textInputLayout2;
        Button button;
        MaterialAutoCompleteTextView materialAutoCompleteTextView;
        TextInputEditText textInputEditText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView2);
            textInputLayout1 = imageView.findViewById(R.id.textInputLayout1);
            materialAutoCompleteTextView = imageView.findViewById(R.id.auto_complete_txt);
            textInputLayout2 = imageView.findViewById(R.id.textInputLayout2);
            textInputEditText = imageView.findViewById(R.id.textInputEdit);
            button = imageView.findViewById(R.id.editButton1);


        }
    }
}
