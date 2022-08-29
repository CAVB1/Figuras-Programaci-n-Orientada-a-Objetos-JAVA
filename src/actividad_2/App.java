package actividad_2;

public class App {

    public static void main(String[] args) {
      
        Animal c=new CaballoSalvaje();
        Reaccion(c);
        
        Animal cb=new CaballoDomesticado();
        Reaccion(cb);
      
    }
    public static void Reaccion(Animal a){
        System.out.println("Reacción del animal al acariciar: "+a);
    }
    
}
