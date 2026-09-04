package com.lab1.petShop

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}