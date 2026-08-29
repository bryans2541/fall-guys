class StreamProvider(private val state: Int = 36) {
    fun handle(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 36) % 997
        }
        return count
    }
}

fun main() {
    println(StreamProvider().handle(36))
}
