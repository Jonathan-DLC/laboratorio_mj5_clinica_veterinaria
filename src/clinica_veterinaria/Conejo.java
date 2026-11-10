package clinica_veterinaria;

// Nueva especie: demuestra que Animal puede ampliarse sin cambiar las especies existentes.
public class Conejo extends Animal {
    // Constructor: entrega los datos comunes al constructor de Animal.
    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    // Cada consulta de conejo cuesta $35.000, sin importar su edad.
    @Override
    public double calcularCostoConsulta() {
        return 35_000;
    }
}
