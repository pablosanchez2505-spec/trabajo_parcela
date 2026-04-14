package figura;
public class Triangulo implements Medible {
  double lado1;
  double lado2;
  double lado3;
  public Triangulo(double lado1,double lado2,double lado3){
    this.lado1=lado1;
    this.lado2=lado2;
    this.lado3=lado3;
  }
@Override 
public double calcularArea(){
double s=(lado1+lado2+lado3)/2;//s es de semiperimetro
return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));//Mathsqrt te calcula la raiz cuadrada de un número

}   
public double calcularPerimetro(){
    return lado1+lado2+lado3;
}
}
