package ecosistema

// Interfaz que define las acciones de un pez
interface AccionPez {
    fun comer()
    fun nadar()
}

// Clase abstracta Pez que sirve como base para diferentes tipos de peces
abstract class Pez {
    abstract val color: String
}

// Clase Tiburón que hereda de Pez e implementa AccionPez
class Tiburon : Pez(), AccionPez {
    override val color = "gris"

    override fun comer() {
        println("El tiburón está cazando y comiendo peces.")
    }

    override fun nadar() {
        println("El tiburón está nadando rápidamente en el acuario.")
    }
}

// Clase PezPayaso que hereda de Pez e implementa AccionPez
class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"

    override fun comer() {
        println("El pez payaso está comiendo algas.")
    }

    override fun nadar() {
        println("El pez payaso está nadando alegremente entre los corales.")
    }
}
