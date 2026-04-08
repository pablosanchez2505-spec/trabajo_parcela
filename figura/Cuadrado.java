package figura;
public class Cuadrado implements Medible{
    private double lado;
   public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
}