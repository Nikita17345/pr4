import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;

    private List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void add(Employee e){
        this.subordinates.add(e);
    }

    public void remove(Employee e){
        this.subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public static void printHierarchyTree(Employee root, int level) {
        for (int i = 0; i < level; i++)
            System.out.print('\t');
        System.out.println(root.name);
        List<Employee> subs = root.subordinates;
        for(Employee em : subs)
            printHierarchyTree(em, level + 1);
    }

    @Override
    public String toString() {
        String output = "\nEmployee{\n"
                + "\tname='" + this.name + '\''
                + ", dept='" + this.dept + '\''
                + ", salary=" + this.salary
                + "\n}";
        return output;
    }
}
