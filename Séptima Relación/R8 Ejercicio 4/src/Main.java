import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);

        int n,suma = 0,suma2 = 0;
        int arraybi[][] = new int[4][5];

        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 5;j++){

                n = (int)(Math.random() * (999 - 100)) + 100;
                arraybi[i][j] = n;
            }
        }

        for(int i = 0; i < 4;i++){
            Thread.sleep(1000);
            for(int j = 0; j < 5;j++){

                System.out.print(arraybi[i][j] + "        ");
                suma += arraybi[i][j];
            }
            Thread.sleep(2000);
            System.out.println("  " + suma + " Fila: " + i);
            System.out.println();
            suma = 0;
        }

        for(int j = 0; j < 5;j++){
            Thread.sleep(1000);
            for(int i = 0; i < 4;i++){
                suma2 += arraybi[i][j];
            }
            Thread.sleep(2000);
            System.out.print(suma2 + " C." + j + "  ");
            suma2 = 0;
        }
    }
}