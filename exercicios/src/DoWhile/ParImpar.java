package DoWhile;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,quantidade,cont=0;
        System.out.println("Quantidade de numeros:");
        quantidade = sc.nextInt();
        do{
            System.out.println("Informe o numero:");
            numero = sc.nextInt();
            if(numero % 2 == 0){
                System.out.println("PAR");

            }else{
                System.out.println("ÍMPAR");
            }
            cont++;
        }while (cont < quantidade);
    }
}
