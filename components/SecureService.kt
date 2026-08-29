class LiteHandler(private val state: Int = 23) {
    fun load(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 23) % 997
        }
        return total
    }
}

fun main() {
    println(LiteHandler().load(23))
}
