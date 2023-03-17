package com.example.kumaktests2.objects

import com.example.kumaktests2.datas.Question_Data

object setData_Science {
    const val name:String="nnn01"
    const val score:String="score"
    fun getQuestion():ArrayList<Question_Data>{
        var que:ArrayList<Question_Data> = arrayListOf()
        var q1=Question_Data(
            "The smallest element?",
            1,
            "water", "air","atom","molecule",
            3
        )
        var q2=Question_Data(
            "What is the diameter of Sun?",
            2,

            "1,392,684 km","145,263,987 km","2,598,745 km","5,392,684 km",
            1
        )
        var q3=Question_Data(
            "The most suitable unit for expressing nuclear radius is ...",
            3,
            "fermi",
            "nanometre",
            "angstrom",
            "micro",
            1
        )
        var q4=Question_Data(
            "Rain drops acquire spherical shape due to ",
            4,"surface tension","viscosity","elasticity","friction",
            1
        )
        var q5=Question_Data(
            "Temperature can be expressed as derived quantity in terms of any of the following",
            5,
            "length and mass", "in terms of none","length,mass and time",
            "mass and time",
            2
        )

        var q6=Question_Data(
            "Pieces of camphor placed on water move about rapidly. This is because of",
            6,
            "diffusion", "viscosity","surface tension",
            "capillarity",
            3
        )
        var q7=Question_Data(
            "Air pressure is usually highest when the air is",
            7,
            "warm and moist", "cool and dry","warm and dry",
            "cool and moist",
            4
        )
        var q8=Question_Data(
            "The minimum number of Non zero non collinear vectors required to produce a zero vector is",
            8,
            "3", "2","1",
            "4",
            1
        )
        var q9=Question_Data(
            "Which is best used as a sound absorbing material in partition walls?",
            9,
            "Stone chips", "Steel","Glass - wool",
            "Glass pieces",
            3
        )
        var q10=Question_Data(
            "To produce deflection in a television picture tube:",
            10,
            "an electric field is used", "a magnetic field is used","electric and magnetic field",
            "none of the above",
            2
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