package com.example.dailywork

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView1 = findViewById<TextView>(R.id.textView1)
        var textView2 = findViewById<TextView>(R.id.textView2)
        var textView3 = findViewById<TextView>(R.id.textView3)

        textView1.setOnClickListener {
            var intent = Intent(this,FirstCourseActivity::class.java)
            intent.putExtra("key", "1")
            startActivity(intent)
        }
        textView2.setOnClickListener {
            var intent = Intent(this,FirstCourseActivity::class.java)
            intent.putExtra("key", "2")
            startActivity(intent)
        }
        textView3.setOnClickListener {
            var intent = Intent(this,FirstCourseActivity::class.java)
            intent.putExtra("key", "3")
            startActivity(intent)
        }
    }
}
