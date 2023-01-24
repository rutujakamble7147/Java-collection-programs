import javax.lang.model.element.Name;
import javax.xml.namespace.QName;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> guestList = new LinkedList<>();
        guestList.add("rutuja");
        guestList.add("sakshi");
        guestList.add("anjali");

       guestList.forEach(name -> System.out.println(name));
        System.out.println("second element : " + guestList.get(1));
        System.out.println("removing first element :"+ guestList.remove(2));

        List<String> newGuestList = new LinkedList<>();
        newGuestList.add("pravin");
        newGuestList.add("vicky");
        newGuestList.add("pratik");

        guestList.addAll(newGuestList);
        System.out.println("list before sorting : ");
        guestList.forEach(name -> System.out.println(name));
        Collections.sort(guestList);
        System.out.println("list after sorting");
        guestList.forEach(name -> System.out.println(name));

        List immutableList = List.of(newGuestList);


    }
}