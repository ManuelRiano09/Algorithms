//crear un algoritmo que por medio de pantalla permita ingresar:
// *el numero de subindices de un arreglo
// *los numeros de cada posicion
// *la suma de ellos

import javax.swing.*;
import java.awt.*;

public class Array {

    public static void main(String[] args) {
        int acum = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("numero de subindices "));
        int[] valores = new int[n];

        for(int i = 0; i < n; ++i) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("numero para posicion " + i));
            acum += valores[i];
        }

        JOptionPane.showMessageDialog((Component)null, "la suma es " + acum);
    }
}
