class SharedCollector(private val state: Int = 31) {
    fun parse(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 31) % 997
        }
        return total
    }
}

fun main() {
    println(SharedCollector().parse(31))
}
