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
        authorName = findViewById(R.id.authorTextView);
    }

    /**
     * sets the author name and date to the textview
     */
    public void getAuthor(View view) {
        authorName.setText(R.string.text_info);
    }
}
