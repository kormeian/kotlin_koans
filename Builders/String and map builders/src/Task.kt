import java.util.HashMap

fun <k, v> buildMutableMap(build: HashMap<k, v>.() -> Unit): Map<k, v> {
    val map = HashMap<k, v>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
