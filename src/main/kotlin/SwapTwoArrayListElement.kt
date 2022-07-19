import java.util.*

//Write a program of swap two elements in an array list.
fun main(args: Array<String>) {

    val arrayList = ArrayList<String>()

    arrayList.add("Aniket")
    arrayList.add("Debasmita")
    arrayList.add("Rahul")
    arrayList.add("Rohit")
    arrayList.add("Sham")
    println("ArrayList before Swap:")
    for (temp in arrayList) {
        println(temp)
    }

    Collections.swap(arrayList, 1, 4)
    println("ArrayList after swap:")
    for (temp in arrayList) {
        println(temp)
    }
}

