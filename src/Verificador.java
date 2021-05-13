import java.util.Arrays;
import java.util.List;

public class Verificador {

    public Verificador() {
    }
    public void darCadenasCodificantes(String cadena){
       List<String> cadenaSeparada= Arrays.asList(cadena.split("TATAAA"));
       for(int i=1;i<cadenaSeparada.size();i=i+2){
           System.out.println(cadenaSeparada.get(i));
       }
    }
}
