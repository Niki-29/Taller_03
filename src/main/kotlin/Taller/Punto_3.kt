package Taller

fun main(){
    var i=1
    var continuar="SI"
    while(continuar=="SI"){
        print("Digite el salario del vendedor #$i: ")
        var s= readLine()!!.toDouble()
        print("Digite el valor de las ventas del vendedor #$i: ")
        var v= readLine()!!.toDouble()
        var c=calcularComisionVendedor(v)
        println("La comisión del vendedor #$i es de $${c}")
        var sn= s + c
        println("El salario neto del vendedor #$i es de $${sn}")
        i++
        print("Si desea continuar esciba 'SI' de lo contrario ecriba 'NO'")
        continuar= readLine()!!.toString()
    }


}
fun calcularComisionVendedor(v:Double)=
    when{
        v>50000 -> v*0.15
        else  -> 0.0
    }