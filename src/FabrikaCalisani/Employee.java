package FabrikaCalisani;

import java.time.Year;

import java.time.Year;

import java.time.LocalDate;

import java.util.Scanner;
import java.time.Year;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double totalSalary = salary + bonus() - tax() + raiseSalary();
        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n" +
                "Toplam Maaş: " + (totalSalary + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanın adı ve soyadı: ");
        String name = scanner.nextLine();

        System.out.println("Çalışanın maaşı: ");
        double salary = scanner.nextDouble();

        System.out.println("Haftalık çalışma saati: ");
        int workHours = scanner.nextInt();

        System.out.println("İşe başlangıç yılı: ");
        int hireYear = scanner.nextInt();

        Employee emp = new Employee(name, salary, workHours, hireYear);
        System.out.println(emp);

        scanner.close();
    }
}














