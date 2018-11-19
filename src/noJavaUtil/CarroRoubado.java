package noJavaUtil;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado {

    private String acao;
    private final List<Observador> observadores = new ArrayList();

    public void virarEsquerda() {
        setAcao("Virou a esquerda");
    }

    public void virarDireita() {
        setAcao("Virou a direita");
    }

    public void parar() {
        setAcao("Parou");
    }

    public void setAcao(String acao) {
        this.acao = acao;
        atualizarEstado();
    }

    public void addObservador(Observador observador) {
        this.observadores.add(observador);
    }

    private void atualizarEstado() {
        for (Observador observador : observadores) {
            // Notifica os observadores chamando a função "handleUpdate" em todos os
            // objetos que foram adicionados a lista de observadores atraves do metodo "addObservador"
            observador.handleUpdate(this, acao);
        }
    }

}
