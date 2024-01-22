import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        char operador;

        System.out.println("Digite o primeiro numero: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = scan.nextInt();

        System.out.println("Digite o operador (+, -, *, /): ");
        operador = scan.next().charAt(0);

        int resultado = 0;
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;

            case '-':
                resultado = numero1 - numero2;
                break;

            case '*':
                resultado = numero1 * numero2;
                break;

            case '/':
                resultado = numero1 / numero2;
                break;

            }
        System.out.println("O resultado é: " + resultado);
    }
}