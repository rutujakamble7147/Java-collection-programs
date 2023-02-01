import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(30);
        integerQueue.add(20);
        integerQueue.add(80);
        System.out.println(integerQueue.isEmpty());
        integerQueue.add(70);

        System.out.println(integerQueue.isEmpty());

        Iterator<Integer>iterator = integerQueue.iterator();
        integerQueue.forEach(integer -> System.out.println(integer));

        System.out.println(integerQueue.size());
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());

        System.out.println(integerQueue.isEmpty());


    }
}