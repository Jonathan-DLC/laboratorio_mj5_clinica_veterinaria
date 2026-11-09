package clinica_veterinaria;

// Ave hereda los datos comunes y el método imprimirFicha() de Animal.
public class Ave extends Animal {
    // Atributo propio: peso del ave en gramos.
    private double pesoGramos;

    // Constructor: inicializa primero los datos de Animal y luego el peso.
    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    // Permite consultar el peso sin acceder directamente al atributo privado.
    public double getPesoGramos() {
        return pesoGramos;
    }

    // Costo: $28.000 de base más $100 por cada gramo de peso.
    @Override
    public double calcularCostoConsulta() {
        return 28_000 + 100 * pesoGramos;
    }
}
