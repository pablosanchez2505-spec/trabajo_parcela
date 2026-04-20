import java.util.ArrayList;
import java.util.List;
import figura.Medible;

/**
 * Representa una parcela que contiene un conjunto de figuras geométricas
 * que implementan la interfaz {@code Medible}. La clase permite añadir
 * figuras, calcular el área total, el perímetro total y mostrar un
 * resumen detallado de la parcela.
 *
 * <p>Una parcela se identifica por un nombre y mantiene internamente
 * una lista de figuras geométricas.</p>
 *
 * <p>Esta clase es utilizada por {@code Dron} para generar informes
 * completos de medición.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public class Parcela {

    /**
     * Nombre identificativo de la parcela.
     */
    private String nombre;

    /**
     * Lista de figuras geométricas que contiene la parcela.
     */
    private List<Medible> medibles;

    /**
     * Construye una parcela con el nombre especificado.
     *
     * @param nombre nombre de la parcela.
     */
    public Parcela(String nombre) {
        medibles = new ArrayList<>();
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de figuras contenidas en la parcela.
     *
     * @return lista de objetos {@code Medible}.
     */
    public List<Medible> getMedibles() {
        return medibles;
    }

    /**
     * Establece la lista de figuras de la parcela.
     *
     * @param medibles nueva lista de figuras.
     */
    public void setMedibles(List<Medible> medibles) {
        this.medibles = medibles;
    }

    /**
     * Devuelve el nombre de la parcela.
     *
     * @return nombre de la parcela.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la parcela.
     *
     * @param nombre nombre nuevo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Añade una figura geométrica a la parcela.
     *
     * @param figura figura que implementa {@code Medible}.
     */
    public void añadir_figura(Medible figura) {
        medibles.add(figura);
    }

    /**
     * Calcula el área total de todas las figuras contenidas en la parcela.
     *
     * @return suma de las áreas de todas las figuras.
     */
    public double area_total() {
        double total = 0;
        for (Medible figura : medibles) {
            total += figura.calcularArea();
        }
        return total;
    }

    /**
     * Calcula el perímetro total de todas las figuras contenidas en la parcela.
     *
     * @return suma de los perímetros de todas las figuras.
     */
    public double perimetro_total() {
        double total = 0;
        for (Medible figura : medibles) {
            total += figura.calcularPerimetro();
        }
        return total;
    }

    /**
     * Muestra un resumen completo de la parcela, incluyendo:
     * <ul>
     *     <li>Nombre de la parcela</li>
     *     <li>Número total de figuras</li>
     *     <li>Listado de figuras con su nombre</li>
     *     <li>Área total</li>
     *     <li>Perímetro total</li>
     * </ul>
     */
    public void resumen() {
        System.out.println("Nombre parcela: " + nombre);
        System.out.println("Número total de figuras: " + medibles.size());

        int i = 0;
        for (Medible figura : medibles) {
            i++;
            System.out.println("Figura " + i + ": " + figura.nombre());
        }

        System.out.println("Area total: " + area_total());
        System.out.println("Perimetro total: " + perimetro_total());
    }
}
