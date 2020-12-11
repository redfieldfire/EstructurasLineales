public class ListaEnlazada {

    Nodo inicio;

    public ListaEnlazada(){
        inicio = null;
    }

    public void insertar(Cancion cancion){

        Nodo nuevoNodo = new Nodo(cancion);

        if(this.inicio == null){
            this.inicio = nuevoNodo;
        }
        else{
            Nodo nodoActual = inicio.getSiguiente();

            if(nodoActual == null){

                inicio.setSiguiente(nuevoNodo);

            }
            else{
                while (nodoActual.getSiguiente() != null){
                    nodoActual = nodoActual.getSiguiente();
                }
                nodoActual.setSiguiente(nuevoNodo);
            }

        }

    }//public insert

    public void imprimir(){

        Nodo nodoActual = inicio;

        while (nodoActual != null){

            System.out.print(nodoActual.getCancion().getName() + " ");
            System.out.print(nodoActual.getCancion().getDuration() + " ");
            System.out.println(nodoActual.getCancion().getRute());

            nodoActual = nodoActual.getSiguiente();

        }

    }

}//class
