package com.example.dailywork;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.TextView;

public class SpecialyPickerActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(@Nullable Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_specialty);

        TextView softTechTextView = findViewById(R.id.soft_tech);

        softTechTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(SpecialyPickerActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}
