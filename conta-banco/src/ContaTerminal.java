import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agenciaConta = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

      System.out.println("Dados da conta:");
       
      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

        scanner.close();
    }
}
