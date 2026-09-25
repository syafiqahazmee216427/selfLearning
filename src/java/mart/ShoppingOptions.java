package mart;

import java.util.Scanner;

public class ShoppingOptions {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PCUTIE MART");

        Scanner scanner = new Scanner(System.in);

        double grandTotal = 0.0;
        String choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. A Box of Pizza - RM 10.50");
            System.out.println("2. Milk - RM 3.50");
            System.out.println("3. A Loaf of Bread - RM 2.00");
            System.out.println("4. Canned Beans - RM 3.00");
            System.out.println("5. A Packet of Sweets - RM 4.20");

            System.out.print("What do you want to buy? (1-5): ");
            int item = scanner.nextInt();
            System.out.print("How many do you want?: ");
            int amount = scanner.nextInt();

            double price = 0.0;
            switch (item) {
                case 1: price = 10.50; break;
                case 2: price = 3.50; break;
                case 3: price = 2.00; break;
                case 4: price = 3.00; break;
                case 5: price = 4.20; break;
                default:
                    System.out.println("Invalid item choice!");
            }

            double currentCost = price * amount;
            grandTotal += currentCost;

            // if user wants to buy more
            System.out.print("Do you want to buy more? (Y/N): ");
            choice = scanner.next();

        } while (choice.equals("Y"));

        System.out.printf("\nYour final total is: RM %.2f%n", grandTotal);
        System.out.println("Thank you for shopping with us!");

        scanner.close();
    }
}
