package com.example.lab6;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvArticles;
    private ArticleAdapter adapter;
    private List<Article> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvArticles = findViewById(R.id.rcv_articles);
        initData();

        adapter = new ArticleAdapter(articleList, (article, position) -> {
            // 1. Tăng lượt xem lên 1
            article.setViews(article.getViews() + 1);
            adapter.notifyItemChanged(position);

            // 2. Chuyển sang màn hình Detail bằng Intent
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("EXTRA_ARTICLE", article);
            startActivity(intent);
        });

        rcvArticles.setLayoutManager(new LinearLayoutManager(this));
        rcvArticles.setAdapter(adapter);
    }

    private void initData() {
        articleList = new ArrayList<>();
        // Bạn thay R.drawable.ic_launcher_background bằng tên ảnh có sẵn trong thư mục res/drawable
        articleList.add(new Article("Bài viết số 1", "Rau củ sạch Organic", R.drawable.mg_cover_1, 0));
        articleList.add(new Article("Bài viết số 2", "Sách dạy viết code", R.drawable.mg_cover_2, 0));
        articleList.add(new Article("Bài viết số 3", "Điện thoại Iphone 18 Pro Max", R.drawable.mg_cover_3, 0));
    }
}