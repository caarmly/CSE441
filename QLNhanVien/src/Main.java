import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement manager = new EmployeeManagement();
        manager.initializeEmployees();
        manager.showEmployees();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add new employee");
            System.out.println("2. Remove an employee");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manager.addEmployee();
                    manager.showEmployees();
                    break;
                case 2:
                    manager.removeEmployee();
                    manager.showEmployees();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
