package application;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        System.out.println("test");

        Employee employee1 = new Employee("Esme", "Price", 18);
        Employee employee2 = new Employee("Gideon", "Ramsey", 22);
        Employee employee3 = new Employee("Conner", "Devine", 17);
        Employee employee4 = new Employee("Aryaan", "Mcfarland", 35);
        Employee employee5 = new Employee("Emmanuel", "Hines", 30);

        Streamz.employeeList.add(employee1);
        Streamz.employeeList.add(employee2);
        Streamz.employeeList.add(employee3);
        Streamz.employeeList.add(employee4);
        Streamz.employeeList.add(employee5);

        System.out.println(Streamz.employeeList.toString());

        List<Employee> filteredList = Streamz.employeeList.stream()
                .filter(employee -> employee.getAge()>30)
                .collect(Collectors.toList());

        System.out.println(filteredList.toString());

    }


}
