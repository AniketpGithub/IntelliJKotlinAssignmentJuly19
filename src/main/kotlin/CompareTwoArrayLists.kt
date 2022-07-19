//Write a program to compare two array lists.
fun main(args: Array<String>){

    val arrayList = ArrayList<String>()

    arrayList.add("1")
    arrayList.add("2")
    arrayList.add("3")
    arrayList.add("4")
    println(arrayList)


    val arrayList1 = ArrayList<String>()

    arrayList1.add("1")
    arrayList1.add("2")
    arrayList1.add("3")
    arrayList1.add("4")
    //arrayList1.add("5")
    println(arrayList1)

    val boolval: Boolean = arrayList.equals(arrayList1)
    println(boolval)
}