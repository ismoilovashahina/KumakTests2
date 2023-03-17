package com.example.kumaktests2.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kumaktests2.MainActivity
import com.example.kumaktests2.R
import com.example.kumaktests2.datas.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_registeration.*

class Registeration : AppCompatActivity() {
    var pos:Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration)

        var sharedPreferences = getSharedPreferences("reg", MODE_PRIVATE)
        var edit = sharedPreferences.edit()
        var gson = Gson()
        var userList = mutableListOf<User>()
        var type = object : TypeToken<List<User>>() {}.type



        back_to_button.setOnClickListener {
            var intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
        register.setOnClickListener {
            var users = sharedPreferences.getString("users","")
            var pos=false
            if (users==""){
                userList = mutableListOf()
                userList.add(User(editTextTextPersonName_username.text.toString(),editTextTextPassword_password.text.toString()))
                Toast.makeText(this,"Succesfully registered", Toast.LENGTH_SHORT).show()
                val str = gson.toJson(userList)
                edit.putString("users", str).commit()

            }else{
                userList = gson.fromJson(users,type)
                for( i in userList){
                    if(i.name!=editTextTextPersonName_username.text.toString() && i.passwpord!=editTextTextPassword_password.text.toString()){
                        pos=true
                    }
                    else{
                        pos=false
                        break
                    }

                }
                if(pos==true){
                    userList.add(User(editTextTextPersonName_username.text.toString(),editTextTextPassword_password.text.toString()))
                    Toast.makeText(this,"Succesfully registered", Toast.LENGTH_SHORT).show()
                    val str = gson.toJson(userList)
                    edit.putString("users", str).commit()
                    var intent= Intent(this, Login::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"Change inputs!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}