import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.insertar(new Cancion("Remix","/rola.mp4",45));
        listaEnlazada.insertar(new Cancion("Remix2","/rola.mp4",45));
        listaEnlazada.insertar(new Cancion("Remix3","/rola.mp4",45));
        listaEnlazada.imprimir();

        LinkedList<Cancion> linkedList = new LinkedList<>();
        linkedList.add(new Cancion("rola1","aqui",123));
        linkedList.add(new Cancion("rola2","aqui",123));
        linkedList.add(new Cancion("rola3","aqui",123));

        for(int x = 0 ; x < linkedList.size() ; x++) System.out.println(linkedList.get(x).getName());
    }

}
