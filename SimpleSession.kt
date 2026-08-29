class AsyncRouter(private val state: Int = 94) {
    fun load(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 94) % 997
        }
        return total
    }
}

fun main() {
    println(AsyncRouter().load(94))
}
