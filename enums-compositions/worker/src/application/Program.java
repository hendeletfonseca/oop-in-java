package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        String level = scanner.nextLine();

        System.out.print("Base Salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int qtdContracts = scanner.nextInt();

        for (int i = 0; i < qtdContracts; i++){

            System.out.print("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = dateFormat.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.printf("""
                Name: %s
                Department: %s
                Income for (%d/%d): %.2f
                """, worker.getName(), worker.getDepartment().getName(), month, year, worker.income(year, month));

        scanner.close();
    }
}
