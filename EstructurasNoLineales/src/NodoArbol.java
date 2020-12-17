public class NodoArbol {

    private int valor;
    private NodoArbol nodoIzquierdo;
    private NodoArbol nodoDerecho;

    public NodoArbol (int valor){
        this.valor = valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void insertar (int valors){
        if(valors < this.valor){
            if(nodoIzquierdo == null) this.nodoIzquierdo = new NodoArbol(valors);
            else nodoIzquierdo.insertar(valors);
        }
        else{
            if(nodoDerecho == null) this.nodoDerecho = new NodoArbol(valors);
            else this.nodoDerecho.insertar(valors);
        }
    }

}
