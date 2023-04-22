import java.util.Scanner;

public class Exercicio3Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome de usuário: ");
        String nome = scanner.next();
        while(nome.length() < 3){
            System.out.println("Nome inválido!! Informe outro nome de usuário: ");
            nome = scanner.next();
        }

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        while(idade > 150 || idade < 0){
            System.out.println("Informe uma idade valida!! Idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Salário: ");
        double salario = scanner.nextDouble();
        while(salario < 0){
            System.out.println("O salário tem que ser maior do que 0, informe um salário válido!! Sálario: ");
            salario = scanner.nextInt();
        }

        System.out.println("Sexo ('m', 'f'): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        while(sexo != 'M' && sexo != 'F'){
            System.out.println("Informe um sexo válido!! Sexo:");
            sexo = scanner.next().toUpperCase().charAt(0);
        }

        System.out.println("Estado Civil('s', 'c', 'v', 'd'): ");
        char EstadoCivil = scanner.next().toUpperCase().charAt(0);
        while(EstadoCivil != 'S' && EstadoCivil != 'C' && EstadoCivil != 'V' && EstadoCivil != 'D'){
            System.out.println("Estado civil inválido!! Estado Civil('s', 'c', 'v' ou 'd'):");
            EstadoCivil = scanner.next().toUpperCase().charAt(0);
        }
        scanner.close();
        System.out.println("Sua ficha: \n Nome: " + nome + 
        "\n Idade: " + idade + 
        "\n Salário: R$" + salario +
        "\n Sexo: " + sexo +
        "\n Estado civil: " + EstadoCivil);
    }
}
