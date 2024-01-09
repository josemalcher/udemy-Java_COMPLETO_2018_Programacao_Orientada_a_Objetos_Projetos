import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Exemplos:
        Entrada: -10
        Saída: NEGATIVO
        Entrada: 8
        Saída: NAO NEGATIVO
        Entrada: 0
        Saída: NAO NEGATIVO
        */
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        }else{
            System.out.println("Não Negativo");
        }
        sc.close();
    }
}
