import java.util.Random;

public class LaberintoAzar {

    public static int[][] generarLaberinto(int n) {
        Random rand = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = rand.nextInt(9) + 1;
        return matriz;
    }

    public static int contarMayor4(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz)
            for (int numero : fila)
                if (numero % 2 == 0 && numero > 4)
                    contador++;
        return contador;
    }

    public static double promedioImpares(int[][] matriz) {
        int suma = 0, cantidad = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero % 2 != 0) {
                    suma += numero;
                    cantidad++;
                }
            }
        }
        return (cantidad > 0) ? (double) suma / cantidad : 0;
    }

    public static int[] sumaFilas(int[][] matriz) {
        int[] sumas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int numero : matriz[i])
                suma += numero;
            sumas[i] = suma;
        }
        return sumas;
    }

    public static int[] posicionMaximo(int[][] matriz) {
        int max = -1;
        int[] posicion = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int numero : fila)
                System.out.print(numero + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // tamaño del labernito
        int[][] laberinto = generarLaberinto(n);

        System.out.println("laberinto generado:");
        mostrarMatriz(laberinto);

        System.out.println("pares mayores a 4: " + contarMayor4(laberinto));
        System.out.println("promedio de impares: " + promedioImpares(laberinto));

        int[] sumas = sumaFilas(laberinto);
        System.out.println("suma de cada fila:");
        for (int i = 0; i < sumas.length; i++)
            System.out.println("  fila " + i + ": " + sumas[i]);

        int[] posMax = posicionMaximo(laberinto);
        System.out.println("posición del numero más alto: (" + posMax[0] + ", " + posMax[1] + ") numero mas alto = "+ laberinto[posMax[0]][posMax[1]]);
    }
}