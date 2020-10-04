package com.example.madlevel2task2

data class Question(
    val questionText: String,
    val answer: Boolean
) {
    companion object {
        val QUESTIONS = listOf(
            Question("No number from 1 to 999 includes the letter \"a\" in its word form.", true),
            Question("The opposite sides of a die will always add up to eight.", false),
            Question("Playing dance music can't help ward off mosquitoes.", false),
            Question("Cats can't taste sweet things because of a genetic defect.", true),
            Question("It's possible to turn peanut butter into diamonds.", true),
            Question("The average adult spends more time on the toilet than they do exercising.", true),
            Question("Your dominant hand grows faster then your fingernails.", false),
            Question("A \"jiffy\" is about one trillionth of a second.", true),
            Question("Dragonflies have four legs but can't walk.", false),
            Question("Watermelon seeds contain cyanide.", false)
        )
    }
}