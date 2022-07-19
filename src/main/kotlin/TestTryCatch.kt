
//7. Write a program to implement 1 try and myltiple catch blocks, catch blocka should contain ,
//arithmetic exception, array index out of bounds exception, string out of bonds exception

    fun main(args: Array<String>) {
        try {
            val a = IntArray(5)
           // a[5] = 30 / 0
           // println(a[8])
            val str = "My String"
            println(str[9])
        } catch (e: ArithmeticException) {
            println("Arithmetic Exception occurs")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("ArrayIndexOutOfBounds Exception occurs")
        } catch (e: StringIndexOutOfBoundsException) {
            println("string out of bonds exception")
        }
        println("rest of the code")
    }

