package actividad_2;

public class CaballoDomesticado extends Caballo{

    
    public String acariciar() {
        return "Aceptación";
    }
    
      @Override
    public String toString() {
        String cadena;
        cadena=acariciar();
        return cadena;
    }
}
