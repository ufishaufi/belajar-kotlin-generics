package pertemuan1.data

class Function(val name: String) {

    fun <T> sayHello(param: T){
        println("Hello $param, My name is $name")
    }
}