import java.util.Scanner;

public class prue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        Libro libro = new Libro(titulo, autor);

        System.out.print("Ingrese el precio del libro: ");
        double precio = scanner.nextDouble();
        libro.setPrecio(precio);

        // Impresión de información
        System.out.println("\nInformación del Libro:");
        libro.imprimirInfo();

        scanner.close();
    }
}


    
