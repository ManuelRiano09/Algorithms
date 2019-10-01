//crear un algoritmo que muestre por ventana el numero del dia pedido por el ususario (numeros 1-6) //


import java.awt.Component;
import javax.swing.JOptionPane;

public class Dias {
    public Dias() {
    }

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Los dias de la semana son 7 en total, digite el numero del dia que quiere saber"));
        while (x<=6){
        switch(x) {
            case 1:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 1 es el lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 2 es el martes");
                break;
            case 3:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 3 es el miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 4 es el jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 5 es el viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 6 es el sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog((Component)null, "el dia numero 7 es el domingo");
                break;
            default:
                JOptionPane.showMessageDialog((Component)null, "este dia no existe");
        }
        }
    }
}
