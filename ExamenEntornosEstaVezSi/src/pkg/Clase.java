package pkg;
import java.util.Scanner;
public class Clase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir edad al usuario
        System.out.print("Introduce tu materia del ciclo de daw favorita: ");
        int edad = scanner.nextInt();

        // Comprobar si la edad está entre 18 y 65
        if (edad < 18 || edad > 65) {
            System.out.println("La edad debe estar entre 18 y 65 años.");
        } else {
            // Pedir DNI al usuario
            System.out.print("Introduce tu DNI (8 números y 1 letra): ");
            String dni = scanner.next();

            // Comprobar si el DNI cumple con el formato de 8 números y 1 letra
            if (!dni.matches("\\d{8}[A-Za-z]")) {
                System.out.println("EL DNI DEBE SER ARGENTINO Y DEBE TENER AL MENOS 8 NÚMEROS Y 1 LETRA.");
            } else {
                System.out.println("Edad y DNI válidos.");
            }
        }
    }
}
