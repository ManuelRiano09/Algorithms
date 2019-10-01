// crear un algoritmo que convierta una cantidad de dolares a pesos (mostrar porventana) //
import java.awt.Component;
import javax.swing.JOptionPane;

public class DolaresPesos {

    public DolaresPesos() {
    }

    public static void main(String[] args) {
        double dol = Double.parseDouble(JOptionPane.showInputDialog("cual es la cantidad de dolares"));
        double dol2 = dol * 3396.15;
        JOptionPane.showMessageDialog((Component)null, dol + " dolares convertido a pesos colombianos es " + dol2 + "$");
    }
}