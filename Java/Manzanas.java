import java.util.Scanner;

public class Manzanas {
    public Manzanas() {
    }

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("digite el numero de kilos a comprar");
        double mz = Teclado.nextDouble();
        if (mz <= 2.0D) {
            double mz2 = mz * 4200.0D;
            System.out.println("el costo es " + mz2);
        }

        double p1;
        double p2;
        double p3;
        if (mz >= 2.1D & mz <= 5.0D) {
            p1 = mz * 4200.0D / 100.0D * 10.0D;
            p2 = mz * 4200.0D;
            p3 = p2 - p1;
            System.out.println("tiene un descuento del 10% (" + p1 + ") que en su totalidad es " + p3);
        }

        if (mz >= 5.1D & mz <= 10.0D) {
            p1 = mz * 4200.0D / 100.0D * 15.0D;
            p2 = mz * 4200.0D;
            p3 = p2 - p1;
            System.out.println("tiene un descuento del 10% (" + p1 + ") que en su totalidad es " + p3);
        }

        if (mz >= 10.1D) {
            p1 = mz * 4200.0D / 100.0D * 20.0D;
            p2 = mz * 4200.0D;
            p3 = p2 - p1;
            System.out.println("tiene un descuento del 10% (" + p1 + ") que en su totalidad es " + p3);
        }

    }
}
