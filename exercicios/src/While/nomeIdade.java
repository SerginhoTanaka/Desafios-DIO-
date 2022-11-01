package While;

import java.util.Scanner;

public class nomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("para finalizar o Loop,digite 0" );
        while (true) {
            System.out.println("Nome:");
            nome = scanner.next();
            if (nome.equals("0")) break;
            System.out.println("Idade:");
            idade = scanner.nextInt();


        }
    }

}
