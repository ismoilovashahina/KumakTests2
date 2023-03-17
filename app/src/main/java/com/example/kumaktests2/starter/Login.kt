package com.example.kumaktests2.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kumaktests2.MainActivity
import com.example.kumaktests2.R
import com.example.kumaktests2.datas.User
import com.example.kumaktests2.objects.setData
import com.example.kumaktests2.objects.setData_Science
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var sharedpreferences = getSharedPreferences("reg", MODE_PRIVATE)
        var edit = sharedpreferences.edit()
        var gson = Gson()
        var userList = mutableListOf<User>()
        var type = object : TypeToken<List<User>>() {}.type


        button_next.setOnClickListener{
            var users = sharedpreferences.getString("users", "")
            var pos = false

            if (users == "") {
                Toast.makeText(this, "Enter empty blanks!", Toast.LENGTH_SHORT).show()

            } else {
                userList = gson.fromJson(users, type)
                for (i in userList) {
                    if (i.name == input.text.toString() && i.passwpord == editTextTextPassword2.text.toString()) {
                        pos = true
                        break
                    } else {
                        pos = false
                    }
                }

                if (pos == true) {
                    var intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("${setData.name}", input.text.toString())
                    intent.putExtra("username_for_Score",input.text.toString())
                    intent.putExtra("user_password_for_Score",editTextTextPassword2.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "You have not registered yet!", Toast.LENGTH_SHORT).show()
                }
            }

        }
        sing_up_button.setOnClickListener {
            var intent = Intent(this, Registeration::class.java)
            startActivity(intent)
        }


    }
}