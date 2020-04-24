package com.example.myapplication.Kotlin

// 04. Function
// 함수: input 대응하는 output 출력.
// 함수를 선언하는 방법
// 'fun 함수명(변수명: 자료형, 변수명: 자료형): 반환형{
//  함수 내용
//  return 반환값
//  }

fun plus(first: Int, second: Int):Int{
    val result:Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기 result 의 역할??
fun plusFive(first: Int, second: Int = 5):Int{
    val result: Int = first + second
    return result
}

// 반환값 없는 함수 만들기??
// 모든 함수가 반환값을 리턴할 필요 없음 -> 반환형을 적는 란에 Unit 넣거나 생략 가능.
fun printPlus(first: Int, second: Int): Unit{
    val result: Int = first + second
    println(result)
}

fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단한 함수 선언법
fun plusShort(first: Int, second: Int) = first + second

// 가변인자 갖는 함수 선언법 (1~n개의 인자를 받을 수 있는 함수로 first, second 처럼 제한 되어있지 않음)
// vararg 활용 ??
fun plusMany(vararg numbers: Int){
    for (number in numbers)
    println(number)
}

// main 함수 분석 - fun(함수), main(함수명), array(함수의 인자). Array(인자명), <String>: 자료형(Unit 은 생략 가능)
fun main(array:Array<String>){

// 함수 호출법
    val result = plus(5,10)
    println(result)

// 인수 명시적 전달법 (입력 순서 변경 가능)
    val result2 = plus(first=20, second = 30)
    println(result2)
    val result3 = plus(second = 100, first = 10)
    println(result3)

//  디폴트 값 갖는 함수 선언법
    val result4 = plusFive(10,20)
    println(result4)
    // 특정값이 입력되면 디폴트 값은 무시됨.
    val result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10,20)

    println()
    val result6 = plusShort(50,50)
    println(result6)

    println()
    plusMany(1,2,3)
    plusMany(100)
}
