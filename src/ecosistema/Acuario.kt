package ecosistema

import kotlin.math.PI

// Clase abierta Acuario que puede ser heredada
open class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {
    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma = "rectángulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

    init {
        println("Acuario creado")
    }
    fun imprimirTamano() {
        println("Forma: $forma")
        println("Dimensiones: Ancho: $ancho cm, Largo: $largo cm, Alto: $alto cm")
        println("Volumen: $volumen l, Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }
}
// Subclase de Acuario que representa un tanque cilíndrico
class TanqueTorre(override var alto: Int, var diametro: Int) : Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        get() = (ancho / 2 * largo / 2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho / 2 * largo / 2)).toInt()
        }
    override var agua = volumen * 0.8
    override val forma = "cilindro"

    init {
        println("Tanque Torre creado")
    }
}
