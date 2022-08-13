package Taller

fun main(){

    print("Digite el número entero positivo a evaluar: ")
    var n= readLine()!!.toInt()
    var (s,divisores)= numeroDivisoressinn(n)
    println("La suma de sus divisores es de $s, los valores son $divisores=$s")
}
fun numeroDivisoressinn(n:Int): Pair<Int,String>{
    var s=0
    var divisores =""
    for(i in 1..(n-1)){
        val modulo=n%i
        if(modulo==0){
            s=s+i
            divisores=when{
                divisores=="" -> i.toString()
                else -> divisores+","+i
            }

        }
    }
    return s to divisores
}