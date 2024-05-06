import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para começarmos o processo de criação de conta, por favor digite o seu nome completo.");
        String nomeCliente = scanner.next();

        System.out.println("Informe o número da sua Agência com o dígito.");
        String agenciaConta = scanner.next();

        System.out.println("Informe o número da sua conta sem o dígito.");
        int numeroConta = scanner.nextInt();

        System.out.println("Por último, por favor informe o saldo da sua conta.");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá ".concat(nomeCliente)
                        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                        .concat(agenciaConta)
                        .concat(", conta ")
                        .concat(String.valueOf(numeroConta))
                        .concat(" e o seu saldo ")
                        .concat(String.valueOf(saldoConta))
                        .concat(" já está disponível para saque.")
        );
    }
}

