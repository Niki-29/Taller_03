package Taller

fun main(){
    var p=""
    print("Digite el número entero positivo a evaluar: ")
    var n= readLine()!!.toInt()
    var c=0
    for(i in 1..n){
        var perfecto= hallarPerfecto(i)
        if(perfecto==1){
            c++
            p=when{
                p=="" -> i.toString()
                else -> p+","+i
            }
        }
    }
    println("Existen $c números perfectos entre 1 y $n")
    println("Los números perfectos son ${p}")
}
fun hallarPerfecto(n:Int):Int{
    var perfecto=0
    var (s,divisores)= numeroDivisoressinn(n)
    perfecto=when{
        s==n->1
        else -> 0
    }
    return perfecto
}