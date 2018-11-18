package noJavaUtil;

public class main {
    
    public static void main(String[] args) {
        
        CarroPolicia carroPolicia = new CarroPolicia();
        CarroRoubado carroRoubado = new CarroRoubado();
        
        carroRoubado.addObservador(carroPolicia);
        
        carroRoubado.virarDireita();
        carroRoubado.virarEsquerda();
        carroRoubado.parar();
        
    }
    
}
