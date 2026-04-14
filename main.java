import figura.Circulo;
import figura.Cuadrado;
import figura.Medible;

public class Main {

public void main(String[] args) {    
Parcela parcela1 = new Parcela("parcela1");
 Medible circulo1 = new Circulo(3);
 Medible cuadrado1= new Cuadrado(2.4); 
parcela1.añadir_figura(cuadrado1);
parcela1.añadir_figura(circulo1);
parcela1.resumen();


}   
}