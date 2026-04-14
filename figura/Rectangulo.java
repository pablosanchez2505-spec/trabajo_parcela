package figura;

public class Rectangulo implements Medible {
    double altura;
    double base;
    public Rectangulo ( double altura,double base){
        this.altura =altura;
        this.base = base;
    }
    @Override
       public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
