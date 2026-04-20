package figura;

/**
 * Representa un cuadrado que puede calcular su área y perímetro.
 * Implementa la interfaz {@code Medible}, proporcionando los métodos
 * necesarios para obtener sus medidas geométricas.
 *
 * <p>Un cuadrado queda definido por la longitud de su lado.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public class Cuadrado implements Medible {

    /**
     * Longitud del lado del cuadrado.
     */
    private double lado;

    /**
     * Construye un nuevo cuadrado con el lado especificado.
     *
     * @param lado longitud del lado del cuadrado. Debe ser un valor positivo.
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área del cuadrado.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     área = lado²
     * </pre>
     *
     * @return el área del cuadrado.
     */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    /**
     * Calcula el perímetro del cuadrado.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     perímetro = 4 · lado
     * </pre>
     *
     * @return el perímetro del cuadrado.
     */
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return la cadena {@code "Cuadrado"}.
     */
    @Override
    public String nombre() {
        return "Cuadrado";
    }
}
