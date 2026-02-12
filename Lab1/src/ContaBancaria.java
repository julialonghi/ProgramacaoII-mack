public class ContaBancaria {
    String nomeCorrentista;
    double saldo;
    public ContaBancaria(String nome, double saldoInicial) {
        try {
            nomeCorrentista = nome;
            saldo = saldoInicial;
        } catch (Exception DepositoMaximoExcedidoException) {
            
        }
        
    }
    public double getSaldo() {
        return saldo;
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public boolean depositar(double valor) throws DepositoMaximoExcedidoException {
        if (valor > 1000000000) {
            throw new DepositoMaximoExcedidoException("Valor do depósito é maior que o valor máximo permitido");
        }
        saldo += valor;
        return true;
    }
    public boolean sacar(double valor) throws SaqueInvalidoException {
        if (valor > saldo) {
            throw new SaqueInvalidoException("Valor do saque é maior que seu saldo");
        }
        saldo -= valor;
        return true;
    }
}