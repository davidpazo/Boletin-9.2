package boletin92;
// @author dpazolopez */

import javax.swing.JOptionPane;

public class Suma {
    
    public void Sumar(){
        double suma=0, producto=1;
        for(int i=10; i<=90; i++){
            suma=suma +i;
            producto=producto*i;
            JOptionPane.showMessageDialog(null,"Suma= "+suma+" Producto= "+producto);
        }
    }
}
