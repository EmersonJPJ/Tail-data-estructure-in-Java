
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author EMERSON
 */
public class Menu {
    
    private int op;
    Cola c = new Cola();

    public void mostrarMenu() {
        while (op != 7) {
            try{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
                    + "1. Tomar orden de cliente\n"
                    + "2. Atender cliente\n"
                    + "3. Mostrar clientes\n"
                    + "4. Orden de los clientes\n"
                    + "5. Buscar cliente\n"
                    + "6. Modificar ficha del cliente\n"
                    + "7. Salir\n"
                    + "Digite su opción deseada: "));
            }catch(HeadlessException | NumberFormatException e){
                e.getMessage();
            }
            switch (op) {
                case 1:
                    c.tomarOrden();
                    break;
                case 2:
                    c.atenderCliente();
                    break;
                case 3:
                    c.mostrar();
                    break;
                 case 4:
                    c.ordenOrdenes();
                    break;
                 case 5:
                    c.buscarCliente();
                    break;
                 case 6:
                    c.modificarFicha();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción incorrecta");
            }
        }
    }
    
}
