package actividad_1;

public class Triangulo extends Figura{
    //Atributos
    private double base, altura, lado1, lado2;
    
    
    //Constructor
    public Triangulo(double base, double altura, double lado1, double lado2){    
        this.base=base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Métodos
    public double CalcularPerimetro() {
        perimetro=base+lado1+lado2;
        return perimetro;
    }
    
    public double CalcularArea(){
        area=(base*altura)/2;
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
        cadena+="Detalles del triangulo \n";
        cadena+= "Base: "+base+"\n";
        cadena+= "Altura: "+altura+"\n";
        cadena+= "Área: "+CalcularArea()+"\n";
        cadena+= "Perimetro: "+CalcularPerimetro()+"\n";
        return cadena;
    }
    
    
    
}
