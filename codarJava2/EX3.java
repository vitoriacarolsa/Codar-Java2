import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o primeiro número: ");
    int a = sc.nextInt();
    System.out.println("Informe o segundo número: ");
    int b = sc.nextInt();
    System.out.println("Informe o terceiro número: ");
    int c = sc.nextInt();

    int minimo = Math.min(a, Math.min(b,c));

System.out.println("A soma dos dois maiores é: " + (a+b+c-minimo));
    }
}