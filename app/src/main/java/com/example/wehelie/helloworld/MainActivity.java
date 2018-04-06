package com.example.wehelie.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView authorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        authorName = findViewById(R.id.author);
    }

    /**
     * @param view
     */
    public void getAuthor(View view) {
        authorName.setText("Adan, Layth @ 6 April 2018");
    }
}
