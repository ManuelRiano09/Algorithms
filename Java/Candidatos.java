//candidatos-estados
//votos por los candidatos en todos los estados
//cantidad de sufragantes


import javax.swing.*;
import java.awt.*;


public class Candidatos {
    public static void main(String[]args){
        int n=0, m=0;
        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de postulados "));
        m = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estados a votar "));
        int [][]array = new int[n][m] ; {


            int votos1 = 0;
            for (int i =0; i < n; i++) {
                int votos = 0;
                int x;

                for (int j =0; j < m; j++){
                    array[i][j]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el total de votos por el candidato " + (i + 1) + " en el estado " + (j + 1)));

                    votos += array[i][j];
                    votos1 += array[i][j];
                }
                JOptionPane.showMessageDialog((Component)null, "el total de votos por el candidato " + (i+1) + " en los estados fue  " + votos);
                System.out.println("el total de votos por el candidato " + (i+1) +" en los estados fue"  + votos);
            }
            JOptionPane.showMessageDialog((Component)null, "el total de sufragantes fue  " + votos1);
            System.out.println("el total de sufragantes fue  " + votos1);



        }
    }

}
