
import java.util.Scanner;

public class Problema4 {

    public String middleWay(int[] j, int[] k) {

        return j[1] + " " + k[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arregloJ = {5,6,7};
        int[] arregloK = {8,9,10};

        Problema4 myObj = new Problema4();
        System.out.println("Los valores del medio son: "+myObj.middleWay(arregloJ, arregloK));
    }
}