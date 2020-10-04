package com.example.madlevel2task2

import androidx.recyclerview.widget.ItemTouchHelper

data class Question(
    val questionText: String,
    val answer: Int
) {
    companion object {
        private val correct = ItemTouchHelper.LEFT
        private val incorrect = ItemTouchHelper.RIGHT
        val QUESTIONS : Array<Question> = arrayOf(
            Question( "No number from 1 to 999 includes the letter \"a\" in its word form.", correct),
            Question( "The opposite sides of a die will always add up to eight.", incorrect),
            Question( "Playing dance music can't help ward off mosquitoes.", incorrect),
            Question( "Cats can't taste sweet things because of a genetic defect.", correct),
            Question( "It's possible to turn peanut butter into diamonds.", correct),
            Question( "The average adult spends more time on the toilet than they do exercising.", correct),
            Question( "Your dominant hand grows faster then your fingernails.", incorrect),
            Question( "A \"jiffy\" is about one trillionth of a second.", correct),
            Question( "Dragonflies have four legs but can't walk.", incorrect),
            Question( "Watermelon seeds contain cyanide.", incorrect)
        )
    }
}