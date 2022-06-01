package practise;

import lists.classes.Employee;
import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(new Employee("Zac", "Jewitt", 2468));

        for(Employee employee: employeeList) {
            System.out.print(employee.getLastName() +
                    ", " + employee.getFirstName() +
                    " (" + employee.getId() + ")\n");
        }

        System.out.println("\nThere is " + employeeList.size() +
                " employee(s).");

    }
}