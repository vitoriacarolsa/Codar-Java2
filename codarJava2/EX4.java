import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Informe 10 números: ");
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    int numero3 = sc.nextInt();
    int numero4 = sc.nextInt();
    int numero5 = sc.nextInt();
    int numero6 = sc.nextInt();
    int numero7 = sc.nextInt();
    int numero8 = sc.nextInt();
    int numero9 = sc.nextInt();
    int numero10 = sc.nextInt();
    int media;
    media = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10 / 10;
    
    System.out.println("A média dos números é: " + media);
    sc.close();
    }
}