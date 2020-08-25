public class Main {

    public static void main(String[] args) {

        int switchValue = 4;


        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually the value was " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charSwitchValue = 'C';
        switch (charSwitchValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value was B or, C, or D, or 'E");
                System.out.println("Actually the value was " + charSwitchValue);
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "dEcEMBEr";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            case "december":
                System.out.println("Dec");
                break;
        }

    }
}
