package com.example.dailywork;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstCourseActivity extends AppCompatActivity {

    private TextView lector, subject, currentWeek, startingHour;
    private String courseName;

    @Override
    protected  void onCreate(@Nullable Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_first_course);

        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            String value = extras.getString("key");
        switch (value){
            case "1": populateWithFirstLectureInfo(); break;
            case "2": populateWithSecondLectureInfo(); break;
            case "3": populateWithThirdLectureInfo(); break;
            }
        }

        Button shareButton = findViewById(R.id.shareButton);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showShareIntent();
            }
        });



    }

    private void showShareIntent() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("plain/text");
        String shareBodyText = courseName;
        String shareSubject = "A course from the day";
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
        startActivity(Intent.createChooser(shareIntent, "Share via"));

    }

    private void populateWithFirstLectureInfo(){
        courseName = "Intro To C# Lecture";
        lector =  findViewById(R.id.textViewLector);
        lector.setText("Ivan Georgiev");
        subject = findViewById(R.id.textViewSubject);
        subject.setText(courseName);
        currentWeek = findViewById(R.id.textViewCurrentWeek);
        currentWeek.setText("3");
        startingHour = findViewById(R.id.textViewStartingHour);
        startingHour.setText("09:15");
    }

    private void populateWithSecondLectureInfo(){
        courseName = "Intro To C# Exercise";
        TextView lector = findViewById(R.id.textViewLector);
        lector.setText("Georgi Ivanov");
        TextView subject = findViewById(R.id.textViewSubject);
        subject.setText(courseName);
        TextView currentWeek = findViewById(R.id.textViewCurrentWeek);
        currentWeek.setText("3");
        TextView startingHour = findViewById(R.id.textViewStartingHour);
        startingHour.setText("10:15");
    }

    private void populateWithThirdLectureInfo(){
        courseName = "OOP with Java";
        TextView lector = findViewById(R.id.textViewLector);
        lector.setText("Stanislav Dimitrov");
        TextView subject = findViewById(R.id.textViewSubject);
        subject.setText(courseName);
        TextView currentWeek = findViewById(R.id.textViewCurrentWeek);
        currentWeek.setText("3");
        TextView startingHour = findViewById(R.id.textViewStartingHour);
        startingHour.setText("11:15");
    }
}
