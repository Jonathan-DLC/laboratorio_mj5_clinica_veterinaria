package clinica_veterinaria;

// Gato hereda los datos comunes y el método imprimirFicha() de Animal.
public class Gato extends Animal {
    // Atributo propio: indica si el gato está esterilizado.
    private boolean esEsterilizado;

    // Constructor: primero inicializa la parte Animal y luego el dato propio.
    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    // Permite consultar el dato privado, "is" porque es un dato booleano.
    public boolean isEsterilizado() {
        return esEsterilizado;
    }

    // La consulta del gato cuesta lo mismo sin importar su edad.
    @Override
    public double calcularCostoConsulta() {
        return 38_000;
    }
}
