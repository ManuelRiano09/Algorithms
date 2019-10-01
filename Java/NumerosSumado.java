//crear un algoritmo que permita ingresar un numero con mas de 2 digitos y que sume estos

import java.awt.Component;
import javax.swing.JOptionPane;

public class NumerosSumado {
    public NumerosSumado() {
    }

    public static void main(String[] args) {
        double num = 0.0D;
        double sum = 0.0D;
        String dato = JOptionPane.showInputDialog("' Ingrese un numero, se mostrara el numero ingresado y la suma de sus digitos. ");
        num = Double.parseDouble(dato);
        double valor1 = num / 10.0D;
        double valor2 = num % 10.0D;
        sum += valor2;

        double valor3;
        double valor4;
        for(valor1 -= valor2 * 0.1D; valor1 > 0.0D; valor1 = valor3 - valor4 * 0.1D) {
            valor3 = valor1 / 10.0D;
            valor4 = valor1 % 10.0D;
            sum += valor4;
        }

        JOptionPane.showMessageDialog((Component)null, "El numero ingresado es: " + num + " y la suma de sus digitos es: " + sum);
    }
}
