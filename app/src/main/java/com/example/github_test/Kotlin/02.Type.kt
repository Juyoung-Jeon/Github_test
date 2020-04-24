package com.example.myapplication.Kotlin

// 02. 자료형
// 정수형 : Long > Int > Short > Byte (좌측부터 표현할 수 있는 범위가 넓은 쪽 -> 좁은쪽)
// 실수형 : Double > Float (소숫점도 표현 가능)
// 문자 : Char
// 문자열 : String (문자는 오직 한 글자만, 문자열은 여러 글자 표현 가능)
// 논리형(참True/거짓False) : Boolean

var number = 10

fun main(array:Array<String>){
    number = 20
}
// 자료형을 따로 선언 안하면 지정된 값에 맞게 자동으로 설정됨. 여기서는 10에 따라 Int 로 설정되었기에 20.5는 Syntax Error 발생

// 변수 선언하는 방법(2) - 자료형 수동 지정
// 'var/val 변수 : 자료형 = 값'

var number1: Int = 20
var hello1: String = "hello"
var point1: Double = 3.4

// Variable vs. Value
// Value 는 초기값을 후에 변경할 수 없지만, Variable 은 가능.
// 더 제한적인 Value 로 먼저 선언 후 필요시 Variable 로 바꾸는 것이 코드 변화 추적에 용이.