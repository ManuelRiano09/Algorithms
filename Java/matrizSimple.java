//Crear una matriz de 3x3 que genere los numeros del 1 al 9//


public class matrizSimple {
    public matrizSimple() {
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[0].length; ++j) {
                matriz[i][j] = i * matriz.length + j + 1;
                System.out.print(matriz[i][j] + "");
            }

            System.out.println("");
        }

    }
}
