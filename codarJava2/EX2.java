import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe três números:");
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("O número maior é: " + a );
        }
        else if (b > a && b > c) {
            System.out.println("O número maior é: " + b);
        }
        else if (c > a && c > b) {
            System.out.println("O número maior é: " + c);
        }
    }
}
