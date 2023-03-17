package com.example.kumaktests2.objects

import com.example.kumaktests2.datas.Question_Data

object setData_History {
    const val name:String="nnn01"
    const val score:String="score"
    fun getQuestion():ArrayList<Question_Data>{
        var que:ArrayList<Question_Data> = arrayListOf()
        var q1=Question_Data(
            "When did World War II end?",
            1,
            "1941", "1945","1937","1914",
            2
        )
        var q2=Question_Data(
            "What is the year 1982 in Roman Numerals?",
            2,

            "MCMLXXXII","MCMLXXXIIVII","MCMMXXII","MMCMII",
            1
        )
        var q3=Question_Data(
            "How many vertices are present on a cube?",
            3,
            "4",
            "8",
            "2",
            "7",
            2
        )
        var q4=Question_Data(
            "How many hours are there in a year (rounded to the nearest hour)?",
            4,"8760 hours","8560 hours","8860 hours","8786 hours",
            1
        )
        var q5=Question_Data(
            "What is the highest common factor of the numbers 30 and 132?",
            5,
            "5", "2","6",
            "1",
            3
        )

        var q6=Question_Data(
            "Find the Missing Term in Multiples of 6 : 6, 12, 18, 24, _, 36, 42, _ 54, 60.",
            6,
            "32, 45", "30, 48","24, 40",
            "25, 49",
            2
        )
        var q7=Question_Data(
            "What is the only number that has letters in alphabetical order?",
            7,
            "40", "5","8",
            "30",
            1
        )
        var q8=Question_Data(
            "How many days are there in one leap year? ",
            8,
            "86,600", "86,400","84,600",
            "86,200",
            2
        )
        var q9=Question_Data(
            "How many times can a sheet of paper be folded in half? ",
            9,
            "5", "7","2",
            "9",
            2
        )
        var q10=Question_Data(
            "What is the only prime number that is even? ",
            10,
            "4", "6","7",
            "2",
            4
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