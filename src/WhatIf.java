import java.util.Scanner;

public class WhatIf {
    public static void main(String[] args) {

        //Declare variables:
        int customerNumber;
        String customerName;
        double sales;
        String taxCode;
        double total;
        Scanner in = new Scanner(System.in);

        //Prompt user and read in record
        System.out.print("Customer ID: ");
        customerNumber = in.nextInt();

        System.out.print("Customer Name: ");
        in.nextLine();
        customerName = in.nextLine();


        System.out.print("Sales Amount: $");
        sales = in.nextDouble();

        System.out.print("Tax Code: ");
        in.nextLine();
        taxCode = in.next();

        // Calculate total amount based on the tax code
        switch (taxCode) {
            case "NRM":
                total = sales * 1.06;
                break;
            case "NPF":
                total = sales;
                break;
            case "BIZ":
                total = sales * 1.045;
                break;
            default:
                total = sales;
        }

        // Output the results to the user
        System.out.printf("Total Amount Due: $%.2f" , total);
    }
}