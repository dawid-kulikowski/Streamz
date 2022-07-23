package application;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {
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

        List<String> filteredList = Streamz.employeeList.stream()
                .map(employee -> employee.getFirstName().concat(" Hi"))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(filteredList.toString());


        //Reverse String
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String reversed = new StringBuilder(alphabet).reverse().toString();
        System.out.println(reversed);

        //InputStream, InputStreamReader, BufferedReader
        InputStream inputStream = new FileInputStream("/Users/dawidkulikowski/Downloads/Streamz/src/main/java/application/index.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }


    }





}
