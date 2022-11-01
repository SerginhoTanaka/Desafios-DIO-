import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("Nota:");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Informe uma nota valida.Digite novamente:");
            nota = scanner.nextInt();

        }
    }
}
