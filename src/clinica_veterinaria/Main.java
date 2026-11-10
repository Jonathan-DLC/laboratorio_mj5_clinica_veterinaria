package clinica_veterinaria;

// Ejecuta las pruebas del sistema en el orden indicado por el taller.
public class Main {
    public static void main(String[] args) {
        // Creamos cada objeto con su tipo concreto para usar sus capacidades propias.
        Perro perro = new Perro("Luna", 3, "Carlos", "Labrador");
        Gato gato = new Gato("Michi", 2, "Ana", true);
        Ave ave = new Ave("Pico", 2, "Sofía", 120.0);
        Conejo conejo = new Conejo("Nube", 2, "Laura");

        // 1. Una referencia Animal puede apuntar a cualquier especie hija.
        Animal[] animales = {perro, gato, ave, conejo};
        System.out.println("=== Fichas de los animales ===");
        for (int i = 0; i < animales.length; i++) {
            animales[i].imprimirFicha();
            System.out.println();
        }

        // 2. Solo Perro y Gato tienen el método de vacunación.
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Moquillo");
        gato.registrarVacuna("Triple felina");
        System.out.println("=== Vacunas aplicadas ===");
        System.out.println("Luna: " + perro.getVacunasAplicadas());
        System.out.println("Michi: " + gato.getVacunasAplicadas());
        System.out.println();

        // 3. El mismo contrato permite agrupar animales y una clínica.
        Clinica clinica = new Clinica("VetCare", "Calle 10 # 20-30");
        Asegurable[] asegurables = {perro, gato, clinica};
        System.out.println("=== Pólizas y primas anuales ===");
        for (int i = 0; i < asegurables.length; i++) {
            System.out.printf("Póliza: %s | Prima anual: $%.0f%n",
                    asegurables[i].obtenerNumeroPoliza(),
                    asegurables[i].calcularPrimaSeguro());
        }
    }
}
