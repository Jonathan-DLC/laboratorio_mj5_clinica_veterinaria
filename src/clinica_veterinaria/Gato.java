package clinica_veterinaria;

// Gato es un Animal y además cumple los contratos Vacunable y Asegurable.
public class Gato extends Animal implements Vacunable, Asegurable {
    // Atributo propio: indica si el gato está esterilizado.
    private boolean esEsterilizado;
    private int vacunasAplicadas = 0;
    private String nombresVacunas = "";
    private String numeroPoliza;

    // Este contador se comparte entre los gatos para dar pólizas distintas.
    private static int siguienteNumeroPoliza = 1;

    // Constructor: primero inicializa la parte Animal y luego el dato propio.
    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        this.numeroPoliza = "POL-GATO-" + siguienteNumeroPoliza;
        siguienteNumeroPoliza++;
    }

    // Permite consultar el dato privado, "is" porque es un dato booleano.
    public boolean isEsterilizado() {
        return esEsterilizado;
    }

    // Permite consultar los nombres de las vacunas registradas.
    public String getNombresVacunas() {
        return nombresVacunas;
    }

    // La consulta del gato cuesta lo mismo sin importar su edad.
    @Override
    public double calcularCostoConsulta() {
        return 38_000;
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

    // Cumple Asegurable: la esterilización determina la prima anual.
    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120_000;
        }
        return 200_000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}
