class PersonaEjer2 (
    private var peso: Double,
    private var altura: Double,
    val nombre: String // Cambiado a val, ya que no debe modificarse
) {
    init {
        require(peso > 0) { "El peso no puede ser negativo." }
        require(altura > 0) { "La altura no puede ser negativa." }
        require(nombre.trim().isNotEmpty()) { "El nombre no puede estar vacío." }
    }

    val imc: String
        get() = "%.2f".format(peso / (altura * altura))

    fun mostrarDesc() {
        println("$nombre con peso $peso KG y altura $altura m tiene un IMC de $imc")
    }

    fun cambiarPeso(nuevoPeso: Double) {
        require(nuevoPeso > 0) { "El peso no puede ser negativo." }
        peso = nuevoPeso
    }

    fun cambiarAltura(nuevaAltura: Double) {
        require(nuevaAltura > 0) { "La altura no puede ser negativa." }
        altura = nuevaAltura
    }
}