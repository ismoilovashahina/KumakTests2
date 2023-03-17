package com.example.kumaktests2.objects

import com.example.kumaktests2.datas.Question_Data

object setData {

    const val name: String = "nnn01"
    const val score: String = "score"
    fun getQuestion(): ArrayList<Question_Data> {
        var que: ArrayList<Question_Data> = arrayListOf()
        var q1 = Question_Data(
            "The capital of Uzbekistan",
            1,
            "Tashkent", "Washington", "Moscow", "Italy",
            1
        )
        var q2 = Question_Data(
            "A ball is thrown upwards with a velocity of 55 m/s. Find the velocity after 4 seconds. Also find out the maximum height attained by the ball.",
            2,

            "154.34 m", "50 m", "120 m", "65 m",
            1
        )
        var q3 = Question_Data(
            "An object falling from rest describe 75 metre in the last second of its fall. Find the height from which it fell and the total time taken to fall. Also g = 9.8 m/s2.",
            3,
            "125 m; 6 s",
            "234 m; 15 s",
            "324.4 m; 5 s",
            "325.4 m; 8.15 s",
            4
        )
        var q4 = Question_Data(
            "An object is dropped from a height of 54 metres. What will be the distance travelled by it during the last second of its fall? Also, take g = 9.8 m/s2.",
            4, "27.64 m", "35 m", "12 m", "110 m",
            1
        )
        var q5 = Question_Data(
            "An object moving with an initial velocity of 15 m/s, has a uniform acceleration of 3 m/s2. Find the distance travelled by the object in the 10th second of its motion.",
            5,
            "45 m", "42 m", "43.5 m",
            "43.76 m",
            3
        )

        var q6 = Question_Data(
            "A stone thrown vertically upward with a speed of 25 m/s from the top of a building returns to the earth in 8 seconds. Find the height of the building.",
            6,
            "120 m", "163.6 m", "74.24 m",
            "54 m",
            2
        )
        var q7 = Question_Data(
            "A ball dropped into a well hits the water surface in 6 seconds. How deep is the well and with what velocity the ball hit the water surface?",
            7,
            "89 m/s", "73 m/s", "32.5 m/s",
            "58.8 m/s",
            4
        )
        var q8 = Question_Data(
            "A ball is dropped into a well of depth 200 m. The sound of splash is heard after 7 seconds. Find the velocity of sound in air.",
            8,
            "320.5 m/s", "420 m/s", "200 m/s",
            "327.9 m/s",
            4
        )
        var q9 = Question_Data(
            "A car travelling at 45 km/h is brought to rest with uniform retadation in 15 seconds. Find the retardation.",
            9,
            "0.83 m/s", "10.5 m/s", "120 m/s",
            "23 m/s",
            1
        )
        var q10 = Question_Data(
            "A stone is dropped from a point 5.4 m above a window 1.8 m high. Find the time taken by the stone to pass against the window.",
            10,
            "1.16 s", "5 s", "0.16 s",
            "12.6 s",
            3
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