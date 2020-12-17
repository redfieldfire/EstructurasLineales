public class Main {

    public static void main(String[] args) {

        Arbol arbol;

        arbol = new Arbol();

        arbol.insertar(57);
        arbol.insertar(30);
        arbol.insertar(60);
        arbol.insertar(12);
        arbol.insertar(56);
        arbol.insertar(7);
        arbol.insertar(8);
        arbol.insertar(61);

        System.out.print("PreOrden "); arbol.shotPreorden();
        System.out.print("\nInOrden "); arbol.shotInOrden();
        System.out.print("\nPostOrden "); arbol.shotPostOrden();

    }

}
