package com.example.lab6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView img = findViewById(R.id.detail_img);
        TextView tvTitle = findViewById(R.id.detail_title);
        TextView tvViews = findViewById(R.id.detail_views);
        TextView tvContent = findViewById(R.id.detail_content);
        Button btnBack = findViewById(R.id.btn_back);

        // Nhận dữ liệu Article gửi sang
        Article article = (Article) getIntent().getSerializableExtra("EXTRA_ARTICLE");

        if (article != null) {
            img.setImageResource(article.getImgCover());
            tvTitle.setText(article.getTitle());
            tvViews.setText("Views: " + article.getViews());
            tvContent.setText(article.getContent());
        }

        // Bấm nút back để đóng màn hình chi tiết, quay lại danh sách
        btnBack.setOnClickListener(v -> finish());
    }
}
