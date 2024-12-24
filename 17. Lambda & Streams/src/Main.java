import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Eric", 8));
        employees.add(new Employee(2, "Sam", 5));
        employees.add(new Employee(3, "Alice",12));
        employees.add(new Employee(4, "Melissa", 1));
        employees.add(new Employee(5, "Elijah", 24));
        employees.add(new Employee(6, "Liam", 1));
        employees.add(new Employee(7, "Enrique", 18));
        
        // int employeesYearAboveTen = 0;
        // for (Employee e : employees) {
        //     if (e.getYearsOfService()>10) {
        //         employeesYearAboveTen++;
        //     }
        // }

        long employeesYearAboveTen = employees.stream()
                    .filter(e -> e.getYearsOfService() > 10).count();
        System.out.println(employeesYearAboveTen);

        List<Employee> namesStartWithE = employees.stream()
                    .filter(e -> e.getFirstName().startsWith("E"))
                    .toList();
        namesStartWithE.forEach(n -> System.out.println(n.getFirstName()));
    }
}