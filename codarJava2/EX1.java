import java.util.Scanner;

public class Main {
public static void main (String[] args) {
Scanner ler = new Scanner (System.in);
System.out.println("Informe um número: ");
int valor = ler.nextInt();
if (valor > 0) {
System.out.print("O número é positivo");
} else if (valor == 0) {
System.out.print("Número zero");
} else if (valor < 0) {
System.out.print("O número é negativo");
} 
}
}



