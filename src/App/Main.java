package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static App.desafio2.desafioSenha.isValid;
import static App.desafio3.desafioAnagrama.countAnagrams;

public class Main {
    /**
     * @author Ricardo Muraoka
     * @version 1.0.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------- Escolha sua opção --------------------");
        System.out.println("---------- 1 - Desafio da escada ----------------");
        System.out.println("---------- 2 - Desafio de checagem de senha -----");
        System.out.println("---------- 3 - Desafio anagrama -----------------");

        int option = input.nextInt();

        switch (option) {
            case 1:
                List<String> stairs = new ArrayList<>();

                System.out.println("Enter your number");
                int steps = input.nextInt();

                for (int i = 0; i < steps; i++) {
                    stairs.add(" ".repeat(steps - i) + "*".repeat(i + 1));
                }

                for(String i : stairs) {
                    System.out.println(i);
                }
                break;

            case 2:
                Scanner scanner = new Scanner(System.in);

                System.out.println("Nome");
                String name = scanner.next();
                System.out.println("Senha");
                String pass = scanner.next();
                if (isValid(pass) == true) {
                    System.out.println("Senha válida");
                } else {
                    System.out.println("Senha inválida");
                }
                break;

            case 3:
                System.out.println("Digite uma palavra");
                String check = input.next();
                System.out.println(String.valueOf(countAnagrams(check)));
        }
    }
}

