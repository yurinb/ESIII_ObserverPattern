package withJavaUtil;

import java.util.Observable;

public class CarroRoubado extends Observable {

    private String acao;

    public void virarEsquerda() {
        setAcao("Virou a esquerda");
    }

    public void virarDireita() {
        setAcao( "Virou a direita");
    }

    public void parar() {
        setAcao("Parou");
    }
    
    private void setAcao(String acao) {
        this.acao = acao;
        atualizaEstado();
    }

    private void atualizaEstado() {
        this.setChanged();
        this.notifyObservers(acao);
    }

}
