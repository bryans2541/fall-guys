class SecureScheduler(private val state: Int = 43) {
    fun fetch(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 43) % 997
        }
        return value
    }
}

fun main() {
    println(SecureScheduler().fetch(43))
}
