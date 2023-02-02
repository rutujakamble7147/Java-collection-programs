import java.util.*;
import java.util.stream.Stream;

public class Employee  {

    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && salary == employee.salary && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }




    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("rutuja",10,4783));
        list.add(new Employee("anjali",40,6890));
        list.add(new Employee("sakshi",60,5880));
        list.add(new Employee("pravin",20,4190));
        list.add(new Employee("pratik",16,4680));

        Collections.sort(list,((o1, o2) -> o1.salary- o2.salary));
        System.out.println(list);
        Collections.sort(list,((o1, o2) -> o1.id- o2.id));
        System.out.println(list);



    }

}


