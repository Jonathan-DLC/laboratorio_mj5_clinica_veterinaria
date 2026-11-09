package clinica_veterinaria;

// Interfaz: contrato para cualquier objeto que pueda tener una póliza de seguro.
public interface Asegurable {
    // Calcula el valor anual de la prima según las reglas del objeto concreto.
    double calcularPrimaSeguro();

    // Devuelve el identificador de la póliza.
    String obtenerNumeroPoliza();
}
