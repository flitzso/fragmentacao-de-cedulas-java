import java.util.Scanner;

public class Cedula {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        System.out.println(valor);

        System.out.println(valor / 100 + " notas(s) de r$ 100,00");
        valor = valor % 100;
        System.out.println(valor / 50 + " notas(s) de r$ 50,00");
        valor = valor % 50;
        System.out.println(valor / 20 + " notas(s) de r$ 20,00");
        valor = valor % 20;
        System.out.println(valor / 10 + " notas(s) de r$ 10,00");
        valor = valor % 10;
        System.out.println(valor / 5 + " notas(s) de r$ 5,00");
        valor = valor % 5;
        System.out.println(valor / 2 + " notas(s) de r$ 2,00");
        valor = valor % 2;
        System.out.println(valor / 1 + " notas(s) de r$ 1,00");

        input.close();

    }

}