package creationalpattern.prototype

// for clone able
class Computer : Cloneable {
    var os: String? = null
    var name: String? = null
    public override fun clone(): Computer {
        return try {
            super.clone() as Computer
        } catch (e: CloneNotSupportedException) {
            Computer()
        }
    }
}

fun main() {
    val c = Computer().apply {
        os = "a"
        name = "b"
    }
    val b = c.clone()
    c.name = "d"
    print(c)
    print(b)

}