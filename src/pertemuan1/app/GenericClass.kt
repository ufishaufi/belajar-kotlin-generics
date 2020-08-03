package pertemuan1.app

import pertemuan1.data.MyData

fun main() {
    val myDataString: MyData<String> = MyData<String>("Shaufi")
    myDataString.printlnData()

    val myDataInt: MyData<Int> = MyData<Int>(10)
    myDataInt.printlnData()
}