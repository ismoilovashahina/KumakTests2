package com.example.kumaktests2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kumaktests2.quizzes.Geography
import com.example.kumaktests2.quizzes.History
import com.example.kumaktests2.quizzes.Literature
import com.example.kumaktests2.quizzes.Science
import com.example.kumaktests2.starter.Login
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        science.setOnClickListener {
            var intent= Intent(this, Science::class.java)
            startActivity(intent)
        }

        history.setOnClickListener {
            var intent= Intent(this, History::class.java)
            startActivity(intent)
        }
        literature.setOnClickListener {
            var intent= Intent(this, Literature::class.java)
            startActivity(intent)
        }

        geography.setOnClickListener {
            var intent= Intent(this, Geography::class.java)
            startActivity(intent)
        }
        back_to_button.setOnClickListener {
            var intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
        show_score_button.setOnClickListener {
            var intent = Intent(this, Scores::class.java)
            startActivity(intent)
        }
    }
}