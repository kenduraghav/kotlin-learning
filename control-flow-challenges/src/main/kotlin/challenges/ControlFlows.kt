package challenges


fun main(){

//    for (i in 5..5000 step 5){
//        print("$i ")
//    }

//    for(i in -50..0){
//        println(i)
//    }

//    var a = 0;
//    var b = 1;
//    print("Fibonacci series: ")
//    (1..15).forEach { _ ->
//        print("$a ")
//        val next = a+b
//        a=b
//        b=next
//    }

//    mainloop@  for(i in 1..5){
//        print("$i ")
//        if(i == 2) break
//        for(j in  11..20){
//            print("$j ")
//            for(k in (100 downTo 90)){
//                print("$k ")
//                if(k == 98) continue@mainloop
//            }
//        }
//    }

    println("Using If Expression \nEnter a Number between 1 and 200: ")
    val num = readln().toInt()
    val dnum: Double = if(num > 100) -234.567 else if (num < 100) 444.55 else 0.0
    println(dnum)

    println("Using When Expression \nEnter a Number between 1 and 200: ")
    val num2 = readln().toInt()
    val dnum2 = when {
        num2 > 100 -> -234.567
        num2 < 100 -> 444.55
        else -> 0.0
    }
    println(dnum2)
}