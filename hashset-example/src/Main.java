import javax.management.ObjectName;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> booksToRead = new HashSet<>();
        booksToRead.add("Rich Dad Poor Dad");

        booksToRead.add("7 habits of highly effective people");

        booksToRead.add("Coffee can investing");

        Iterator<String> iterator = booksToRead.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object name : booksToRead.toArray()){
            System.out.println(booksToRead.toString());
        }

        System.out.println(booksToRead.size());

        System.out.println(booksToRead.contains("Coffee can investing"));

        booksToRead.forEach(name-> System.out.println(name));

        System.out.println(booksToRead.addAll(booksToRead));

        System.out.println(booksToRead.remove("Coffee can investing"));


    }

}