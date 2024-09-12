// package slip2;
// Write a java program to display transpose of a given matrix.
package collage;
import java.util.Scanner;
public class Q2 {
    public static void accept(int a[][]) {
        // int n =input.nextInt();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = input.nextInt();
            }
        }

    }

    public static void display(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void transport(int a[][], int b[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                b[i][j] = a[i][j];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = new int[3][4];
        int b[][] = new int[3][4];
        accept(a);
        display(a);
        System.out.println("The matrix transoprt ");
        transport(a, b);
        // display2(b);
    }
}
