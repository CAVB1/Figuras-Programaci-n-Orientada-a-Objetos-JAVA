package actividad_2;

public class CaballoSalvaje extends Caballo{

    @Override
    public String acariciar() {
        
        return "Encabritamiento"; 
    }

    @Override
    public String toString() {
        String cadena;
        cadena=acariciar();
        return cadena;
    }
    
    
}
