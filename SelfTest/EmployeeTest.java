package SelfTest;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Mrs Shaheen", 101, 145);
        ArrayList<String> employees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + " $" + employee.getSalary());
        System.out.println("\n");
        while (choice != 4) {
            System.out.println("Employee management: ");
            System.out.println("1. Employee added : ");
            System.out.println("2. Employee remove by index: ");
            System.out.println("3. Employee management display: ");
            System.out.println("4. Exit: ");
            System.out.println("Enter your choice : ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Add an employee: ");
                String name = input.nextLine();
                employees.add(name);
                System.out.println("Employee added ");
            } else if (choice == 2) {
                System.out.println("Enter the index of the employee to remove: ");
                int indexOfRemove = input.nextInt();
                if (indexOfRemove >= 0 && indexOfRemove < employees.size()) {
                    employees.remove(indexOfRemove);
                    System.out.println("Employee removed ");
                } else {
                    System.out.println("Invalid input ");
                }
            } else if (choice == 3) {
                System.out.println("Employee display: " + employees);
            } else if (choice == 4) {
                System.out.println("Exiting......... ");
            } else {
                System.out.println("Invalid choice ");
            }
        }
        input.close();
    }
}
