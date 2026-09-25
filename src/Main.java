import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner for user input
        // Ask the user to enter the price of the item
        // Check if the item price is $100 or more
        // If the price is $100 or more, shipping is free
        // Otherwise, shipping is 2% of the item price
        // Calculate the total price
        // Display the shipping cost
        // Display the total price

        Scanner in = new Scanner(System.in);

        double price = 0;
        double shipping = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();

            if (price >= 100) {
                shipping = 0;
            } else {
                shipping = price * 0.02;
            }

            total = price + shipping;

            System.out.printf("Shipping cost: $%.2f%n", shipping);
            System.out.printf("Total price: $%.2f%n", total);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid price: " + trash);
        }
    }
}