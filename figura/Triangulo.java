package figura;

/**
 * Representa un triángulo definido por la longitud de sus tres lados.
 * Implementa la interfaz {@code Medible}, proporcionando métodos para
 * calcular su área, su perímetro y devolver su nombre identificativo.
 *
 * <p>El área se calcula mediante la fórmula de Herón, que utiliza el
 * semiperímetro del triángulo.</p>
 *
 * <p>Esta clase es utilizada por {@code Parcela} y otras estructuras
 * que necesiten medir figuras geométricas.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public class Triangulo implements Medible {

    /**
     * Primer lado del triángulo.
     */
    private double lado1;

    /**
     * Segundo lado del triángulo.
     */
    private double lado2;

    /**
     * Tercer lado del triángulo.
     */
    private double lado3;

    /**
     * Construye un triángulo con los tres lados especificados.
     *
     * @param lado1 longitud del primer lado.
     * @param lado2 longitud del segundo lado.
     * @param lado3 longitud del tercer lado.
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Calcula el área del triángulo utilizando la fórmula de Herón.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     s = (lado1 + lado2 + lado3) / 2
     *     área = √(s · (s - lado1) · (s - lado2) · (s - lado3))
     * </pre>
     *
     * @return el área del triángulo.
     */
    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    /**
     * Calcula el perímetro del triángulo.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     perímetro = lado1 + lado2 + lado3
     * </pre>
     *
     * @return el perímetro del triángulo.
     */
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return la cadena {@code "Triangulo"}.
     */
    @Override
    public String nombre() {
        return "Triangulo";
    }
}
