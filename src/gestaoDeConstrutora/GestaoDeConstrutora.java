package gestaoDeConstrutora;

import gestaoDeConstrutora.BancoDeDados.BD;
import gestaoDeConstrutora.Telas.THome;

public class GestaoDeConstrutora {
    
    public static void main(String[] args) {
        // TODO code application logic here
        THome home = new THome(new BD());
        
    }
    
}
