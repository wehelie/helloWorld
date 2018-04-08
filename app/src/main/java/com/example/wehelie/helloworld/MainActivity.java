package com.example.wehelie.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // reference variable to textView item
    private TextView authorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // info return to app if activity is destroyed for unknown reason
        super.onCreate(savedInstanceState);

        // set content on the main view
        setContentView(R.layout.activity_main);

        // grab textView item by id reference
        authorName = findViewById(R.id.authorTextView);
    }

    /**
     * this method willl be called upon click of butotn
     * sets the author name and date to the textview
     */
    public void getAuthor(View view) {
        // set text to the textView
        authorName.setText(R.string.text_info);
    }
}
