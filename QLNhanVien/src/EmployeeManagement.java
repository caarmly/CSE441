import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeeManagement {
    private ArrayList<Employee> employees;
    private Scanner scanner;

    public EmployeeManagement() {
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void initializeEmployees() {
        String[] names = {"John", "Alice", "Bob", "Emily", "David", "Sophia", "James", "Emma", "Michael", "Olivia"};
        String[] departments = {"HR", "Marketing", "Finance", "HR", "Engineering", "Marketing", "Finance", "Engineering", "HR", "Marketing"};
        double[] salaryRates = {2000, 2200, 2500, 2100, 3000, 2300, 2700, 3100, 2200, 2400};

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int id = i + 1;
            String name = names[i];
            int age = rand.nextInt(20) + 25; // age between 25 and 44
            String department = departments[i];
            String code = "E00" + rand.nextInt(5);

            double salaryRate = salaryRates[i];

            employees.add(new Employee(id, name, age, department, code, salaryRate));
        }
    }

    public void showEmployees() {
        System.out.println("\nEmployee List:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void addEmployee() {
        System.out.println("Enter employee details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();

        employees.add(new Employee(id, name, age, department, code, salaryRate));
        System.out.println("Employee added successfully.");
    }

    public void removeEmployee() {
        System.out.print("Enter ID of employee to remove: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
