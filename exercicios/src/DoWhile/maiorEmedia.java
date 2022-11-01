package DoWhile;

import java.util.Scanner;

public class maiorEmedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 0,maior=0;
        float aux = 0;

        do {
            System.out.println("Informe o numero:");
            num = sc.nextInt();
            aux = aux + num;
            if (num > maior) {
                maior = num;
            }
            i++;
        }while(i < 5);
        System.out.println("A média deles é:"+ aux/5 + " e o maior entre eles é: " + maior);
    }
}
