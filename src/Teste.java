public class Teste {
    public static void main (String[] args) {
    ContaCorrente C1= new ContaCorrente("219033","3847495841");
    ContaCorrente C2= new ContaCorrente("219565","6985696843");
    C1.creditar(300.0);
    C1.debitar(50.0);
    C1.transferir(60,C2);
    System.out.println(C1);
    System.out.println(C2);
    
    
    
    }
    }
