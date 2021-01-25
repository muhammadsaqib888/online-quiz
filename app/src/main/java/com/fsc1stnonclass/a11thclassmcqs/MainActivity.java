package com.fsc1stnonclass.a11thclassmcqs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button start_btn,bookmarksbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookmarksbtn = findViewById(R.id.bookmark_btn);
        start_btn = findViewById(R.id.start_btn);
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent subjectintent = new Intent(MainActivity.this,subjectActivity.class);
                startActivity(subjectintent);
            }
        });

        bookmarksbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookintent = new Intent(MainActivity.this,BookmarkActivity.class);
                startActivity(bookintent);
            }
        });
    }
}