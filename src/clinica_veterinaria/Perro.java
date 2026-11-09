package clinica_veterinaria;

// Perro es un Animal y además cumple los contratos Vacunable y Asegurable.
public class Perro extends Animal implements Vacunable, Asegurable {
    // Atributo propio del perro; no existe en todos los animales.
    private String raza;
    private int vacunasAplicadas = 0;
    private String nombresVacunas = "";
    private String numeroPoliza;

    // Este contador se comparte entre todos los objetos Perro para dar pólizas distintas.
    private static int siguienteNumeroPoliza = 1;

    // Constructor: envía los datos comunes al constructor de Animal y guarda la raza.
    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.numeroPoliza = "POL-PERRO-" + siguienteNumeroPoliza;
        siguienteNumeroPoliza++;
    }

    // Permite consultar la raza sin exponer directamente el atributo privado.
    public String getRaza() {
        return raza;
    }

    // Permite consultar los nombres registrados, separados por comas.
    public String getNombresVacunas() {
        return nombresVacunas;
    }

    // Implementa el cálculo que Animal dejó abstracto.
    @Override
    public double calcularCostoConsulta() {
        return 45_000 + 3_000 * edad;
    }

    // Cumple Vacunable: guarda el nombre de la vacuna y aumenta el contador.
    @Override
    public void registrarVacuna(String nombreVacuna) {
        if (nombreVacuna == null || nombreVacuna.isBlank()) {
            throw new IllegalArgumentException("La vacuna necesita un nombre.");
        }
        if (vacunasAplicadas > 0) {
            nombresVacunas += ", ";
        }
        nombresVacunas += nombreVacuna;
        vacunasAplicadas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    // Cumple Asegurable: $80.000 anuales por cada año de edad.
    @Override
    public double calcularPrimaSeguro() {
        return 80_000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}
