package figura;

/**
 * Representa un círculo que puede calcular su área y perímetro.
 * Implementa la interfaz {@code Medible}, por lo que proporciona
 * métodos para obtener sus medidas geométricas.
 *
 * <p>Un círculo queda definido únicamente por su radio.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public class Circulo implements Medible {

    /**
     * Radio del círculo.
     */
    private double r;

    /**
     * Construye un nuevo círculo con el radio especificado.
     *
     * @param r radio del círculo. Debe ser un valor positivo.
     */
    public Circulo(double r){
        this.r = r;
    }

    /**
     * Calcula el área del círculo.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     área = π · r²
     * </pre>
     *
     * @return el área del círculo.
     */
    @Override
    public double calcularArea(){
        return Math.PI * r * r;
    }

    /**
     * Calcula el perímetro (circunferencia) del círculo.
     *
     * <p>Fórmula utilizada:</p>
     * <pre>
     *     perímetro = 2 · π · r
     * </pre>
     *
     * @return el perímetro del círculo.
     */
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * r;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return la cadena {@code "Circulo"}.
     */
    @Override
    public String nombre(){
        return "Circulo";
    }
}
