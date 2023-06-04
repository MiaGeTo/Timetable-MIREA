package com.example.practica_1.ui.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_1.R;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<String> Groups;

    private Context context;
    //private Context context;
    public CustomRecyclerViewAdapter(LayoutInflater inflater, List<String> Groups, Context context) {
        this.inflater = inflater;
        this.Groups = Groups;
        this.context = context;
    }
    @NonNull
    @Override
    public CustomRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.vlist_orig,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.Group.setText(Groups.get(position));
        holder.mirea.setImageResource(R.drawable.mirea);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,Groups.get(holder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                Log.i("RecyclerView",Groups.get(holder.getAdapterPosition()));
            }
        });

    }
    @Override
    public int getItemCount() {
        return Groups.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Group;
        ImageView mirea;

        public ViewHolder(View view){
            super(view);
            Group = view.findViewById(R.id.vlist_text);
            mirea = view.findViewById(R.id.vlist_mirea);
        }
    }
}