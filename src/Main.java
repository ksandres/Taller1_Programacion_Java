import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los sets de A:");
        int a = scanner.nextInt();
        System.out.println("Ingrese los sets de B:");
        int b = scanner.nextInt();

        if (a < 0 || b < 0 || a >= 8 || b >= 8) {
            System.out.println("Los valores ingresados son inválidos.");
        } else if (a == 6 && b < 5) {
            System.out.println("El set es de A.");
        } else if (b == 6 && a < 5) {
            System.out.println("El set es de B.");
        } else if ((a == 7 && b >= 5) || (b == 7 && a >= 5)) {
            if (a == 7) {
                System.out.println("El set es de A");
            } else {
                System.out.println("El set es de B");
            }
        }else if (a == 7 || b == 7) {
                System.out.println("El set no ha terminado.");


            }
        }
    }
