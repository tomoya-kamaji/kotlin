/*
 * This is main function. Entry point of the application.
 * */
fun main(args: Array<String>) {
    val x: Int = 5

    // CやJavaのswitchの置き換え。breakはいらない。
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        // どれにも当てはまらないならelseが実行される
        else -> { // ブロックも使える
            print("x is neither 1 nor 2")
        }
    }


    val validNumbers: List<Int> = listOf(1, 2, 3)
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }


    // whenもifと同様に式であり、値を返せる。
    val hasPrefix =
            when (x) {
                // 型チェックもできる。チェック後は自動的にキャストされる。
                is String -> x.startsWith("prefix") // xはStringとして扱える
                else -> false
            }

    // 引数を与えなければif文の代わりに使える
    when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }
}
