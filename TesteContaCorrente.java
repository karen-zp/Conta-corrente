public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 0.005);
        System.out.println("Saldo inicial (Conta Corrente): " + conta.getSaldo());

        conta.depositar(500);
        System.out.println("Saldo após depósito de 500: " + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo após saque de 200: " + conta.getSaldo());

        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial(1000);
        System.out.println("\nSaldo inicial (Conta Corrente Especial): " + contaEspecial.getSaldo());

        contaEspecial.depositar(500);
        System.out.println("Saldo após depósito de 500: " + contaEspecial.getSaldo());

        contaEspecial.sacar(200);
        System.out.println("Saldo após saque de 200: " + contaEspecial.getSaldo());
    }
}
