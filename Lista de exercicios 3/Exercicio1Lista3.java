import java.util.Scanner;

public class Exercicio1Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 10: ");
        int valor = scanner.nextInt();
        
        scanner.close();
        
        while(valor > 10 || valor < 1){
            System.out.println("Valor invalido!! Digite um valor entre 1 e 10: ");
            valor = scanner.nextInt();
        }
    }
}
