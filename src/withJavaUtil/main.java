package withJavaUtil;

public class main {
    
    public static void main(String[] args) {
        
        CarroPolicia carroPolicia = new CarroPolicia();
        CarroRoubado carroRoubado = new CarroRoubado();
        
        carroRoubado.addObserver(carroPolicia);
        
        carroRoubado.virarDireita();
        carroRoubado.virarEsquerda();
        carroRoubado.parar();
        
    }
    
}
