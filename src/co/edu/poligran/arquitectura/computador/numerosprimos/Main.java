package co.edu.poligran.arquitectura.computador.numerosprimos;

/**
 * @author juespinosa2@poligran.edu.co
 * @versión Sep 8, 2020
 * @since 1.8
 */
public class Main {

    public static void main(String[] args) {
        // Se probará con los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("El número " + i + " es primo.");
            } else {
                System.out.println("El número " + i + " no es primo.");
            }
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
