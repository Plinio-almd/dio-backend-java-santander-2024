import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor, digite o número da conta. Ex: 12646: ");
    int numero = scanner.nextInt();
    System.out.print("Por favor, digite o número da agencia. Ex: 844-8: ");
    String agencia = scanner.next();
    System.out.print("Por favor, digite o seu nome. ");
    String nomeCliente = scanner.next();
    System.out.print("Por favor, digite o valor. Ex 235,50: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque");
  }
}