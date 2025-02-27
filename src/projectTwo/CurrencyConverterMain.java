package projectTwo;

import java.util.Scanner;

public class CurrencyConverterMain {

    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\nCurrency Converter");
            System.out.println("Enter source currency (e.g,USD): ");
            String fromCurrency = scan.next().toUpperCase();

            System.out.println("Enter source currency (e.g,INR): ");
            String toCurrency = scan.next().toUpperCase();

            System.out.println("Enter the amount to convert: ");
            double amount = scan.nextDouble();

            try{
                double convertdAmount = converter.convert(fromCurrency,toCurrency,amount);
                System.out.printf("Converted amount: %.2f %s\n", convertdAmount, toCurrency);

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Do you want to perform another conversation? (yes/no)");
            String choice = scan.next();

            if(!choice.equalsIgnoreCase("yes")){
                System.out.println("Exiting.....");
                break;
            }

        }
    }
}
