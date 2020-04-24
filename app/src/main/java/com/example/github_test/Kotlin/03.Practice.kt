package com.example.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5 // 연산 결과도 변수에 넣을 수 있음
var b = "1"
var c = b.toInt()  // Int 로 전환
var d = b.toFloat() // Float 로 전환

var e = "John"
var f = "My name is $e. Nice to meet you" // $변수명: 변수값이 그 위치에 입력

var abc1: Int? = null
var abc2: Double? = null
// Null: 값이 존재않는 아예 없는 상태
// 변수 선언 시 표현 가능
// (ex) var abc: Int = null (x)
// (ex) var abc1: Int? = null (o) <- 자료형 뒤에 ? 붙여줘야 Null 입력 가능

var g = a + 3

fun main(array:Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(abc2)
    println(g)
}



