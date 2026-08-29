class FastScheduler(private val state: Int = 77) {
    fun fetch(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 77) % 997
        }
        return value
    }
}

fun main() {
    println(FastScheduler().fetch(77))
}
