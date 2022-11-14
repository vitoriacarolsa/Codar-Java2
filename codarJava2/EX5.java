import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     double primeira, segunda, terceira, quarta;
    double media;
    
    primeira = sc.nextDouble();
    segunda = sc.nextDouble();
    terceira = sc.nextDouble();
    quarta = sc.nextDouble();
    
    media = (primeira + segunda + terceira + quarta) / 4;    
    
    if (media >= 6.0) {
    	System.out.println("Parabéns você foi aprovado, sua nota é: " + media);
    	
    }
    else {
    	System.out.println("Você foi reprovado, sua nota é  " + media);
    }
    sc.close();
    }
}