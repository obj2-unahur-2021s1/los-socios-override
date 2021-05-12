package ar.edu.unahur.obj2.socios

class Cliente(var montoPedido: Int, var bolsillo: Int, var unHumor: Humor, var unBarrio: Barrio){

    var propinaPorHumor = unHumor.propina(montoPedido, bolsillo)

    fun cambiarHumor(otroHumor: Humor){
        unHumor = otroHumor
    }

    fun cambiarBarrio(otroBarrio: Barrio){
        unBarrio = otroBarrio
    }

    fun darPropina(): Int{
        return unBarrio.propinaPorBarrio(propinaPorHumor)
    }

}

//////////////////////////////////////////////////
/////////////EL HUMOR DEL CLIENTE/////////////////
//////////////////////////////////////////////////

abstract class Humor(){
    abstract fun propina(montoPedido: Int, bolsillo: Int): Int
}


class Angry(): Humor(){
   override fun propina(montoPedido: Int, bolsillo: Int) = 0
}

class Smiley(): Humor(){

    override fun propina(montoPedido: Int, bolsillo: Int): Int {
        return montoPedido/4
    }
}

class NeutralFace(): Humor(){

    override fun propina(montoPedido: Int, bolsillo: Int) = bolsillo

}

class Mask(): Humor(){

    override fun propina(montoPedido: Int, bolsillo: Int) = montoPedido

}

///////////////////////////////////////////////////
/////////////EL BARRIO DEL CLIENTE/////////////////
///////////////////////////////////////////////////

abstract class Barrio(){
    abstract fun propinaPorBarrio(propinaPorHumor: Int): Int
}

class Rosas(): Barrio(){

    override fun propinaPorBarrio(propinaPorHumor: Int): Int{ return propinaPorHumor+50 }
}

class Lauchas(): Barrio(){

    override fun propinaPorBarrio(propinaPorHumor: Int): Int{ return propinaPorHumor/2 }
}

class BarrioVerde(): Barrio(){

    override fun propinaPorBarrio(propinaPorHumor: Int): Int{
        var propinaBarrial = 200

        if(propinaPorHumor > propinaBarrial){ propinaBarrial = propinaPorHumor}

        return propinaBarrial}
}

class Torres(): Barrio(){

    override fun propinaPorBarrio(propinaPorHumor: Int): Int{ return propinaPorHumor }
}