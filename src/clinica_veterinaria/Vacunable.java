package clinica_veterinaria;

// Interfaz: contrato para los objetos que pueden recibir vacunas.
// Solo gato y perro reciben vacunas (por ahora)
public interface Vacunable {
    // Registrar una vacuna
    void registrarVacuna(String nombre);

    // Devuelve cuántas vacunas se han registrado. Es una contadora++
    int getVacunasAplicadas();
}
