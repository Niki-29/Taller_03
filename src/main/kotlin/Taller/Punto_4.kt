package Taller

fun main(){
    print("Digite el numero de emplados que trabajan en la empresa: ")
    var e= readLine()!!.toInt()
    for (i in 1..e){
        print("Digite las horas trabajadas en la semana del empleado #$i : ")
        var h= readLine()!!.toInt()
        var s= calcularSalario(h)
        println("El salario del empleado #$i es de $$s")
    }


}
fun calcularSalario(h:Int)=
    when{
        h<=35 ->h*15000
        h in 35 ..60 -> (35*15000)+((h-35)*18000)
        else -> (35*15000)+(25*18000)+((h-60)*25000)
    }
//Otra manera de hacerlo
fun salario(horas:Double) =
    when {
        horas <= 35 -> horas *  15_000
        horas > 35 && horas <= 60 -> 525_000 + ((horas -35) * 18_000)
        else -> 975_000 + ((horas - 60) * 25_000)
    }