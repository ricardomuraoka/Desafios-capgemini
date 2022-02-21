package App.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class desafioEscada {
    /**
     * @author Ricardo Muraoka
     * @version 1.0.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> stairs = new ArrayList<>();

    System.out.println("Enter your number");
        int steps = input.nextInt();

    for (int i = 0; i < steps; i++) {
            stairs.add(" ".repeat(steps - i) + "*".repeat(i + 1));
        }

    for(String i : stairs) {
            System.out.println(i);
        }
    }
}
