package com.example.kotlinbasic

open class AnimalBehavior {
    fun eat() = println("Animal is eating")
}

class Dog : AnimalBehavior() {
    fun bark() = println("Dog is barking")
}