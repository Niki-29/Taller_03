package Taller

fun calcularPrimos(n:Int):String{
    var p=""
    for(i in 2..n){
        var (c,divisores)= numeroDivisores(i)
        if(c==2){
            p=when{
                p=="" -> i.toString()
                else -> p+","+i
            }
        }
    }
    return p
}
fun main(){
    print("Digite el número entero positivo hasta el cual se generarán los números primos: ")
    var n= readLine()!!.toInt()
    println("Los números primos son ${calcularPrimos(n)}")
}