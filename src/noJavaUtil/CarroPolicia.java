package noJavaUtil;

public class CarroPolicia implements Observador {

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
    public void handleUpdate(Object o, Object arg) {
        if (o instanceof CarroRoubado) {
            String acao = String.valueOf(arg);
            switch (acao) {
                case "Parou":
                    this.parar();
                    break;
                case "Virou a direita":
                    this.virarDireita();
                    break;
                case "Virou a esquerda":
                    this.virarEsquerda();
                    break;
            }
        }
    }

}
