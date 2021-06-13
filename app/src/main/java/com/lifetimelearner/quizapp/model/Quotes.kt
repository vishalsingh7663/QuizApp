package com.lifetimelearner.quizapp.model

import java.util.*

object Quotes {
    private val quotes = arrayOf(
        "“Any fool can write code that a computer can understand. Good programmers write code that humans can understand.” – Martin Fowler",
        "“First, solve the problem. Then, write the code.” – John Johnson",
        "“Experience is the name everyone gives to their mistakes.” – Oscar Wilde",
        "“In order to be irreplaceable, one must always be different” – Coco Chanel",
        "“Knowledge is power.” – Francis Bacon",
        "“Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.” – Dan Salomon",
        "“Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.” – Antoine de Saint-Exupery",
        "“Code is like humor. When you have to explain it, it’s bad.” – Cory House",
        "“Fix the cause, not the symptom.” – Steve Maguire",
        "“Simplicity is the soul of efficiency.” – Austin Freeman",
        "“Before software can be reusable it first has to be usable.” – Ralph Johnson",
        "“Make it work, make it right, make it fast.” – Kent Beck",
        "“Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.” - Martin Golding",
        "“In order to understand recursion, one must first understand recursion.” - Anonymous",
        "“Don’t worry if it doesn’t work right. If everything did, you’d be out of a job.” - Mosher’s Law of Software Engineering",
        "“Programming isn't about what you know; it's about what you can figure out.” - Chris Pine",
        "“The only way to learn a new programming language is by writing programs in it.” - Dennis Ritchie",
        "“Sometimes it's better to leave something alone, to pause, and that's very true of programming.” - Joyce Wheeler",
        "“In some ways, programming is like painting. You start with a blank canvas and certain basic raw materials. You use a combination of science, art, and craft to determine what to do with them.” - Andrew Hunt",
        "“Testing leads to failure, and failure leads to understanding.” - Burt Rutan",
        "“The best error message is the one that never shows up.” - Thomas Fuchs",
        "“Don't write better error messages, write code that doesn't need them.” - Jason C. McDonald",
        "“A son asked his father (a programmer) why the sun rises in the east, and sets in the west. His response? It works, don’t touch!”",
        "“Copy-and-Paste was programmed by programmers for programmers actually.”",
        "“Remember that there is no code faster than no code.”",
        "“Programming made the impossible possible. You can have a null object and a constant variable.”",
        "“Good code is its own best documentation. As you're about to add a comment, ask yourself, \"How can I improve the code so that this comment isn't needed?\" Improve the code and then document it to make it even clearer.”- Steve McConnell",
        "“Computers are good at following instructions, but not at reading your mind.” - Donald Knuth",
        "“Any code of your own that you haven't looked at for six or more months might as well have been written by someone else.”- Eagleson's law"
    )

    fun getTodayQuote() : String {
        return getRandomQuote()
        /*
        val index = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)%(quotes.size)
        return quotes[index]
         */
    }

    private fun getRandomQuote() : String {
        val index = Random().nextInt(quotes.size)
        return quotes[index]
    }

}