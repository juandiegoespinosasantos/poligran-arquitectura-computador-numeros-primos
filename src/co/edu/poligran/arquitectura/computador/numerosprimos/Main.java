package co.edu.poligran.arquitectura.computador.numerosprimos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author juespinosa2@poligran.edu.co
 * @version Sep 8, 2020
 * @since 1.8
 */
public class Main {

    public static void main(String[] args) {
        int number = getNumberFromInput();

        if (isPrime(number)) {
            System.out.println("> El número " + number + " es primo.");
        } else {
            System.out.println("> El número " + number + " no es primo.");
        }
    }

    private static int getNumberFromInput() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Ingrese un número: ");

            return s.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("> Número no válido");

            return getNumberFromInput();
        }
    }

    private static boolean isPrime(int number) {
        // Se descartan los números que se saben de no son primos.
        if ((number == 0) || (number == 1)) {
            return false;
        }

        /*
         Se comienza un ciclo a partir del número dos y va hasta la mitad del número que se desea
         saber si es primo o no (estos serán los divisores)
         */
        for (int i = 2; i <= (number / 2); i++) {
            /*
            Si la división del número por el divisor de turno en el ciclo es cero, quiere decir que
            se tiene más de un divisor que da una división exacta: el número no sería primo.
             */
            if ((number % i) == 0) {
                return false;
            }
        }

        /*
         Si se lleva a este punto, el número no encontró más divisores que dieran una división en cero:
         El número es primo.
        */
        return true;
    }


}
