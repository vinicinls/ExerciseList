package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list,id)){
                System.out.println("Id already taken! try again");
                id = sc.nextInt();
            }
                System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id,name,salary);

            list.add(emp);

        }
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist");
        }else {
            System.out.print("Enter the percentage");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for( Employee employee : list){
            System.out.println(employee);
        }



        sc.close();
    }


    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
