package com.example.calculator


import com.example.calculator.Calculator.add
import com.example.calculator.Calculator.divide
import com.example.calculator.Calculator.multiply
import com.example.calculator.Calculator.subtract
import org.junit.Assert
import org.junit.Test
import java.lang.Float

class AdditionTest {
    @Test
    fun testAdd_2_positives() {
        var str1 = 12
        var str2 = 13
        Assert.assertEquals(add(str1, str2), 25)
    }
    @Test
    fun testAdd_2_negatives() {
        var str1 = -12
        var str2 = -13
        Assert.assertEquals(add(str1, str2), -25)
    }
    @Test
    fun testAdd_1_negative_1_positive() {
        var str1 = -12
        var str2 = 13
        Assert.assertEquals(add(str1, str2), 1)
    }
    @Test
    fun testAdd_1_negative_and_0() {
        var str1 = -12
        var str2 = 0
        Assert.assertEquals(add(str1, str2), -12)
    }
    @Test
    fun testAdd_1_positive_and_0() {
        var str1 = 12
        var str2 = 0
        Assert.assertEquals(add(str1, str2), 12)
    }
}
class SubtractionTest {

    @Test
    fun testSubtract_2_positives() {
        var str1 = 12
        var str2 = 13
        Assert.assertEquals(subtract(str1, str2), -1)
    }
    @Test
    fun testSubtract_2_negatives() {
        var str1 = -12
        var str2 = -13
        Assert.assertEquals(subtract(str1, str2), 1)
    }
    @Test
    fun testSubtract_1_negative_1_positive() {
        var str1 = -12
        var str2 = 13
        Assert.assertEquals(subtract(str1, str2), -25)
    }
    @Test
    fun testSubtract_1_negative_and_0() {
        var str1 = -12
        var str2 = 0
        Assert.assertEquals(subtract(str1, str2), -12)
    }
    @Test
    fun testSubtract_1_positive_and_0() {
        var str1 = 12
        var str2 = 0
        Assert.assertEquals(subtract(str1, str2), 12)
    }
}
class MultiplicationTest {

    @Test
    fun testMultiply_2_positives() {
        var str1 = 12
        var str2 = 13
        Assert.assertEquals(multiply(str1, str2), 156)
    }
    @Test
    fun testMultiply_2_negatives() {
        var str1 = -12
        var str2 = -13
        Assert.assertEquals(multiply(str1, str2), 156)
    }
    @Test
    fun testMultiply_1_negative_1_positive() {
        var str1 = -12
        var str2 = 13
        Assert.assertEquals(multiply(str1, str2), -156)
    }
    @Test
    fun testMultiply_1_negative_and_0() {
        var str1 = -12
        var str2 = 0
        Assert.assertEquals(multiply(str1, str2), 0)
    }
    @Test
    fun testMultiply_1_positive_and_0() {
        var str1 = 12
        var str2 = 0
        Assert.assertEquals(multiply(str1, str2), 0)
    }
}
class DivisionTest {

    @Test
    fun testDivide_2_positives() {
        var str1 = 12
        var str2 = 13
        Assert.assertEquals(divide(str1, str2), 0.9230769.toFloat())
    }
    @Test
    fun testDivide_2_negatives() {
        var str1 = -12
        var str2 = -13
        Assert.assertEquals(divide(str1, str2), 0.9230769.toFloat())
    }
    @Test
    fun testDivide_1_negative_1_positive() {
        var str1 = -12
        var str2 = 13
        Assert.assertEquals(divide(str1, str2), (-0.9230769).toFloat())
    }
    @Test
    fun testDivide_1_negative_and_0() {
        var str1 = -12
        var str2 = 0
        Assert.assertEquals(divide(str1, str2), Float.NEGATIVE_INFINITY)
    }
    @Test
    fun testDivide_1_positive_and_0() {
        var str1 = 12
        var str2 = 0
        Assert.assertEquals(divide(str1, str2), Float.POSITIVE_INFINITY)
    }
}