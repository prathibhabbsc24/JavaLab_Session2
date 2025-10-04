// File: EmployeeInfo.java

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept employee info
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Process command-line arguments for batch update
        if (args.length > 0) {
            for (String arg : args) {
                if (arg.equalsIgnoreCase("INCREMENT")) {
                    salary += salary * 0.10;  // 10% increment
                } else if (arg.equalsIgnoreCase("HR")) {
                    dept = "HR";             // change department
                }
            }
        }

        // Output final info
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID        : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + dept);
        System.out.println("Salary    : " + salary);
    }
}
