//crear un algoritmo que lea las calificacionesde 11 estudiantes y muestre en pantalla
//*La cantidad de estudiantes que obtuvieron una calificacion menor a 50 *
//*La cantidad de estudiantes que obtuvieron una calificacion entre 50 a 70
//*La cantidad de estudiantes que obtuvieron una calificacion entre 70 a 80
//*La cantidad de estudiantes que obtuvieron una calificacion mayor a 80



import java.awt.Component;
import javax.swing.JOptionPane;

public class estudiantes {
    public estudiantes() {
    }

    public static void main(String[] args) {
        int cont = 1;
        int acumulador = 0;
        int acumulador1 = 0;
        int acumulador2 = 0;
        int acumulador3 = 0;

        while(true) {
            while(cont <= 11) {
                String nota = JOptionPane.showInputDialog((Component)null, "Calificacion obtenida estudiante " + cont);
                int calificacion = Integer.parseInt(nota);
                ++cont;
                if (calificacion > 0 && calificacion <= 100) {
                    if (calificacion < 50) {
                        ++acumulador;
                    }

                    if (calificacion >= 50 && calificacion < 70) {
                        ++acumulador1;
                    }

                    if (calificacion >= 70 && calificacion < 80) {
                        ++acumulador2;
                    }

                    if (calificacion > 80) {
                        ++acumulador3;
                    }
                } else {
                    JOptionPane.showMessageDialog((Component)null, "La calificacion debe estar entre 1 y 100", "Error", 3);
                }
            }

            JOptionPane.showMessageDialog((Component)null, "La cantidad de estudiantes que obtuvieron una calificacion menor a 50: " + acumulador + "\nLa cantidad de estudiantes que obtuvieron una calificacion entre 50 a 70: " + acumulador1 + "\nLa cantidad de estudiantes que obtuvieron una calificacion entre 70 a 80: " + acumulador2 + "\nLa cantidad de estudiantes que obtuvieron una calificacion mayor a 80: " + acumulador3);
            return;
        }
    }
}
