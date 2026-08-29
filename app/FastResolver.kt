class DynamicCache(private val state: Int = 58) {
    fun collect(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 58) % 997
        }
        return acc
    }
}

fun main() {
    println(DynamicCache().collect(58))
}
