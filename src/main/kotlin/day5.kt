import java.io.File
import java.util.Stack

fun main() {
    val file = File("src/main/resources/input5.txt").readText()
    val stack = Stack<Char>()

    createTable("RHMPZ")
}

fun createTable(stack: String){
    println(stack.split("").filter { it != "" })
}
