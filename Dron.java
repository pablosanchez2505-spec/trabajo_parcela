import java.util.ArrayList;
import java.util.List;

/**
 * Representa un dron encargado de medir parcelas. Cada dron posee un
 * identificador único y mantiene una lista de objetos {@code Parcela}
 * que deben ser analizados.
 *
 * <p>El dron permite:</p>
 * <ul>
 *     <li>Añadir parcelas a su lista de medición.</li>
 *     <li>Medir una única parcela mostrando su resumen.</li>
 *     <li>Medir todas las parcelas acumulando área y perímetro total.</li>
 *     <li>Generar un informe final con los datos de cada parcela.</li>
 * </ul>
 *
 * <p>Esta clase actúa como coordinadora del proceso de medición,
 * delegando los cálculos a cada objeto {@code Parcela}.</p>
 *
 * @author Pablo
 * @version 1.0
 */
public class Dron {

    /**
     * Lista de parcelas que el dron debe medir.
     */
    private List<Parcela> lista_parcela;

    /**
     * Identificador único del dron.
     */
    private int id;

    /**
     * Construye un dron con el identificador especificado.
     *
     * @param id identificador del dron.
     */
    public Dron(int id) {
        this.id = id;
        lista_parcela = new ArrayList<>();
    }

    /**
     * Devuelve la lista de parcelas asignadas al dron.
     *
     * @return lista de objetos {@code Parcela}.
     */
    public List<Parcela> getLista_parcela() {
        return lista_parcela;
    }

    /**
     * Añade una parcela a la lista de medición del dron.
     *
     * @param parcela parcela que se desea añadir.
     */
    public void añadir_parcela(Parcela parcela) {
        lista_parcela.add(parcela);
    }

    /**
     * Mide una única parcela mostrando su resumen.
     *
     * @param parcela parcela a medir.
     */
    public void unaparcela(Parcela parcela) {
        parcela.resumen();
    }

    /**
     * Calcula y muestra el área total y el perímetro total de todas
     * las parcelas asignadas al dron.
     *
     * <p>Este método recorre la lista de parcelas y acumula los valores
     * devueltos por {@code area_total()} y {@code perimetro_total()}.</p>
     */
    public void nparcela() {
        double totalPerimetro = 0;
        double totalArea = 0;

        for (Parcela parcela : lista_parcela) {
            totalPerimetro += parcela.perimetro_total();
            totalArea += parcela.area_total();
        }

        System.out.println("El perimetro total de todas las parcelas es: " + totalPerimetro);
        System.out.println("El area total de todas las parcelas es: " + totalArea);
    }

    /**
     * Genera un informe completo del dron y de todas las parcelas
     * que tiene asignadas. Para cada parcela se muestra su nombre
     * y su resumen detallado.
     */
    public void informeFinal() {
        System.out.println("Dron " + id);

        for (Parcela p : lista_parcela) {
            System.out.println(p.getNombre());
            System.out.println("---------------------------");
            p.resumen();
            System.out.println();
        }
    }
}
