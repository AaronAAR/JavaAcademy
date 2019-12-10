package Problema5Interface;

import java.util.Scanner;

public interface Problema5Interface {
    default void Suma(int n1, int n2) {
        System.out.println("La suma es: " + (n1 + n2));
    }

    default void Resta(int n1, int n2) {
        System.out.println("La resta es: " + (n1 - n2));
    }

    default void Multiplicacion (int n1, int n2) {
        System.out.println("La multiplicación es: " + (n1*n2));
    }

    default void Division (double n1, double n2) {
        System.out.println("La división es: " + (n1/n2));
    }
}
