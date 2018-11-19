package noJavaUtil;

public class main {
    
    public static void main(String[] args) {
        
        CarroPolicia carroPolicia = new CarroPolicia();
        CarroRoubado carroRoubado = new CarroRoubado();
        
        carroRoubado.addObservador(carroPolicia);
        
        carroRoubado.virarDireita(); 
        //SAÍDA: "CarroPolicia: Carro roubado virou a direta"
        carroRoubado.virarEsquerda();
        //SAÍDA: "CarroPolicia: Carro roubado virou a esquerda"
        carroRoubado.parar();
        //SAÍDA: "CarroPolicia: Carro roubado parou"
        
    }
    
}
