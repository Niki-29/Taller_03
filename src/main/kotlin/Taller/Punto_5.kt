package Taller

fun main(){
    println("Para la función Σi=1 to n ")
    print("Digite el valor de n: ")
    var n= readLine()!!.toInt()
    var r=0
    for (i in 1..n){
        r=r+i
        println("La sumatoria en la posición i=$i es de $r")
    }
}