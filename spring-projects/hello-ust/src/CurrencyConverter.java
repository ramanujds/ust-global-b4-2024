import java.util.Scanner;

public class CurrencyConverter {

    static float convert(float rate, float amount){
        return amount*rate;
    }

    public static void main(String[] args) {
        System.out.println("""
                Welcome to the Currency Converter!
                Supported currencies:
                1. USD (US Dollar)
                2. EUR (Euro)
                3. INR
                """);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the source currency : ");
        int source = scanner.nextInt();
        System.out.println("Enter the amount you want to convert:");
        float amount = scanner.nextFloat();
        System.out.print("Select the target currency : ");
        int target = scanner.nextInt();

        float amountInUSD = switch (source){
            case 1 -> amount;
            case 2 -> convert(1.11f,amount);
            case 3 -> convert(0.012f,amount);
            default -> throw new IllegalArgumentException("Invalid Input "+source);
        };

        float finalAmount = switch (target){
            case 1 -> amountInUSD;
            case 2 -> convert(0.9f,amountInUSD);
            case 3 -> convert(83.7f,amountInUSD);
            default -> throw new IllegalArgumentException("Invalid Input "+source);
        };

        System.out.println(amount + " : "+finalAmount);

        }


        }







