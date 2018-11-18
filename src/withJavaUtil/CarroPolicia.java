package withJavaUtil;

import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer {

    public void virarEsquerda() {
        System.out.println("CarroPolicia: Carro roubado virou a esquerda");
    }

    public void virarDireita() {
        System.out.println("CarroPolicia: Carro roubado virou a direita");
    }

    public void parar() {
        System.out.println("CarroPolicia: Carro roubado parou");
    }

    @Override
    public void update(Observable o, Object arg) {

        CarroRoubado carroRoubado = (CarroRoubado) o;
        String acao = String.valueOf(arg);

        switch (acao) {
            case "Virou a esquerda":
                this.virarEsquerda();
                break;
            case "Virou a direita":
                this.virarDireita();
                break;
            case "Parou":
                this.parar();
                break;
        }

    }

}
