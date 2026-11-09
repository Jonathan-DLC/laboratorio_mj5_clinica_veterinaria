package clinica_veterinaria;

// Clase base abstracta: reúne lo que comparten todos los animales.
public abstract class Animal {
    // Atributos comunes. protected permite que las subclases los usen directamente.
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    // el constructor: recibe y guarda los datos iniciales de cada animal.
    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    // Método abstracto: cada especie debe definir su propia forma de calcular el costo.
    public abstract double calcularCostoConsulta();

    // Método concreto: todas las especies heredan esta misma forma de imprimir la ficha.
    public void imprimirFicha() {
        System.out.println("Animal: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueno);
        System.out.printf("Costo de consulta: $%.0f%n", calcularCostoConsulta());
    }
}
