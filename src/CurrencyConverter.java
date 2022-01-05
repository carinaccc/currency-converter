import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        welcomeMessage();
        getAmountAndCurrency();


    }


    static void welcomeMessage(){
        System.out.println("Welcome to Currency Converter!");

    }


    static void getAmountAndCurrency() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount: ");
        double amount = scanner.nextDouble();
        if (amount < 0.0) {
            System.out.println("Value should be a positive number. Please try again");
            amount = scanner.nextDouble();
        }
        System.out.println("Select the currency you want to change "  + amount + " MDL to: \n 1. USD" +
                "\n 2. EUR " +
                "\n 3. GBP");
        //validate here + throw exception

        int choice = scanner.nextInt();
        double exchangedAmount = 0.0;
        switch (choice) {
            case 1:
                exchangedAmount = amount * 17.2;
                System.out.println("Exchanged amount is " + String.format("%.2f", exchangedAmount) + " MDL");
                break;
            case 2:
                exchangedAmount = amount * 19.90;
                System.out.println("Exchanged amount is " + String.format("%.2f", exchangedAmount) + " MDL");
                break;
            case 3:
                exchangedAmount = amount * 25.5;
                System.out.println("Exchanged amount is " + String.format("%.2f", exchangedAmount) + " MDL");
                break;
            default:
                System.out.println("Please try once again");

        }


    }

}

