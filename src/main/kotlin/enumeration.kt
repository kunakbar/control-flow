//bentuk enumeration
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


//implementasi mendasar sebuah enum
//enum class Color {
//    RED, GREEN, BLUE
//}


//objek yang bertipe data enum dapat mengakses attribute di dalam kelas enum itu sendiri. Konsepnya sama
//seperti array namun enum berbentuk konstan.
//fun main() {
//    val color : Color = Color.RED
//    print(color)
//}
//
//enum class Color{
//    RED, GREEN, BLUE
//}


//bisa mendeklarasikan anonymous class untuk tiap objek enum
//enum class Color(val value: Int) {
//    RED(0xFF0000) {
//        override fun printValue() {
//            println("Value of RED is $value")
//        }
//    },
//    GREEN(0x00FF00) {
//        override fun printValue() {
//            println("Value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF) {
//        override fun printValue() {
//            println("Value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
//}


//tiap enum class punya synthetic method yang dapat memberi daftar dan nama objek enum
//fungsi values() untuk daftar, dan valueOf() untuk nama
//fun main() {
//    val color: Color = Color.valueOf("RED")
//    print("Color is $color")
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}


//selain pakai values dan valueOf bisa pake yang lebih umum yaitu enumValues() dan enumValueOf()
//fun main() {
//    val colors: Array<Color> = enumValues()
//    colors.forEach {color ->
//        println(color)
//    }
//
//    val color: Color = enumValueOf("RED")
//    println("Color is $color")
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}


//Seperti array, enum bisa pake indeks
//fun main() {
//    color: Color = Color.GREEN
//
//    print("Position GREEN is ${color.ordinal}")
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}


//mengecek instance dari enum class pake when expression
//fun main() {
//    val color: Color = Color.GREEN
//
//    when(color){
//        Color.RED -> print("Color is Red")
//        Color.BLUE -> print("Color is Blue")
//        Color.GREEN -> print("Color is Green")
//    }
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}