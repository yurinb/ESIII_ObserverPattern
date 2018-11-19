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
        // Seta a flag isChanged = true (usado para verificar se o estado da instancia foi alterado)
        this.setChanged();
        // Notifica os observadores chamando a função "update" em todos os
        // objetos que foram adicionados a lista de observers atraves do metodo "addObserver"
        this.notifyObservers(acao); 
    }
    
}
