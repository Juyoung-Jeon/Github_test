package com.example.myapplication.Kotlin

// 변수 선언하는 방법(1) - 자료형 자동 지정
var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
}

// 변수 선언 이후에는 앞에 변수 표시 없이 바로 변수명으로 사용가능.

// https://github.com/changja88/Fast_Campus_Android