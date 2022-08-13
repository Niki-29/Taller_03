package Taller

fun main(){
    print("Digite el número entero positivo hasta el cual se generarán los números factoriales: ")
    var n= readLine()!!.toInt()

    for (i in 1..n){
        println("${i}! = ${calcularFactorial(i)}")
    }

}
fun calcularFactorial(n:Int):Int{
    var r=1
    for(i in 1..n){
        r=r*i
    }
    return r
}