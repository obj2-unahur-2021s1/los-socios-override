package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import io.kotest.matchers.types.shouldBeTypeOf

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val ramon = Cliente(1000, 500, Angry(), Rosas())

    describe("prueba del patron strategy"){
      describe("prueba de la variable propinaPorHumor "){
        it("devuelve propina con humor"){
          ramon.propinaPorHumor.shouldBe(0)
        }
        it("cambiar de humor smiley"){
          ramon.cambiarHumor(Smiley())
          ramon.propinaPorHumor.shouldBe(250)
        }

        it("cambiar de humor neutralFace"){
          ramon.cambiarHumor(NeutralFace())
          ramon.propinaPorHumor.shouldBe(500)
        }
        it("cambiar de humor Mask"){
           ramon.cambiarHumor(Mask())
           ramon.propinaPorHumor.shouldBe(1000)
        }}
    }
   /* describe("propina segun barrio y humor"){
      describe("barrio intercambiable y humor enojado") {
        it("devuelve propina que daria ramon en cualquier barrio si estaria enojado")
        ramon.darPropina().shouldBe(50)

        ramon.cambiarBarrio(Lauchas())
        ramon.darPropina().shouldBe(0)

        ramon.cambiarBarrio(BarrioVerde())
        ramon.darPropina().shouldBe(200)

        ramon.cambiarBarrio(Torres())
        ramon.darPropina().shouldBe(0)
      }
    }*/

    describe("barrio intercambiable y humor smiley"){
      it("devuelve propina que daria ramon en estado Smiley") {
        //ramon.cambiarHumor(Smiley())//en Rosas
        //ramon.propinaPorHumor.shouldBe(250)
        //ramon.darPropina().shouldBe(300)

        /*ramon.cambiarBarrio(Lauchas())
        ramon.darPropina().shouldBe(0)

        ramon.cambiarBarrio(BarrioVerde())
        ramon.darPropina().shouldBe(250)

        ramon.cambiarBarrio(Torres())
        ramon.darPropina().shouldBe(250)*/
      }}
  }

})
