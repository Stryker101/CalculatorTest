package com.example.calculator

object Calculator {
    fun add(a: Int, b: Int): Long {
        return (a + b).toLong()
    }
    fun subtract(a: Int, b: Int): Long {
        return (a - b).toLong()
    }
    fun multiply(a: Int, b: Int): Long {
        return (a * b).toLong()
    }
    fun divide(a: Int, b: Int): Float{
        return (a.toDouble() / b).toFloat()
    }
}