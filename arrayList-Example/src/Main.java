import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();
        guestList.add("rutuja");
        guestList.add("anjali");
        guestList.add("sakshi");
        guestList.add("kiran");

        guestList.forEach(name-> System.out.println( name));
        System.out.println("print second element : " + guestList.get(1));
        System.out.println("remove third element : " + guestList.remove(2));

        Stream<String> stringStream = guestList.stream();

        System.out.println("After filter the elements are :");
        stringStream.filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));



        }
    }
