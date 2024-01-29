
fun main() {

    val persona1 = PersonaEjer2(90.55, 1.93, "Diego")
    val persona2 = PersonaEjer2(61.88, nombre = "Marta", altura = 1.69)
    val persona3 = PersonaEjer2(nombre = "David", peso = 69.50, altura = 1.65) // Corregido el orden de los argumentos

    persona1.mostrarDesc()

    persona2.mostrarDesc()

    persona2.cambiarPeso(70.00)

    persona2.mostrarDesc()
}


