class SharedScheduler(private val state: Int = 6) {
    fun dispatch(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 6) % 997
        }
        return value
    }
}

fun main() {
    println(SharedScheduler().dispatch(6))
}
