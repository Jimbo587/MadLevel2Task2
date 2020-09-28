package com.example.madlevel2task2

import androidx.annotation.DrawableRes

data class Question(
    var questionText: String,
    var answer: String
) {
    companion object {
        val QUESTIONS = arrayOf(
            "No number from 1 to 999 includes the letter \"a\" in its word form.",
            "The opposite sides of a die will always add up to eight.",
            "Playing dance music can't help ward off mosquitoes.",
            "Cats can't taste sweet things because of a genetic defect.",
            "It's possible to turn peanut butter into diamonds.",
            "The average adult spends more time on the toilet than they do exercising.",
            "Your dominant hand grows faster then your fingernails.",
            "A \"jiffy\" is about one trillionth of a second.",
            "Dragonflies have four legs but can't walk.",
            "Watermelon seeds contain cyanide."
        )
        val QUESTIONS_ANWSER = arrayOf(
            /*true,
            false,
            false,
            true,
            true,
            true,
            false,
            true,
            false,
            false
            */
                "True",
                "False",
                "False",
                "True",
                "True",
                "True",
                "False",
                "True",
                "False",
                "False",

        )
    }
}