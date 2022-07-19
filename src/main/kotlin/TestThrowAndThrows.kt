//6. Write a program to implement throw and rhrows

    @Throws(ArithmeticException::class)
    fun method() {
        println("Inside the method")
        throw ArithmeticException("throwing ArithmeticExc")
    }


    fun main(args: Array<String>) {
        try {
            method()
        } catch (e: ArithmeticException) {
            println("Caught in main() method")
        }
    }
