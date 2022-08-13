package Taller

fun main(){
    print("Digite numero entero positivo a multiplicar: ")
    var numero= readLine()!!.toInt()
    println("TABLA DE MULTIPLICAR DEL $numero")
    repeat(11){
        if (it >0) {

        println("$numero x $it =${numero*it}")
}
    }//for (i in 1--10)
}
