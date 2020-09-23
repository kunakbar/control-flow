import kotlin.random.Random
fun main() {
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached") //else dipakai agar tidak eror saat nilai value tidak ada
    }
}


//bisa mengembalikan nilai dan dapat disimpan dalam variabel
//fun main() {
//    val value = 7
//
//    val stringOfValue = when (value) {
//        6 -> println("value is 6")
//        7 -> println("value is 7")
//        8 -> println("value is 8")
//        else -> println("value cannot be reached") //else dipakai agar tidak eror saat nilai value tidak ada
//    }
//
//    println(stringOfValue)
//}


//jika baris kode tiap branch ada 2 atau lebih baris pakai curly braces
//fun main() {
//    val value = 7
//    val stringOfValue = when (value) {
//        6 -> {
//            println("Six")
//            "value is 6"
//        }
//        7 -> {
//            println("Seven")
//            "value is 7"
//        }
//        8 -> {
//            println("Eight")
//            "value is 8"
//        }
//        else -> {
//            println("undefined")
//            "value cannot be reached"
//        }
//    }
//
//    println(stringOfValue)
//}


//memeriksa instance dg tipe tertentu
//fun main() {
//    val anyType : Any = 100L
//    when(anyType){
//        is Long -> println("The value has a Long type")
//        is String -> println("The value has a String type")
//        else -> println("undefined")
//    }
//}


//memeriksa nilai range atau collection
//fun main() {
//    val value = 27
//    val ranges = 10..50
//
//    when(value){
//        in ranges -> println("value is in the range")
//        !in ranges -> println("value is outside the range")
//        8 -> println("value is 8")
//        else -> println("value undefined")
//    }
//}

//memasukkan when expression ke dalam sebuah variabel
//fun main() {
//    val registerNumber = when (val regis = getRegisterNumber()) {
//        in 1..50 -> 50 * regis
//        in 51..100 -> 100 * regis
//        else -> regis
//    }
//}
//
//fun getRegisterNumber() = Random.nextInt(100)


//when sama spt if, gunakan if jika kondisi tidak lebih dari 2 atau tidak rumit.
//val anyType: Any = 100L
//if (anyType is Long){
//    println("the value has a Long type")
//} else{
//    println("the value is not Long type")
//}


//gunakan when untuk kondisi lebih dari 2
//val anyType: Any = 100L
//when (anyType){
//    is Long -> println("the value has a Long type")
//    is Int -> println("the value has a Int type")
//    is Double -> println("the value has a Double type")
//    else -> println("undefined")
//}