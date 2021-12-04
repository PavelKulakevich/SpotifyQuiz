package com.example.quizmusic

object QuestionsList {

    const val USERNAME = "username"
    const val SCORE = "score"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What is the name of music band?",
            R.drawable.incubus,
            "Incubus"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What is the name of music band?",
            R.drawable.aha,
            "A-ha"
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What is the name of music band?",
            R.drawable.balthazar,
            "Balthazar"
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What is the name of music band?",
            R.drawable.placebo,
            "Placebo"
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What is the name of music band?",
            R.drawable.queen,
            "Queen"
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What is the name of music band?",
            R.drawable.deftones,
            "Deftones"
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What is the name of music band?",
            R.drawable.interpol,
            "Interpol"
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What is the name of music band?",
            R.drawable.rhcp,
            "Red Hot Chili Peppers"
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What is the name of music band?",
            R.drawable.disturbed,
            "Disturbed"
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What is the name of music band?",
            R.drawable.kills,
            "The Kills"
        )
        questionsList.add(que10)

        val que11 = Question(
            11,"What is the name of music band?",
            R.drawable.patd,
            "Panic! At the disco"
        )
        questionsList.add(que11)

        val que12 = Question(
            12,"What is the name of music band?",
            R.drawable.backstreetboys,
            "Backstreet Boys"
        )
        questionsList.add(que11)

        val que13 = Question(
            13,"What is the name of music band?",
            R.drawable.nodoubt,
            "No Doubt"
        )
        questionsList.add(que13)

        val que14 = Question(
            14,"What is the name of music band?",
            R.drawable.peachpit,
            "Peach Pit"
        )
        questionsList.add(que14)

        val que15 = Question(
            15,"What is the name of music band?",
            R.drawable.kasabian,
            "Kasabian"
        )
        questionsList.add(que15)


        return questionsList
    }
}