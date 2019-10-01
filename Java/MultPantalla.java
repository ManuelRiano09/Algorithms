//crear un lagoritmo que permita multiplicar 2 numeros por panalla //

import java.awt.Component;
import javax.swing.JOptionPane;

public class MultPantalla {
    public MultPantalla() {
    }

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("digite un numero entero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("digite un numero a multiplicar"));
        double res = num1 * num2;
        JOptionPane.showMessageDialog((Component)null, num1 + " x " + num2 + " = " + res);
    }
}
