class RemoteContext(private val state: Int = 67) {
    fun render(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 67) % 997
        }
        return acc
    }
}

fun main() {
    println(RemoteContext().render(67))
}
