package pertemuan1.app

import pertemuan1.data.Function

fun main() {
    val function = Function("Shaufi")

    function.sayHello("Udil")
    function.sayHello<String>("Ucil")

    function.sayHello(10)
    function.sayHello<Int>(10)
}