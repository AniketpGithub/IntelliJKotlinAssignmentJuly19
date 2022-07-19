
//Write a Java program to associate the specified value with the specified key in a HashMap.


    fun main(args: Array<String>) {
        val hashmap = HashMap<Int, String>()
        hashmap.put(1,"Ajay")
        hashmap.put(3,"Vijay")
        hashmap.put(4,"Praveen")
        hashmap.put(2,"Aniket")
        hashmap.put(5,"Aakash")

        for(key in hashmap.keys){

            println("Element At key $key = ${hashmap[key]}")
        }
    }
