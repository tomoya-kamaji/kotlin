fun main(args: Array<String>) {
  println(args)
  // List<Int> を作る。Listは中身を変更できない。
  // list[0] = list[1] + list[2] // ERROR!! 中身を変更できない

  // MutableList<Int> を作る。こっちは中身を変更可能
  val mlist = mutableListOf(1, 2, 3, 4, 5)
  mlist[0] = mlist[1] + mlist[2] // OK

  // Map<Int, String> を作る。
  val map = mapOf(1 to "A", 2 to "B")
  println(map) // "B" と表示される
  println("$map mapの中身")

  // map[1] = "C" // ERROR!! 中身を変更できない

  // MutableMap<Int, String> を作る
  val mmap = mutableMapOf(1 to "A", 2 to "B")
  mmap[1] = "C" // OK
}

fun getInt(str: String): Int {
  return str.toInt()
}


fun getArray(str: String): Array<Int> {
  return str.split(",").map { it.toInt() }.toTypedArray()
}
