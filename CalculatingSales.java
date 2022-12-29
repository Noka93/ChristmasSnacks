import java.util.Scanner;

public class CalculatingSales {
    private double product1Total = 0;
    private double product2Total = 0;
    private double product3Total = 0;
    private double product4Total = 0;
    private double product5Total = 0;
    private int productNumber;
    private double totalAmount;
    public void SalesCalculation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Products between 1 - 5; Enter -1 to terminate purchase");

        int counter = 1;

        while(productNumber != -1) {
            System.out.printf("Enter Product %d number ", counter);
            productNumber = input.nextInt();

            System.out.println("Enter Quantity");
            int qty = input.nextInt();

            switch (productNumber) {
                case 1 -> product1Total = 2.8 * qty;
                case 2 -> product2Total = 4.50 * qty;
                case 3 -> product3Total = 9.98 * qty;
                case 4 -> product4Total = 4.49 * qty;
                case 5 -> product5Total = 6.87 * qty;
                default ->
                    System.out.println("You have successfully ended your purchase");
            }
            counter++;
        }
        totalAmount = product1Total + product2Total + product3Total + product4Total + product5Total;

        System.out.printf("Total value of products = %.2f", totalAmount);
    }

}
