package com.lab1.petShop

class Sad(date : String): Mood("Sad", date) {

    override fun currentMood() {
        println("The current mode is $mood on the date $date")
    }
}