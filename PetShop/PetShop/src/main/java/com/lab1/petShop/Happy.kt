package com.lab1.petShop

class Happy(date : String): Mood("Happy", date) {

    override fun currentMood() {
        println("The current mode is $mood on the date $date")
    }
}