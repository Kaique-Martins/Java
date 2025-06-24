import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pede o nome
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        // Pede a idade
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        // Verifica se pode tirar CNH
        if (idade >= 18) {
            System.out.println(nome + ", você pode tirar a CNH!");
        } else {
            System.out.println(nome + ", você ainda não pode tirar a CNH.");
        }

        entrada.close();
    }
}
