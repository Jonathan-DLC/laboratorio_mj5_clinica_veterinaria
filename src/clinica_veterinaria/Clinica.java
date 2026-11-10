package clinica_veterinaria;

// Una clínica puede asegurarse, aunque no es un Animal.
public class Clinica implements Asegurable {
    // Datos propios de la clínica.
    private String nombre;
    private String direccion;

    // Constructor: recibe y guarda los datos iniciales de la clínica.
    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Cumple Asegurable: la prima anual de la clínica es fija.
    @Override
    public double calcularPrimaSeguro() {
        return 5_000_000;
    }

    // Cumple Asegurable: forma el número de póliza con el nombre.
    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre;
    }
}
