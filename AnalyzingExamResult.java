import java.util.Scanner;

public class AnalyzingExamResult {
    private int passed;

    private int failed;

    private int result;

    private int counter = 1;

    public void AnalyzeExamResult(){

        Scanner scanner = new Scanner(System.in);
        passed = 0;
        failed = 0;
        result = 0;

        counter = 1;

        while (counter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail) ");
            result = scanner.nextInt();
            if (result == 1 | result == 2) {

                if (result == 1) passed += 1;
                else failed++;
            } else {
                System.out.println("Result must be either 1 or 2");
                continue;
            }
            counter++;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passed, failed);

        if(passed > 8){
            System.out.print("Bonus to instructor!");
        }
    }
}
