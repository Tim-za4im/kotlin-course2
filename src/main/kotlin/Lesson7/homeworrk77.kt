package Lesson7

//Задания для Цикла for
//Прямой Диапазон:
//
//Напишите цикл for, который выводит числа от 1 до 5.
//Напишите цикл for, который выводит четные числа от 1 до 10.
//Обратный Диапазон:
//
//Создайте цикл for, который выводит числа от 5 до 1.
//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
//С Шагом (step):
//
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
//Использование До (until):
//
//Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
//Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
//Задания для Цикла while
//Цикл while:
//
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
//Цикл do...while:
//
//Используйте цикл do...while, чтобы вывести числа от 5 до 1.
//Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
//Задания для Прерывания и Пропуска Итерации
//Использование break:
//
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
//
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
//Использование continue:
//
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
////Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
////Задача на вложенный цикл
////
fun main () {

    for (a in 1..5) {
        println(a)
    }
    for (b in 0..10 step 2) {
        println(b)
    }

    for (c in 1..10) {
        if (c % 2 == 0)
            println(c)
    }

    for (d in 5 downTo 1) {
        println(d)
    }


  for (e in 10 downTo 1 step 2) {
    println(e)
 }
    for(f in 1..9 step 2){
        println(f)
    }
 for (g in 1 until 20 step 3 ){
     println(g)
 }
    for (h in 1 until 9){
        println(h)}
    for (i in 1..9) {
        if (i != 9) {
            println(i)
        }

    }
    for (j in 3 until 15){
        println(j)}


   var m = 1

   while  ( m * m++ <=5  ){
    println(m)
        }

    var n= 10
    while (n>5){
        n--
        println(n)

    }

var o =5
    do {
        println(o)
        o--
    } while (o>=1)


    var p =5
    do {
        println(p)
        p++
    } while (p<=10)

for (q in 1..10){
    if(q==6) break
    println(q)
}
   var r =1
   while (r <= 10 ) {
       println(r)
   r++}


var s = 1
   while (true){
       println(s)
  if(s == 10 ) {break
  }
s++
}


    for (t in 1 ..10){
      if(t % 2 ==0) continue
        println(t)
    }


var v =1
while (v<=10){
    if(v % 3==0)
        println(v)
    v++
}
    for (w in 1..10) {

        for (u in 1..10) {

            print(w * u)
            print(" ")

        }
    }
}









// //Создать цикл в цикле, в каждом использовать диапазон от 0 до 10. В консоль вывести результат умножения переменных цикла.
// Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
// После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.



