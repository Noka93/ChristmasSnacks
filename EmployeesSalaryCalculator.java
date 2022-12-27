import java.util.Scanner;

public class EmployeesSalaryCalculator {
    private int numberOfEmployees;

    private int numberOfHoursWorked;

    public void SalaryCalculator(){
        Scanner scanner = new Scanner(System.in);

        numberOfEmployees = scanner.nextInt();

        int counter = 1;

        while (counter <= numberOfEmployees) {

            System.out.printf("Enter the number of hours worked for Employee %d : ", counter);

            numberOfHoursWorked = scanner.nextInt();

            System.out.print("Enter hourly rate : ");

            int hourlyRate = scanner.nextInt();

            int weeklyWage = numberOfHoursWorked * hourlyRate;

            int extraHours = 0;

            if(numberOfHoursWorked > 40) extraHours = numberOfHoursWorked - 40;

            double extraHourlyRate = hourlyRate * 1.5;

            double extraWage = extraHourlyRate * extraHours;

            double totalGrossPay = extraWage + weeklyWage;

            System.out.printf("Total gross pay for employee %d = %.2f%n%n%n", counter, totalGrossPay);
            counter++;
        }

    }
}
