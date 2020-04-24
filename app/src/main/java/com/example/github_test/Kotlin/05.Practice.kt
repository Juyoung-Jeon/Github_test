package com.example.myapplication.Kotlin

// 지난 시간 학습내용 바탕으로 사칙연산 함수 생성

fun plusThree(first:Int, second: Int, third: Int): Int{
    val result = first + second + third
    return result
} // val, return 이렇게 두 줄에 걸쳐 쓰지않고 바로 val 없이 return first + second + third 도 가능


fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int=1, second: Int=1, third: Int=1): Int{
    return first * second * third
} // 0을 곱하면 다른값에 상관없이 0이 되므로 디폴트 값을 1로 지정

// 내부함수: 함수 안에 있는 함수
fun showMyPlus(first: Int, second: Int): Int{
    println(first)
    println(second)
    // 기존의 방식은 'return first + second', 여기서는 일부러 내부함수 사용.
    fun plus(first: Int, second: Int): Int{
        return first + second
    }
    return plus(first, second)
}

// 변수명을 밝히며 수치를 대입할 수도 있고, 스튜디오에서 자동지정 해줄 수도 있음.
fun main(array:Array<String>){
    val result = plusThree(1,2,3)
    println(result)
    val result2 = minusThree(10,1,2)
    println(result2)
    val result3 = multiplyThree(2, 2, 2)
    println(result3)
    val result4 = multiplyThree()
    println(result4)

    println()
    val result5 = showMyPlus(4,5)
    println(result5)
}

// println(): 출력 시 줄 구분
// Ctrl + 개체 선택 : 개체의 사용처 알려줌.
