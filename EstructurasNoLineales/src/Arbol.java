public class Arbol {

    NodoArbol inicial;

    public Arbol(){
        this.inicial = null;
    }

    public void insertar(int valor){

        if(inicial == null) this.inicial = new NodoArbol(valor);
        else this.inicial.insertar(valor);

    }

    public void shotPreorden(){
            this.preorden(inicial);
    }

    public void preorden(NodoArbol nodo){
        if(nodo == null) return; // fin, no hay hojas
        else{
            System.out.print(nodo.getValor() + " ");
            preorden(nodo.getNodoIzquierdo());
            preorden(nodo.getNodoDerecho());
        }
    }

    public void shotInOrden(){
        this.inOrden(inicial);
    }

    public void inOrden(NodoArbol nodo){
        if(nodo == null) return; // fin, no hay hojas
        else{
            inOrden(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor() + " ");
            inOrden(nodo.getNodoDerecho());
        }
    }

    public void shotPostOrden(){
        this.postOrden(inicial);
    }

    public void postOrden(NodoArbol nodo){
        if(nodo == null) return; // fin, no hay hojas
        else{
            postOrden(nodo.getNodoIzquierdo());
            postOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor() + " ");
        }
    }

}
