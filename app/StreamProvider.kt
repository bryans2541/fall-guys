class SharedProcessor(private val state: Int = 27) {
    fun flush(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 27) % 997
        }
        return count
    }
}

fun main() {
    println(SharedProcessor().flush(27))
}
