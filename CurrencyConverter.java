import java.util.Scanner;

public class CurrencyConverter {
    // Conversion rates from USD to other currencies
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_GBP = 0.75;
    private static final double USD_TO_JPY = 110.25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("Supported Currencies:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. GBP (British Pound)");
        System.out.println("3. JPY (Japanese Yen)");

        System.out.print("Enter the amount in USD: ");
        double amountUSD = scanner.nextDouble();

        System.out.print("Enter the currency to convert to (EUR, GBP, JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amountUSD, targetCurrency);
        if (convertedAmount != -1) {
            System.out.printf("%.2f USD is %.2f %s\n", amountUSD, convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid target currency.");
        }

        scanner.close();
    }

    public static double convertCurrency(double amountUSD, String targetCurrency) {
        double convertedAmount = -1; // Default value for invalid target currency

        switch (targetCurrency) {
            case "EUR":
                convertedAmount = amountUSD * USD_TO_EUR;
                break;
            case "GBP":
                convertedAmount = amountUSD * USD_TO_GBP;
                break;
            case "JPY":
                convertedAmount = amountUSD * USD_TO_JPY;
                break;
        }

        return convertedAmount;
    }
}
