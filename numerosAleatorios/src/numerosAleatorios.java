import java.util.Random;

public class numerosAleatorios {

    public static void main(String[] args) {
        mostrarNumerosAleatorios();
    }

    public static void mostrarNumerosAleatorios() {
        // Creamos un objeto de la clase Random para generar números aleatorios
        Random random = new Random();

        // Mostramos 20 números aleatorios entre 1 y 10
        System.out.println("20 números aleatorios entre 1 y 10:");

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(10) + 1; // Genera un número entre 1 y 10
            System.out.print(numeroAleatorio + " ");
        }
    }
}