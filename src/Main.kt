package ecosistema

fun construirEcosistema() {
    val acuarioRectangular = Acuario(ancho = 30, largo = 60, alto = 50)
    acuarioRectangular.imprimirTamano()

    val tanqueCilindrico = TanqueTorre(diametro = 30, alto = 100)
    tanqueCilindrico.imprimirTamano()
}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("\nEl tiburón es de color: ${tiburon.color}")
    tiburon.nadar()
    tiburon.comer()

    println("\nEl pez payaso es de color: ${pezPayaso.color}")
    pezPayaso.nadar()
    pezPayaso.comer()
}

fun main() {
    println("Construyendo el ecosistema acuático...\n")
    construirEcosistema()

    println("\nCreando peces en el ecosistema...\n")
    crearPeces()
}
