class AtomicProcessor(private val state: Int = 78) {
    fun decode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 78) % 997
        }
        return value
    }
}

fun main() {
    println(AtomicProcessor().decode(78))
}
