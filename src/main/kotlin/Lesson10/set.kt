package Lesson10

fun main (){

    val emtySet = setOf<Int>()

    val setNumbers = setOf(1, 2, 3)


    val mutableSet = mutableSetOf("Kotlin", " Java", "Scala")
    mutableSet.add("Swift")
    mutableSet.add("Go")
    val setNumber2 = mutableSetOf(5, 6, 8)
    setNumber2.add(2)
    val setInt = mutableSetOf(1, 2, 3, 4, 5)
    setInt.remove( 2)


    val numbersSet3 = setOf(1, 2, 3, 4, 5)
    for (i in numbersSet3) {
        println(i)
    }
    val funSet = setOf("Hello", "World", "Kotlin")
    val findString = "Kotlin"
    println(containSet(funSet, findString))

    val oneSet = setOf(1, 2, 3)
    val twoSet = setOf(4, 5, 6)
    val joinSet = mutableSetOf<Int>()
    for (i in oneSet) {
        joinSet.add(i)
    }
    for (i in twoSet) {
        joinSet.add(i)
    }
    println(joinSet.toList())


    val setFist = setOf(1, 2, 3, 4, 5, 6,9,10)
    val setSecond = setOf(3,4,6, 7, 8, 9, 10, 11)
    val intersectionsSet = mutableSetOf<Int>()
    for (i in setFist) {
        for (j in setSecond) {
            if (i == j) {
                intersectionsSet.add(i)
            }
        }
    }
println(" Нашли Пересечения Множеств :$intersectionsSet")

//11 Задание
    val setString = setOf("hello", "world" , "Kotlin ", "java", "swif")
     val setInList = mutableListOf<String>()
    for (i in setString){
        setInList.add(i)
    }
    println(setInList)

// Задание 10
    val setFistA = setOf(1, 2, 3, 4, 5, 6,9,10)
    val setSecondB = setOf(3,4,6, 7, 8, 9, 10, 11)
val differenceSet = mutableSetOf<Int>()
    for (i in setFistA){
        var flag = false
        for (j in setSecondB){
            if ( i == j ){
                flag=true
                break
            }
        }
        if (!flag){
            differenceSet.add(i)
        }
    }
println("Разность в сетах : $differenceSet")
}
fun containSet (set: Set<String>, findString: String):Boolean{
    for (i in set){
        if (i==findString){
            return true
        }
    }
    return false
}


/*Задание 1: Создание Пустого Множества
Создайте пустое неизменяемое множество целых чисел.
Задание 2: Создание и Инициализация Множества
Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
Задание 3: Создание Изменяемого Множества
Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
Задание 4: Добавление Элементов в Множество
Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
Задание 5: Удаление Элементов из Множества
Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
Задание 6: Перебор Множества в Цикле
Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
Задание 7: Проверка Наличия Элемента в Множестве
Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
Задание 8: Объединение Двух Множеств
Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
Задание 9: Нахождение Пересечения Множеств
Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
Задание 10: Нахождение Разности Множеств
Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.
Задание 11: Конвертация Множества в Список
Создайте множество строк и конвертируйте его в список с использованием цикла.
*/