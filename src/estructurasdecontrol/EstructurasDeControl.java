

package estructurasdecontrol;

import java.util.Scanner;
// Ejercicio con estructuras de control



public class EstructurasDeControl {
    public static void main(String[] args) {
        
        // Estructura de control If
        int numeroIf = -5;
        
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
        
        // Estructura de control While
        int numeroWhile = 0;
        
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        // Estructura de control Do While
        int numeroDoWhile = 0;
        
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 1);
        
        // Estructura de control For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        // Estructura de control Switch
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese la estación:");
        String estacion = scanner.nextLine();
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("El valor de la variable estacion no corresponde a una estación del año.");
                break;
        }
    }
}
