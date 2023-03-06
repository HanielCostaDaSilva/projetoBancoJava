public class Teste {
    public static void main(String[] args) {
        ContaCorrente C1 = new ContaCorrente(219033l, 3847495841l, "Jose Alencar");
        ContaCorrente C2 = new ContaCorrente(219565l, 6985696843l, "Elza Queiroz");
        C1.creditar(300.0);
        C1.debitar(50.0);
        C1.transferir(60, C2);
        System.out.println(C1);
        System.out.println(C2);

    }
}
