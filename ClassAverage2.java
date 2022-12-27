import java.util.Scanner;
public class ClassAverage2 {
    private int total;
    private  int grade;
    private double average;
    public void ClassAverage(){
        Scanner scanner =  new Scanner(System.in);
        total = 0;
        int gradeCounter = 0;

        System.out.println("Enter student a grade or - 1 to quit ");
        grade = scanner.nextInt();

        while (grade != -1) {
            total += grade;
            gradeCounter += 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = scanner.nextInt();

        }
            if (gradeCounter != 0){
                average = (double) total / gradeCounter;

                System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %.2f%n ", average);

            } else {
                System.out.println("No grades were entered");
            }
    }
}
