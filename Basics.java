record Employee(String name,String department){}

/**
 * Example using Records-Java 14
 * @author ashish
 */
public class Basics {
    public static void main(String[] args) {
        Employee employee=new Employee("Robin","Engginering");
        System.out.println(employee.name());
        System.out.println(employee.department());
    }
}
