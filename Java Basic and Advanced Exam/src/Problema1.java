import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        int N;

        Scanner scan = new Scanner (System.in);
        System.out.println("Ingresa un valor: ");
        N = scan.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
