public class Main {
    public static void main(String[] args) {
        Cliente marcelo = new Cliente();
        marcelo.setNome("Marcelo D.");
        
        Conta cc = new ContaCorrente(marcelo);
        Conta poupanca = new ContaPoupanca(marcelo);

        cc.depositar(1000);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
