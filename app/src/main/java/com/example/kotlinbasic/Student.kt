package com.example.kotlinbasic

class Student(val name: String, val grade: Int) {
    init {
        println("Student $name with grade $grade created.")
    }
}
