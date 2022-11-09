/**
 *
 * @author EMERSON
 */


import java.util.Arrays;
import javax.swing.JOptionPane;
public class Cola {
    private Nodo inicio;
    private Nodo fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void tomarOrden() {
        Nodo nuevo = new Nodo();
        nuevo.setElemento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ficha del cliente: ")));
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Se le asigno una ficha al cliente");
    }
    
     public void ordenOrdenes(){
         //Mostrar los datos de forma ascendente
        Nodo pila=inicio;
        String pilaordenada="";
        while(pila!=null){
            pilaordenada+=pila.getElemento()+" ";
            pila=pila.getSiguiente();
        }
        String cadena []=pilaordenada.split(" ");
        Arrays.sort(cadena);
        for(int i=0; i<cadena.length;i++){
            pilaordenada+=" "+cadena[i];
        }
        JOptionPane.showMessageDialog(null,cadena,"Orden para atender a los clientes",
                JOptionPane.PLAIN_MESSAGE);
    }
     
    public void buscarCliente(){
        if (!vacia()) {
            Nodo aux = inicio;
            boolean encontrado=false;
            int buscarNodo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ficha del cliente a buscar"));
            while (aux != null && encontrado !=true) {
                if (aux.getElemento()==buscarNodo) {
                    JOptionPane.showMessageDialog(null,"El cliente buscado: "+aux.getElemento()+", si existe");
                    encontrado=true;                   
                }
                aux=aux.getSiguiente();
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null,"El cliente no ha sido registrado");
                
            }
        } else {
                JOptionPane.showMessageDialog(null, "No hay clientes, cola vacía");
                    
        }
    
    }
    
    public void modificarFicha(){
        if (!vacia()) {
            Nodo aux = inicio;
            boolean encontrado=false;
            int buscarNodo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ficha del cliente a modificar"));
            while (aux != null && encontrado !=true) {
                if (aux.getElemento()==buscarNodo) {
                    JOptionPane.showMessageDialog(null,"El cliente buscado: "+aux.getElemento()+", si existe");
                    aux.setElemento(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nueva ficha")));
                    JOptionPane.showMessageDialog(null,"Se ha modificado la ficha del cliente");
                    encontrado=true;                   
                }
                aux=aux.getSiguiente();
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null,"El cliente no ha sido registrado");
                
            }
        } else {
                JOptionPane.showMessageDialog(null, "No hay clientes, cola vacía");
                    
        }
    }
    
    public void atender(){
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El cliente fue atendido");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede atender, no hay clientes");
        }
    }
    
    
    public void atenderCliente(){
        if (!vacia()) {
            int buscarNodo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ficha del cliente que fue atendido"));
                if (inicio.getElemento()==buscarNodo) {
                    inicio = inicio.getSiguiente();
                    JOptionPane.showMessageDialog(null,"Elemento extraído");
                } else {
                    Nodo anterior;
                    Nodo aux;
                    
                    anterior = inicio;
                    aux=inicio.getSiguiente();
                    
                    while ((aux != inicio) && (aux.getElemento() != buscarNodo)) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        anterior.setSiguiente(aux.getSiguiente());
                        fin.setSiguiente(inicio);
                        JOptionPane.showMessageDialog(null,"Elemento extraído");
                    }
                
            }
    }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";
            Nodo aux = inicio;
            while (aux != null) {
                s = aux.getElemento() +","+ s;
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Las ordenes actuales son: \n"+ s);
        } else {
                JOptionPane.showMessageDialog(null, "No hay clientes, cola vacía");
                    
        }
    }
    
}
