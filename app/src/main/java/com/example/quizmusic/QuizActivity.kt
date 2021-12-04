package com.example.quizmusic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizmusic.databinding.ActivityQuizBinding
import kotlinx.android.synthetic.main.activity_quiz.*


class QuizActivity : AppCompatActivity(){

    private lateinit var binding: ActivityQuizBinding
    private var currentPosition = 1
    private var questionsList: ArrayList<Question>? = null
    private var userName: String? = null
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userName = intent.getStringExtra(QuestionsList.USERNAME)

        questionsList = QuestionsList.getQuestions()
        questionsList!!.shuffle()

        setQuestion()

    }

    private fun setQuestion() {
        if (currentPosition - 1 != questionsList?.size){
            btn_submit_or_next.text = "SUBMIT"
        }
        val question: Question = questionsList!![currentPosition - 1]
        pb_quiz_progress.progress = currentPosition
        tv_quiz_progress.text = "$currentPosition" + "/" + pb_quiz_progress.max
        tv_question.text = question.question
        iv_band.setImageResource(question.image)
    }

    fun submitAnswer(view: android.view.View) {
        val answer = et_answer.text.toString()
        val question = questionsList?.get(currentPosition - 1)

        if (question!!.correctAnswer == answer){
            score += 1
            tv_points.text = "$score/10"
        }
        currentPosition++
        et_answer.text?.clear()

                when {
                    currentPosition <= 10 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(QuestionsList.USERNAME, userName)
                        intent.putExtra(QuestionsList.SCORE, score)
                        startActivity(intent)
                        finish()
                    }
                }
    }


}