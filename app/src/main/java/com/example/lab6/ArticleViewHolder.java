package com.example.lab6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    public TextView tvTitle;
    public TextView tvContent;
    public TextView tvViews;
    public ImageView imgCover;

    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tv_title);
        tvContent = itemView.findViewById(R.id.tv_content);
        tvViews = itemView.findViewById(R.id.tv_views);
        imgCover = itemView.findViewById(R.id.img_cover);
    }
}
