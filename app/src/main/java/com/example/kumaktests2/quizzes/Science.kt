package com.example.kumaktests2.quizzes

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.kumaktests2.MainActivity
import com.example.kumaktests2.R
import com.example.kumaktests2.datas.Question_Data
import com.example.kumaktests2.objects.setData_Science
import kotlinx.android.synthetic.main.test_layout.*

class Science : AppCompatActivity() {
    private var Name:String?=null
    private var score:Int=0
    private var currentPosition:Int=1
    private var questionList:ArrayList<Question_Data> ?= null
    private var selectedOption:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_layout)

        questionList=setData_Science.getQuestion()
        setQuestion()

        Name=intent.getStringExtra(setData_Science.name)
        opt_1.setOnClickListener {
            selectedOptionStyle(opt_1,1)
        }
        opt_2.setOnClickListener {
            selectedOptionStyle(opt_2,2)
        }
        opt_3.setOnClickListener {
            selectedOptionStyle(opt_3,3)
        }
        opt_4.setOnClickListener {
            selectedOptionStyle(opt_4,4)
        }
        back_to_button.setOnClickListener {
            var intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        submit.setOnClickListener {
            if(selectedOption!=0){
                val question = questionList!![currentPosition-1]
                if(selectedOption!=question.correct_ans){
                    setColor(selectedOption, R.drawable.wrong_question_option)
                }
                else{
                    score++;
                }
                setColor(question.correct_ans,R.drawable.correct_question_option)
                if(currentPosition==questionList!!.size){
                    submit.text="FINISH!"
                }
                else{
                    submit.text="Next"
                }
            }
            else{
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                    }
                    else->{
                        var intent= Intent(this,com.example.kumaktests2.Result::class.java)
                        intent.putExtra(setData_Science.name, Name.toString())
                        intent.putExtra(setData_Science.score, score.toString())
                        intent.putExtra("total size",questionList!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }
            }
            selectedOption=0
        }

    }

    fun setColor(opt: Int, color:Int){
        when(opt){
            1->{
                opt_1.background= ContextCompat.getDrawable(this,color)
            }
            2->{
                opt_2.background= ContextCompat.getDrawable(this,color)
            }
            3->{
                opt_3.background= ContextCompat.getDrawable(this, color)
            }
            4->{
                opt_4.background= ContextCompat.getDrawable(this, color)
            }
        }
    }
    fun setQuestion(){
        val question = questionList!![currentPosition-1]
        setOptionStyle()

        progress_bar.progress=currentPosition
        progress_bar.max=questionList!!.size
        progress_text.text="${currentPosition}"+"/"+"${questionList!!.size}"
        question_text.text=question.question
        opt_1.text=question.option_one
        opt_2.text=question.option_two
        opt_3.text=question.option_three
        opt_4.text=question.option_four
    }

    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt_1)
        optionList.add(1,opt_2)
        optionList.add(2,opt_3)
        optionList.add(3,opt_4)

        for(op in optionList){
            op.setTextColor(Color.parseColor("#555151"))
            op.background= ContextCompat.getDrawable(this, R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }
    }

    fun selectedOptionStyle(view: TextView, opt:Int){
        setOptionStyle()
        selectedOption=opt
        view.background= ContextCompat.getDrawable(this, R.drawable.selected_question_option)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
}