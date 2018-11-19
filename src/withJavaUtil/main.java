package withJavaUtil;

public class main {
    
    public static void main(String[] args) {
        
        CarroPolicia carroPolicia = new CarroPolicia();
        CarroRoubado carroRoubado = new CarroRoubado();
        
        carroRoubado.addObserver(carroPolicia);
        
        carroRoubado.virarDireita(); 
        //SAÍDA: "CarroPolicia: Carro roubado virou a direta"
        carroRoubado.virarEsquerda();
        //SAÍDA: "CarroPolicia: Carro roubado virou a esquerda"
        carroRoubado.parar();
        //SAÍDA: "CarroPolicia: Carro roubado parou"
        
    }
    
}
