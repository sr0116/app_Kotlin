class CollectionTest {
// 코틀린에서 대표적인 컬렉션은
//  listOf(), setOf(), mapOf() : 기본이 Immutable
  // mutable 타입은 아래와 같습니다.
//  mutableListOf(), mutableSetOf(), mutableMapOf()
  //  자바에 있는 것이랑 똑같다고 보면 됨/
  // 특징 : 불변성 클래스, 값 수정 안 됨

  fun sample1() {
    val nums = mutableListOf<Int>(1,2,3)
    nums.add(4)
    println(nums)
  }

  fun sample2() {
    val nums = mutableSetOf<Int>(1,2,3)
    nums.add(3)
    println(nums)
  }

//  3. Entry 객체를 이용
fun sample3() {
  val nums = mutableMapOf(1 to "one",2 to "two",3 to "three")
  nums[4] = "four"
  // 1 map 에서 값을 하나씩 꺼내는 방법
  for ((k, v) in nums ) {
    println("$k -> $v") // 결과값 배열 아님
  }
  // 2
  nums.forEach { (k, v) -> println("$k 를 $v") }
  //3 엔트리 객체 이용
  for (entry in nums.entries) {
    println("${entry.key} -> ${entry.value}")
  }
}

  fun sample4() {
//   일반함수 fun () 대신 () -> Unit = 사용 가능 (무조건 Unit (반환 타임)) 예약어
    val f1 = fun () {println("람다식 사용해보기 ㅎ")}
    // 람다식
    val f2: () -> Unit =  {println("Unit 사용해보기 ㅎㅎ")}
    val f3 = { println("타입추론 사용해보기 ㅎㅎ") }

    f1()
    f2()
    f3()
  }


}