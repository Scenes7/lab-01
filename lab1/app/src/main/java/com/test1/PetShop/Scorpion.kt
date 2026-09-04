package com.test1.lab1

class Scorpion(name: String, age: Int): Pet(name, age) {
    override fun speak(): String {
        return "hiss"
    }
}