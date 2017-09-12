package ed1_prova1_marcos_flavio;

public class Pilhas {

    public Object[] pilha;
    public int posicaodaPilha;

    public Pilhas() {
        this.posicaodaPilha = -1;
        this.pilha = new Object[40];
    }

    public boolean pilhaVazia() {
        if (this.posicaodaPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaodaPilha + 1;
    }

    public Object exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaodaPilha];
    }

    public void imprimepilha() {
        for (int i = 0; i < this.tamanho(); i++) {
            System.out.println(this.pilha[i]);
        }
    }

    public Object Desempilha() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaodaPilha--];
    }

    public boolean pilhaCheia() {
        if (this.pilha[this.pilha.length - 1] != null) {
            System.out.println("pilhaCheia");
            return true;
        }
        return false;
    }

    public void Separador(Pilhas pilhaPar, Pilhas pilhaImpar) {
        int val;
        while (this.pilhaVazia() == false) {
            double valor = (double) this.Desempilha();
            val = (int) (valor % 2);
            if (val == 0) {
                pilhaPar.empilhar(valor);
            } else {
                pilhaImpar.empilhar(valor);
            }
        }
    }

    public void empilhar(double valor) {
        if (this.pilhaCheia()) {
            return;
        }
        this.pilha[++posicaodaPilha] = valor;
    }

}
