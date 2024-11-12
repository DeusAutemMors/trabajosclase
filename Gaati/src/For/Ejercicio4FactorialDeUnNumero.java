
package For;

import java.util.Scanner;


public class Ejercicio4FactorialDeUnNumero {
    
     Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int factorial = 5;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);

}
}