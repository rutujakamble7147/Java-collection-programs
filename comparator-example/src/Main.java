import java.util.*;

class Employee  {

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
}
    class EmployeeComparatorSalary implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary- o2.salary;
    }
}
    class EmployeeComparatorById implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id-o2.id;
        }
    }

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("rutuja",10,4783));
        employeeList.add(new Employee("anjali",40,6890));
        employeeList.add(new Employee("sakshi",60,5880));
        employeeList.add(new Employee("pravin",20,4190));
        employeeList.add(new Employee("pratik",16,4680));

        EmployeeComparatorSalary employeeComparatorSalary = new EmployeeComparatorSalary();
        EmployeeComparatorById employeeComparatorById = new EmployeeComparatorById();

        Collections.sort(employeeList,employeeComparatorById);
        System.out.println(employeeList);

        Collections.sort(employeeList,employeeComparatorSalary);
        System.out.println(employeeList);


    }
}