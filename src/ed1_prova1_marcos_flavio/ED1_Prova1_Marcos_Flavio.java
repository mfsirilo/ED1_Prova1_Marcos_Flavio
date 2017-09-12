package ed1_prova1_marcos_flavio;
public class ED1_Prova1_Marcos_Flavio {
    public static void main(String[] args) {
        Pilhas pilha1 = new Pilhas();
        Pilhas pilhaPar = new Pilhas();
        Pilhas pilhaImp = new Pilhas();
        
        for(int i=0 ; i<=20; i++){
            pilha1.empilhar(i);
        }
        pilha1.Separador(pilhaPar, pilhaImp);
        
        System.out.println("Pilha original");
        System.out.println("");
        pilha1.imprimepilha();
        System.out.println("");
        
        System.out.println("");
        System.out.println("Pilha Par");
        pilhaPar.imprimepilha();
        System.out.println("");
        
        System.out.println("");
        System.out.println("Pilha Impar");
        pilhaImp.imprimepilha();
        System.out.println("");
       
    }
    
}
