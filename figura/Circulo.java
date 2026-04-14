package figura;
public class Circulo implements Medible {
  double r;  
   public Circulo(double r){
    this.r=r;
   } 
   @Override
   public double calcularArea(){
    return Math.PI * r * r;

   }
   public double calcularPerimetro(){
    return Math.PI * r * r;

   }
   public String nombre(){
        return "Circulo";
    }
}
