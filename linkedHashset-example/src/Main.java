import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String>booksToRead = new LinkedHashSet<>();
        booksToRead.add("Rich Dad Poor Dad");

        booksToRead.add("7 habits of highly effective people");

        booksToRead.add("Coffee can investing");

        Iterator<String> iterator = booksToRead.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(booksToRead.contains("Rich Dad Poor Dad"));

        System.out.println(booksToRead.size());

        for (Object name : booksToRead.toArray()){
            System.out.println(booksToRead.toString());
        }
    }
}