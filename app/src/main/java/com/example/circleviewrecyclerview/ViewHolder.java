package com.example.circleviewrecyclerview;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

    CircleImageView image;
    TextView imageName;
    LinearLayout parentLayout;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        imageName = itemView.findViewById(R.id.textView);
        parentLayout = itemView.findViewById(R.id.parentid);

    }
}
