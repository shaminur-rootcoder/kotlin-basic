package com.example.kotlinbasic

class Animal(val name: String, val type: String) {
    fun describe() {
        println("This is a $type named $name.")
    }
}