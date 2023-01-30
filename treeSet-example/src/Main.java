import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> booksToRead = new TreeSet<>();
        booksToRead.add("Rich Dad Poor Dad");

        booksToRead.add("7 habits of highly effective people");

        booksToRead.add("Coffee can investing");

        Iterator<String> iterator = booksToRead.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object name : booksToRead.toArray()){
            System.out.println(name.toString());
        }
        System.out.println(booksToRead.contains("7 habits of highly effective people"));

        System.out.println(booksToRead.size());
    }
}