package com.example.learnalphabet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdaptor extends ArrayAdapter<AlhabetInfo> {
public ListAdaptor(@NonNull Context context,int resource,@NonNull ArrayList<AlhabetInfo> arr)
{
  super(context,R.layout.listview_layout,resource,arr);
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        AlhabetInfo info = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_layout, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView7);
        TextView imageName = convertView.findViewById(R.id.textView5);
        imageView.setImageResource(info.getImageid());
        imageName.setText(info.getName().toString());
        return convertView;
    }
}
