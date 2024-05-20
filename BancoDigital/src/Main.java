
public class Main {

    public static void main(String[] args) {
        Cliente leticia = new Cliente();
        leticia.setNome("Leticia");

        Conta cc = new ContaCorrente(leticia);
        Conta poupanca = new ContaPoupanca(leticia);

        cc.depositar(150);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}