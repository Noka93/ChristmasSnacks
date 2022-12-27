import java.util.Scanner;

public class CalculatingSales {
    private double product1Total;
    private double product2Total;
    private double product3Total;
    private double product4Total;
    private double product5Total;
    private int numberOfProducts;
    private int productNumber;
    private double totalAmount;
    public void SalesCalculation(){
        Scanner input = new Scanner(System.in);

        product1Total = 0;

        product2Total = 0;

        product3Total = 0;

        product4Total = 0;

        product5Total = 0;

        System.out.print("How many products do you want to buy? ");
        numberOfProducts = input.nextInt();

        int counter = 1;

        while(counter <= numberOfProducts) {

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
                default -> {
                    System.out.print("Invalid Product");
                    continue;
                }
            }
            counter++;
        }
        totalAmount = product1Total + product2Total + product3Total + product4Total + product5Total;

        System.out.printf("Total value of products = %.2f", totalAmount);
    }

}
