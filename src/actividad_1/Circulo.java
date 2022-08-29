package actividad_1;


public class Circulo extends Figura {
    //Atributos
    public static final double pi=3.1416;
    private double radio;
    
     public Circulo(double radio) {
        this.radio = radio;
    }
     
    //Métodos
    public double CalcularPerimetro(){
        perimetro=2*pi*radio;        
        return perimetro;
    }
    public double CalcularArea(){
        area=pi*radio*radio;
        return area;
    }

   
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        String cadena="";
        cadena+="Detalles del circulo \n";
        cadena+="Radio: "+radio+"\n";
        cadena+="Área: "+CalcularArea()+"\n";
        cadena+="Perímetro: "+CalcularPerimetro()+"\n";
        return cadena;
    }
    
    
    
}
