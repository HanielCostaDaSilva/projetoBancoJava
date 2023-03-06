public class ContaCorrente {
    private String cartao;
    private String CPF;
    private double saldo;
    
    public ContaCorrente( String numeroCartao, String CPF){
    this.saldo=0.0;
    this.cartao=numeroCartao;
    this.CPF=CPF;
    }
    
    public String getCartao() {
    return cartao;
    }
    
    public void setCartao(String cartao) {
    this.cartao = cartao;
    }
    
    public String getCPF() {
    return CPF;
    }
    
    public void setCPF(String cPF) {
    CPF = cPF;
    }
    
    public double getSaldo() {
    return saldo;
    }
    
    public double debitar(double valor) {
    if (valor<= this.saldo) {
    this.saldo-=valor;
    return valor;
    }
    return 0.0;
    
    }
    
    public void creditar(double valor) {
    this.saldo+=valor;
    }
    
    public String toString() {
    return "ContaCorrente [cartao=" + cartao + ", CPF=" + CPF + ", saldo=" + saldo + "]";
    }
    
    public void transferir(double valor, ContaCorrente Conta){
    Conta.creditar(this.debitar(valor));
    
    }
    }