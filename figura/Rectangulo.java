package figura;

/**
 * Representa un rectángulo que puede calcular su área y perímetro.
 * Implementa la interfaz {@code Medible}, proporcionando los métodos
 * necesarios para obtener sus medidas geométricas.
 *
 * <p>Un rectángulo queda definido por su base y su altura.</p>
 *
 * <p>Esta clase es utilizada por {@code Parcela} y otras estructuras
 * que necesiten medir figuras geométricas.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public class Rectangulo implements Medible {

    /**
     * Altura del rectángulo.
     */
    private double altura;

    /**
     * Base del rectángulo.
     */
    private double base;

    /**
     * Construye un nuevo rectángulo con la base y altura especificadas.
     *
     * @param altura altura del rectángulo. Debe ser un valor positivo.
     * @param base base del rectángulo. Debe ser un valor positivo.
     */
    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    /**
     * Calcula el área del rectángulo.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     área = base · altura
     * </pre>
     *
     * @return el área del rectángulo.
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     perímetro = 2 · (base + altura)
     * </pre>
     *
     * @return el perímetro del rectángulo.
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return la cadena {@code "Rectangulo"}.
     */
    @Override
    public String nombre() {
        return "Rectangulo";
    }
}
