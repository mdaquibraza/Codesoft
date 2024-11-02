import java.util.Scanner;
public class currency {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD - US Dollar");
        System.out.println("2. EUR - Euro");
        System.out.println("3. INR - Indian Rupee");
        System.out.println("4. GBP - British Pound");
        System.out.println("5. Other (enter currency code)");

        System.out.print("Choose base currency (1/2/3/4/5): ");
        int baseChoice = scanner.nextInt();
        String baseCurrency = getCurrencyCode(baseChoice);

        System.out.print("Choose target currency (1/2/3/4/5): ");
        int targetChoice = scanner.nextInt();
        String targetCurrency = getCurrencyCode(targetChoice);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        double convertedAmount = amount * exchangeRate;

        System.out.println(amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);
    }

    private static String getCurrencyCode(int choice) {
        switch (choice) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "INR";
            case 4:
                return "GBP";
            default:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter currency code: ");
                return scanner.next().toUpperCase();
        }
    }