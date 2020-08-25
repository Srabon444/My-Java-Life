public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 7) {
            System.out.println("Count value = " + count);
            count++;
        }

        System.out.println("********************************");
        count = 1;
        do {
            System.out.println("Count value is = " + count);
            count++;
        } while (count != 6);


        System.out.println("************************************");

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
        }

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
