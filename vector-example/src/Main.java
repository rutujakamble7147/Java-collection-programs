import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(10);
        integerVector.add(20);
        integerVector.add(40);

        System.out.println(integerVector.size());
        System.out.println(integerVector.get(0));

        Iterator<Integer> iterator = integerVector.iterator();
        integerVector.forEach(name-> System.out.println(name));

        System.out.println(integerVector.hashCode());

        System.out.println(integerVector.contains(1));

        System.out.println(integerVector.size());

        System.out.println(integerVector.isEmpty());

        System.out.println(integerVector.remove(2));
    }
}