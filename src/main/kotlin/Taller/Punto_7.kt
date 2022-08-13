package Taller

fun main(){

    print("Digite el número entero positivo a evaluar: ")
    var n= readLine()!!.toInt()
    var (c,divisores)= numeroDivisores(n)
    println(" ${n} nota(s) de R$divisores")

}
fun numeroDivisores(n:Int): Pair<Int,String> {
    var c = 0
    var divisores = ""
    for (i in 1..n) {
        val modulo = n % i
        if (modulo == 0) {
            c++
            divisores = when (c) {
                1 -> i.toString()
                else -> divisores + "," + i
            }

        }
    }
    return c to divisores
}