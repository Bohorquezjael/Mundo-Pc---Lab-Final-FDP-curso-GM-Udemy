package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPc {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        Computadora computadora1 = new Computadora("pc1", new Monitor("Dell", 15), new Teclado("USB", "Dell"), new Raton("USB", "Dell"));

        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
    }
}
