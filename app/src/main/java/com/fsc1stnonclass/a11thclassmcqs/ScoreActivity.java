package com.fsc1stnonclass.a11thclassmcqs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView testscored, totalscore;
    private Button donebtan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        testscored = findViewById(R.id.scored);
        totalscore = findViewById(R.id.total);
        donebtan = findViewById(R.id.done_btn);

        testscored.setText(String.valueOf(getIntent().getIntExtra("score",0)));
        totalscore.setText("OUT OF "+String.valueOf(getIntent().getIntExtra("total",0)));



        donebtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}