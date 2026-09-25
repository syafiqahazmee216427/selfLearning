package mart;

import java.util.Scanner;

public class ShoppingMart {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PCUTIE MART");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to buy?:");
        String item = scanner.nextLine();
        System.out.print("What is the price for each?:");
        double price = scanner.nextDouble();
        System.out.print("How many do you want?:");
        int amount = scanner.nextInt();

        double total = price*amount;

        System.out.printf("You have bought %d %s(s) for RM%.2f%n", amount, item, total);
        scanner.close();
    }
}