//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
  for (i in 2..9) {
    println("=== $i 단 ===")
    for (j in 1..9) {
      println("$i x $j = ${i * j}")
    }
    println() // 줄바꿈
  }

val name = "Kotlin"

// 코틀린은 switch가 없습니다.
// 대신 사용하는 것으로 when
when (name) {
  "Kotlin" -> println("Kotlin")
  else -> println("Unknown")
}
  var sum = add(3, 5);
  println("sum is $sum")
  println("${add(3,7)}")

  var a1 = Animal("사자", 3)
  var a2 = Animal("토끼", 8)

  println("${a1.name} 은(는) ${a1.age} 임")
  println("${a2.name} 은(는) ${a2.age} 임")
  println(a1)
  println(a2)

  var numberString: Any = 1
  println(numberString)
  numberString = "문자열임"
  println(numberString)
  
  var arrayTest: Array<Any> =  arrayOf(1,2,3, "문자", "숫자")
  println(arrayTest[3])
}

fun add(a: Int, b: Int): Int {
  return a + b
}
// 클래스 선언
open class Animal(val name: String, val age: Int) {
  override fun toString(): String {
    return "[name: ${name}, age: ${age}]"
  }
}
// 상속 받기
class Dog(name: String, age: Int) : Animal(name = name, age = age) {}


//  val nums = arrayOf(1, 2, 3, 4, 5)
//
//  for (i in 1..5) {
//    // when 문으로 분기 (switch 대체)
//    when (i) {
//      in nums -> println("i is $i") // 배열 안에 있으면 출력
//      else -> println("Unknown")    // 배열에 없으면 Unknown
//    }
//  }
//}

// val => 상수

// 코틀린의 자료형
// Byte, Short, Int, Long, Float, Double, Char, Boolean, String

// 코틀린에만 있는 연산자 :
    //in ---> 배열형자료에 값이 포함되어있으면 true

// is ---> 변수의 자료형이 이것인지 확인
    /** var num: Int = 1
    if (num is Int) {
    // "num"이 Int형이면 이곳을 수행switch
    }
     */


