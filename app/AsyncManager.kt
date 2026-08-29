class AtomicHandler(private val state: Int = 92) {
    fun encode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 92) % 997
        }
        return value
    }
}

fun main() {
    println(AtomicHandler().encode(92))
}
