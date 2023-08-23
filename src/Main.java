import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int b = scanner.nextInt();

        float division = (float) a/b;
        System.out.println("la divicion es " + division);
        float modulo = a%b;
        if (modulo == 0){System.out.println("la divion es exacta");
        }else {System.out.println("La division no es exacta");}



        }
    }
