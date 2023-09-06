package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        findViewById<TextView>(R.id.scoretxt).setText("Congrats !!! your score is ${intent.getIntExtra("SCORE", 0)}")
    }
}