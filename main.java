import figura.Circulo;
import figura.Cuadrado;
import figura.Medible;

/**
 * Clase principal del programa. Se encarga de crear figuras geométricas,
 * asignarlas a parcelas y finalmente asociar dichas parcelas a un dron
 * encargado de generar un informe final.
 *
 * <p>Este programa demuestra el uso de las clases:</p>
 * <ul>
 *     <li>{@code Circulo}</li>
 *     <li>{@code Cuadrado}</li>
 *     <li>{@code Parcela}</li>
 *     <li>{@code Dron}</li>
 * </ul>
 *
 * <p>El flujo principal consiste en:</p>
 * <ol>
 *     <li>Crear figuras geométricas que implementan {@code Medible}.</li>
 *     <li>Añadir dichas figuras a distintas parcelas.</li>
 *     <li>Asignar las parcelas a un dron.</li>
 *     <li>Generar un informe final con los datos de cada parcela.</li>
 * </ol>
 *
 * @author Pablo
 * @version 1.0
 */
public class Main {

    /**
     * Método principal del programa. Construye figuras, parcelas y un dron,
     * y finalmente muestra un informe con los datos de todas las parcelas.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Primera parcela
        Parcela parcela1 = new Parcela("parcela1");
        Medible circulo1 = new Circulo(3);
        Medible cuadrado1 = new Cuadrado(2.4);

        parcela1.añadir_figura(cuadrado1);
        parcela1.añadir_figura(circulo1);

        // Segunda parcela
        Parcela parcela2 = new Parcela("parcela2");
        Medible circulo2 = new Circulo(6);

        parcela2.añadir_figura(circulo2);
        parcela2.añadir_figura(circulo1);
        parcela2.añadir_figura(cuadrado1);

        // Dron encargado de medir las parcelas
        Dron dron1 = new Dron(1);
        dron1.añadir_parcela(parcela1);
        dron1.añadir_parcela(parcela2);

        // Informe final
        dron1.informeFinal();
    }
}
