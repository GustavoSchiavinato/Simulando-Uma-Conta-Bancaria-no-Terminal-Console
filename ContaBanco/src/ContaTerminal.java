import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por Favor, Digite o Número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println();


        System.out.print("Por Favor, Digite o Número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.println();

        System.out.print("Por Favor, Digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println();

        System.out.print("Por Favor, Digite o Saldo: ");
        Double saldo = scanner.nextDouble();
        System.out.println();
        
        scanner.close();

        System.out.println();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.";

        System.out.println(mensagem);

        System.out.println();

    }
}
