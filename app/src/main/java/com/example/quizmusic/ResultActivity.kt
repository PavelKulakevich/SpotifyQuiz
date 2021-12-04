package com.example.quizmusic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(QuestionsList.USERNAME)
        val score = intent.getIntExtra(QuestionsList.SCORE, 0)

        if (score >= 1){
            tv_congratulations.text = "Well played $username"
        }else{
            tv_congratulations.text = "You suck $username. Good luck next time"
        }

        pb_result.progress = score

        tv_result_points.text = (score).toString()

        tv_score.text = "Your answered correctly ${score} out of 10 music bands"


        btn_another_shot.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}