/**
 *
 * @author EMERSON
 */
public class Nodo {
    
    private int elemento;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente=null;
    }

    /**
     * @return the elemento
     */
    public int getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(int  elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
