import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Users> pila = new Stack<>();
        Queue<Users> cola = new LinkedList<>();

        pila.add(new Users("Chris","Alameda","1562"));
        pila.add(new Users("Chris2","Alameda2","15623"));
        pila.add(new Users("Chris3","Alameda3","15622"));

        System.out.println(pila.pop().getName());
        System.out.println(pila.pop().getName());
        System.out.println(pila.pop().getName());

        if(pila.isEmpty()) System.out.println("Empty");

        cola.add(new Users("Jimmy","Centro","12346"));
        cola.add(new Users("Jimmy2","Centro2","12342"));
        cola.add(new Users("Jimmy3","Centro3","12343"));

        System.out.println(cola.peek().getName());

        cola.clear();
        pila.clear();

    }

}
