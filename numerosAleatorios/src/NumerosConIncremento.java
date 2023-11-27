import java.util.Scanner;

public class NumerosConIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca tres números distintos
        int num1, num2, num3;

        // Primer número
        do {
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número (distinto al primero): ");
            num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("Error: Los números deben ser distintos. Inténtalo de nuevo.");
            }
        } while (num1 == num2);

        // Asegurarse de que num1 es el menor de los dos
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Tercer número
        System.out.print("Introduce el tercer número: ");
        num3 = scanner.nextInt();

        // Imprimir el tercer número si está entre el primero y el segundo
        if (num1 < num3 && num3 < num2) {
            System.out.println("El tercer número " + num3 + " está entre " + num1 + " y " + num2);
        }

        // Imprimir los números enteros comprendidos entre num1 y num2, con incremento de 7
        System.out.println("Números entre " + num1 + " y " + num2 + " con incremento de 7:");

        for (int i = num1; i <= num2; i += 7) {
            System.out.print(i + " ");
        }

        // Cerrar el escáner
        scanner.close();
    }
}