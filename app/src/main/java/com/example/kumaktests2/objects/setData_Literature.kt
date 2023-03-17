package com.example.kumaktests2.objects

import com.example.kumaktests2.datas.Question_Data

object setData_Literature {
    const val name:String="nnn01"
    const val score:String="score"
    fun getQuestion():ArrayList<Question_Data>{
        var que:ArrayList<Question_Data> = arrayListOf()
        var q1=Question_Data(
            "Who was the O'tkir Hoshimov",
            1,
            "poet", "artist","writer","teacher",
            3
        )
        var q2=Question_Data(
            "If (0.2)x = 2 and log 2 = 0.3010, then the value of x to the nearest tenth is:",
            2,

            "-10.0","-0.5","-0.4","-0.2",
            3
        )
        var q3=Question_Data(
            "If 102y = 25, then 10-y equals:",
            3,
            "-1/5",
            "1/625",
            "1/50",
            "1/5",
            4
        )
        var q4=Question_Data(
            "ln(x-2)+ln(2x-3)=2lnx",
            4,"4","6","7","23",
            2
        )
        var q5=Question_Data(
            "(2+3*i)+(1-6*i)-(8+7*i)",
            5,
            "−5−10i", "-3i","12i",
            "-7i",
            1
        )

        var q6=Question_Data(
            "i^64002",
            6,
            "1", "-1","4",
            "-4",
            2
        )
        var q7=Question_Data(
            "3*x^2+8*x=0",
            7,
            "0; -8/3", "0; -3/8","0; -4",
            "0; -8/5",
            1
        )
        var q8=Question_Data(
            "(4 – 5) – (13 – 18 + 2)",
            8,
            "3", "2","1",
            "4",
            2
        )
        var q9=Question_Data(
            "Factor: 5x2 – 15x – 20",
            9,
            "5(x-4)(x+1)", "-2(x-4)(x+5)","-5(x+4)(x-1)",
            "5(x+4)(x+1)",
            1
        )
        var q10=Question_Data(
            "(4x2 - 2x) - (-5x2 - 8x)",
            10,
            "3x(3x + 2)", "3(3x + 2)","3x(3x + 1)",
            "3x(3x - 2)",
            1
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        que.add(q6)
        que.add(q7)
        que.add(q8)
        que.add(q9)
        que.add(q10)


        return que
    }
}