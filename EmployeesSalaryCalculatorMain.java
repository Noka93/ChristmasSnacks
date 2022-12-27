import java.util.Scanner;

public class EmployeesSalaryCalculatorMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeesSalaryCalculator employeesSalaryCalculator = new EmployeesSalaryCalculator();

        System.out.print("Welcome to Remmy's Gross Pay Calculator \n\n" +
                "How many Employee's Gross Pay would you like to Calculate?");

        employeesSalaryCalculator.SalaryCalculator();


    }
}
