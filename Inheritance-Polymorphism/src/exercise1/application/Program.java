package exercise1.application;

import exercise1.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd_employees = sc.nextInt();
        Employee[] employees = new Employee[qtd_employees];

        for (int i = 0; i < qtd_employees; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees[i] = new exercise1.entities.OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else {
                employees[i] = new Employee(name, hours, valuePerHour);
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
