fun main(args: Array<String>) {

    //exercicio 2

    var nPar = 0
    var nImpar = 0

    for (i in 1..10){
        print("Digite o ${i} º número: ")
        val num = readLine()!!.toInt()

        if(num % 2 == 0) {
            nPar++
        }else{
            nImpar++

        }

    }

    println("A quantidade de números pares foi de $nPar e a " + "a quantidade de números ímpares foi de $nImpar")


}