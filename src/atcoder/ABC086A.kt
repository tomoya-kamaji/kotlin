fun main(args: Array<String>) {
  product(2, 5)
  product(3, 5)
  product(4, 5)
}

fun product(a: Int, b: Int): Unit {
  val product = a * b
  val result = if (product % 2 == 0) "Even" else "Odd"

  


  println("$product , $result")
}
