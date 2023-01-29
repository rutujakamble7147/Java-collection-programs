import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Long> phoneBook = new HashMap<>();
        phoneBook.put("rutuja",12345L);
        phoneBook.put("anjali",23456L);
        phoneBook.put("sakshi",45678L);

      Iterator<String> iterator = phoneBook.keySet().iterator();

      while (iterator.hasNext()) {
          String name = iterator.next();
          if (name.equals("anjali"));
          phoneBook.remove("sakshi");
      }
        System.out.println(iterator.next());

    }

}