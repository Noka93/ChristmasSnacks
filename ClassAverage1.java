import java.util.Scanner;

public class ClassAverage1 {
    private int total;
    private int gradeCount;
    private int studentGrade;

    private int studentAverage;

    public void ClassAverage(){
        Scanner scanner = new Scanner(System.in);

        total = 0;
        gradeCount = 1;

        while (gradeCount <= 10){
            System.out.print("Enter a student grade between 1 - 100 ");
            studentGrade = scanner.nextInt();
            total += studentGrade;
            if (studentGrade >= 100 | studentGrade < 0 ){
                System.out.println("Student grade must be between 1 and 100");
                continue;
            }
            gradeCount += 1;
        }

        studentAverage = total / 10;

        System.out.printf("Total of all grade is %d%n", total);
        System.out.printf("The class average is : %d%n ", studentAverage);
    }
}
