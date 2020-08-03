package pertemuan1.app

import pertemuan1.data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Shaufi", 100)
    myDataString.printlnData()

    val myDataInt = MyData(100, "Shaufi")
    myDataInt.printlnData()
}