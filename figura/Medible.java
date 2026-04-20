package figura;

/**
 * Interfaz que define el comportamiento de cualquier figura geométrica
 * que pueda ser medida. Las clases que implementen esta interfaz deben
 * proporcionar métodos para calcular su área, su perímetro y devolver
 * su nombre identificativo.
 *
 * <p>Esta interfaz es utilizada por clases como {@code Circulo},
 * {@code Cuadrado}, {@code Rectangulo}, etc.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public interface Medible {

    /**
     * Calcula el área de la figura.
     *
     * @return el área de la figura.
     */
    double calcularArea();

    /**
     * Calcula el perímetro de la figura.
     *
     * @return el perímetro de la figura.
     */
    double calcularPerimetro();

    /**
     * Devuelve el nombre de la figura.
     *
     * @return una cadena con el nombre de la figura.
     */
    String nombre();
}
