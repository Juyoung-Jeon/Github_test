package com.example.myapplication.Kotlin

fun main(array:Array<String>){

// (1) 산술 연산자

    var a = 10 + 1 + 2
    var b = 10 - 1
    var c = 1 * 9
    var d = 20/3
    var e = 20%3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

// (2) 대입 연산자

    val f = 5  // val 5 = f (x)

// (3) 복합 대입 연산자

    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2

    println()
    println()
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

// (4) 증감 연산자 (+++, --- 는 없음)

    a++
    b--

// (5) 비교 연산자 (결과로 논리값 True, False 도출, '!'는 논리값만 뒤집을 뿐 숫자는 처리 불가)

    var g = a > b
    var h = a == b
    var i = !h
    var l = i != h

    println()
    println(g)
    println(h)
    println(i)
    println(l)

// (6) 논리 연산자

    val j = h && i
    val k = h || i
    println()
    println(j)
    println(k)
}