package com.example.kumaktests2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kumaktests2.datas.User
import com.example.kumaktests2.starter.Login
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_scores.*

class Scores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores)

        b.setOnClickListener {
            var intent= Intent(this, Login::class.java)
            startActivity(intent)
        }

        button_back_to.setOnClickListener {
            var intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var sharedPreferences = getSharedPreferences("reg", MODE_PRIVATE)
        var edit = sharedPreferences.edit()
        var gson = Gson()
        var userList = mutableListOf<User>()
        var type = object : TypeToken<List<User>>() {}.type
        val users_score_name=intent.getStringExtra("username_for_Score")
        val users_score_password=intent.getStringExtra("user_password_for_Score")
        for(i in userList){
            if(users_score_name==i.name && users_score_password==i.passwpord){
                text_Score.text= users_score_name
            }
        }
    }
}