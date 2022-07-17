
class Person {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun main() {

    /** Scope Function: 'run'
    Property 1: Refer to contex≥t object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    val person: Person? = Person()
    // うるう年の計算


    val bio = person?.run {
        println(age)
        println(name)
        age + 5
        "He is a freak who loves to teach in his own way"   // will be returned and stored in 'bio' variable
    }

    println(bio)
}