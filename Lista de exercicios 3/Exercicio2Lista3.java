import java.util.Scanner;
public class Exercicio2Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome de usuário: ");
        String nome = scanner.next().toLowerCase();
        
        System.out.println("Digite a senha: ");
        String senha = scanner.next().toLowerCase();

        while(senha.contains(nome)){
            System.out.println("A senha não pode ser igual ao nome de usuário, por favor informe uma senha diferente: ");
            senha = scanner.next();
        }
        scanner.close();
        System.out.println("Bem vindo, " + nome + "!!");
    }
}
