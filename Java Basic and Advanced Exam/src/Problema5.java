import Problema5Interface.Problema5Interface;

import java.util.Scanner;

public class Problema5 implements Problema5Interface {

    public static void main(String[] args) {
        Problema5 p = new Problema5();
        p.Suma(5, 2);
        p.Resta(10, 5);
        p.Multiplicacion(8, 4);
        p.Division(15, 6);
    }
}
