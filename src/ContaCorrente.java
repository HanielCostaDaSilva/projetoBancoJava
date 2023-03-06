public class ContaCorrente {
    private long cartao;
    private long CPF;
    private double saldo;
    private String nomeTitular;

    public ContaCorrente(long numeroCartao, long CPF, String nomeTitular) {
        this.saldo = 0.0;
        this.cartao = numeroCartao;
        this.CPF = CPF;
        this.nomeTitular = nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public long getCartao() {
        return cartao;
    }

    public void setCartao(long cartao) {
        this.cartao = cartao;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public double getSaldo() {
        return saldo;
    }

    public double debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return valor;
        }
        return 0.0;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public String toString() {
        return "ContaCorrente [cartao=" + cartao + ",Titular=" + nomeTitular + ", CPF=" + CPF + ", saldo=" + saldo+ "]";
    }

    public void transferir(double valor, ContaCorrente Conta) {
        Conta.creditar(this.debitar(valor));
    }

}