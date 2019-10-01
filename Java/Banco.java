//crear un algortimo que deje ingresar el monto a depositar en un banco, el interes, los años, y cuanto sera el monto final

import java.util.Scanner;

public class Banco {
    public Banco() {
    }

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("ingrese el monto a depositar");
        double vp = Teclado.nextDouble();
        System.out.println("escriba el interes");
        double inte = Teclado.nextDouble();
        System.out.println("escriba a cuantos años");
        double n = Teclado.nextDouble();
        double mes = n * 12.0D;
        double porcent = inte / 100.0D;
        double vf1 = vp * (1.0D + porcent);
        double vf2 = Math.pow(vf1, mes);
        System.out.println("el valor final sera de " + vf2);
    }
}