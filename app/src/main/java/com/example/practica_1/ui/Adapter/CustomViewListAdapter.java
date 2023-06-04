package com.example.practica_1.ui.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practica_1.R;

import java.util.List;

public class CustomViewListAdapter extends ArrayAdapter<String> {
    private LayoutInflater layoutInflater;
    private int layout;
    private List<String> groups;

    public CustomViewListAdapter(Context context, int resource, List<String> Groups) {
        super(context, resource, Groups);
        this.groups = Groups;
        this.layout = resource;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(this.layout,parent,false);

        TextView textView = view.findViewById(R.id.vlist_text);
        textView.setText(groups.get(position));

        ImageView imageView = view.findViewById(R.id.vlist_mirea);
        imageView.setImageResource(R.drawable.mirea);
        return view;
    }
}