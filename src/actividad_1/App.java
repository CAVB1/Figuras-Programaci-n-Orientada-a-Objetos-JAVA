package actividad_1;

public class App {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Figura c1=new Circulo(3.5);
        CalcularDatos(c1);
        
        Figura r1=new Rectangulo(5, 7);
        CalcularDatos(r1);
        
        
        Figura t1=new Triangulo(3, 4, 6, 6);
        CalcularDatos(t1);
    }
    
    public static void CalcularDatos(Figura c){
        c.CalcularArea();
        c.CalcularPerimetro();
        System.out.println(c);
    }
}
