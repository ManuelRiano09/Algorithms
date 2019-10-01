//crear un algortimo que calcule el total de hamburguesas, refrescos, ensaladas y salchipapas vendidos, que muestre  en pantalla
// el iva del 8% y el monto neto. //
import java.awt.Component;
import javax.swing.JOptionPane;

public class Hamb {
    public Hamb() {
    }

    public static void main(String[] args) {
        int acum = 0;
        int hamb = Integer.parseInt(JOptionPane.showInputDialog("cuantas hamburguesas se vendieron"));
        int hamb2 = hamb * 10000;
        acum = acum + hamb2;
        int refre = Integer.parseInt(JOptionPane.showInputDialog("cuantos refrescos se vendieron"));
        int refre2 = refre * 2500;
        acum += refre2;
        int ensa = Integer.parseInt(JOptionPane.showInputDialog("cuantas ensaladas se vendieron"));
        int ensa2 = ensa * 3000;
        acum += ensa2;
        int salchi = Integer.parseInt(JOptionPane.showInputDialog("cuantas salchipapas se vendieron"));
        int salchi2 = salchi * 8000;
        acum += salchi2;
        double iba = (double)acum * 0.08D;
        double iva2 = (double)acum - iba;
        
        JOptionPane.showMessageDialog((Component)null, "el total vendido fue " + acum);
        JOptionPane.showMessageDialog((Component)null, "el impuesto a pagar es  " + iba + "%");
        JOptionPane.showMessageDialog((Component)null, "el monto neto es " + iva2);
    }
}
