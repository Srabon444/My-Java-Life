public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Akhi! \n");
        }

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("********************************");
        //Reverse
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

//Prime Number
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
