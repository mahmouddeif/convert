import java.io.PrintWriter
import java.util.*

@JvmField
val INPUT = System.`in`

@JvmField
val OUTPUT = System.out

@JvmField
val _reader = INPUT.bufferedReader()
fun readLine(): String? = _reader.readLine()
fun readLn() = _reader.readLine()!!

@JvmField
var _tokenizer: StringTokenizer = StringTokenizer("")
fun read(): String {
    while (_tokenizer.hasMoreTokens().not()) _tokenizer = StringTokenizer(_reader.readLine() ?: return "", " ")
    return _tokenizer.nextToken()
}

fun readInt() = read().toInt()
fun readDouble() = read().toDouble()
fun readLong() = read().toLong()
fun readStrings(n: Int) = List(n) { read() }
fun readLines(n: Int) = List(n) { readLn() }
fun readInts(n: Int) = List(n) { read().toInt() }
fun readIntArray(n: Int) = IntArray(n) { read().toInt() }
fun readDoubles(n: Int) = List(n) { read().toDouble() }
fun readDoubleArray(n: Int) = DoubleArray(n) { read().toDouble() }
fun readLongs(n: Int) = List(n) { read().toLong() }
fun readLongArray(n: Int) = LongArray(n) { read().toLong() }

@JvmField
val _writer = PrintWriter(OUTPUT, false)
inline fun output(block: PrintWriter.() -> Unit) {
    _writer.apply(block).flush()
}

fun main() {

    println("Enter your meter")
    val meter:Int = read().toInt()
    val inch: Double
    val feet: Double
    val centimeter:Int
    inch = 39.37 * meter
    feet = 3.281 * meter
    centimeter = 100 * meter
    println( "The value of $meter  in Inches is: $inch")
    println( "The value of $meter in feet is: $feet")
    println( "The value of $meter in centimeter is: $centimeter")


}