package com.example.quizapp

object Constants {
    const val USER_NAME : String="user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionsList=ArrayList<Questions>()
        val que1= Questions(1,"Which language does this logo belongs to? ",R.drawable.ic_bashlogo,
                            "C++","Rust","Bash","Java",3)
        questionsList.add(que1)

        val que2= Questions(2,"Which operating system is given below? ",R.drawable.ic_linuxlogo,
        "Windows","linux","mac Os","BSD",2)
        questionsList.add(que2)

        val que3=Questions(3,"Who is the CEO of the given company? ",R.drawable.ic_ios_logo,
        "Tim Cook","Satya Nadela","Sundar Pichai","Jeff Bezoz",1)
        questionsList.add(que3)

        val que4=Questions(4,"Who is the CEO of the given logo? ", R.drawable.ic_googlelogo,
        "Elon Musk", "Sundar Pichai","Paras Agrawal","Tom Holland",2)
        questionsList.add(que4)


        return questionsList
    }
}