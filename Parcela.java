import java.util.ArrayList;
import java.util.List;
import figura.Medible;

public class Parcela {
private String nombre;
private List<Medible> medibles;

public Parcela(String nombre) {
   medibles = new ArrayList<>();
   this.nombre =nombre;
}
public List<Medible> getMedibles() {
    return medibles;
}
public void setMedibles(List<Medible> medibles) {
    this.medibles = medibles;
}
   public void añadir_figura(Medible figura){
   medibles.add(figura);
   }
   public double area_total(){
    double total=0;
    for(Medible figura:medibles){
        total=total+figura.calcularArea();
    }
    return total;
   }
   public double perimetro_total(){
    double total=0;
    for(Medible figura:medibles){
        total=total+figura.calcularPerimetro();
    }
    return total;
   }
   public void resumen(){
    System.out.println("Nombre parcela: "+nombre);
    int i=0;
    System.out.println("Número total de figuras: "+medibles.size());
     for(Medible figura:medibles){
        i++;
        System.out.println("Figura "+i+":"+figura.nombre());
    }
    System.out.println("Area total: "+area_total());
    System.out.println("Perimetro total: "+perimetro_total());
   }
}