package actividad_1;


public class Rectangulo extends Figura{
    //Atributos
    private double base, altura;
    
    //constructor

    public Rectangulo(double base, double altura) {
        
        this.base = base;
        this.altura = altura;
    }
    
    //Métodos
    public double CalcularPerimetro(){
        perimetro=base+base+altura+altura;
        return perimetro;
    }
  
    public double CalcularArea() {
        area=base*altura;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String cadena="";
        cadena+="Detalles del rectángulo \n";
        cadena+="Base: "+base+"\n";
        cadena+="Altura: "+altura+"\n";
        cadena+="Área: "+CalcularArea()+"\n";
        cadena+="Perímetro: "+CalcularPerimetro()+"\n";
        return  cadena;
    }
    
    
    
    
}
