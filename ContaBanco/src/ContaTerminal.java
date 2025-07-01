import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o nome do cliente: ");
        sc.next();
        String nomeCliente = sc.nextLine();
        System.out.print("Informe o saldo: ");
        double saldo = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        System.out.println();
        System.out.println(conta);
    }
}
