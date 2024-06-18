public class ContaCorrente {
    private double saldo;
    private double taxaOperacao;

    public ContaCorrente(double saldoInicial, double taxaOperacao) {
        this.saldo = saldoInicial;
        this.taxaOperacao = taxaOperacao;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    public boolean sacar(double quantia) {
        double taxa = calcularTaxa(quantia);
        double valorTotal = quantia + taxa;
        if (quantia > 0 && valorTotal <= saldo) {
            saldo -= valorTotal;
            return true;
        } else {
            System.out.println("Saque inválido ou saldo insuficiente!");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double calcularTaxa(double quantia) {
        return quantia * taxaOperacao;
    }
}

class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(double saldoInicial) {
        super(saldoInicial, 0.001);
    }
}