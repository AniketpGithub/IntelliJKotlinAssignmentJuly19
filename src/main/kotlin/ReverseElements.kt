import java.util.*

/*Assignment 2
1. Write a program to create a new array list, add some colors (string) and print out the collection.
2. Write a program to reverse elements in a array list.
3.Write a program to compare two array lists.
4. Write a program of swap two elements in an array list.
5. Write a Java program to associate the specified value with the specified key in a HashMap.
Exception Handling:
6. Write a program to implement throw and rhrows
7. Write a program to implement 1 try and myltiple catch blocks, catch blocka should contain ,
arithmetic exception, array index out of bounds exception, string out of bonds exception */


    fun main(){
        val numArray : IntArray= intArrayOf(10,20,30,40,50,60,70,80,90,100)
        var reversedArray =numArray.reversedArray()
        //numArray.reverse()
        println(Arrays.toString(reversedArray))
    }
