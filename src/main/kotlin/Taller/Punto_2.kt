package Taller

fun main(){
    var i=1
    print("Digite el valor de las ventas del vendedor #$i: ")
    var v= readLine()!!.toDouble()
    while(v>=0){
        println("La comisión del vendedor #$i es de $${calcularComision(v)}")
        i++
        print("Digite el valor de las ventas del vendedor #$i: ")
        v= readLine()!!.toDouble()
    }


}
fun calcularComision(v:Double)=
    when(v.toInt()){
        in 0 .. 49000->v*0.07
        in 50000..990000 -> (v*0.09)+5000
        in 100000..190000 -> (v*0.11)+10000
        in 200000..500000 -> (v*0.13)+20000
        else  -> (v*0.15)+40000
    }