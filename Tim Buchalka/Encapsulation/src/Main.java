public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("G1010", "Canon", 50, false);

        System.out.println("Initial Page count = " + printer.getPagePrinted());

        int pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed " + pagesPrinted + "." + " New total print count = " + printer.getPagePrinted());


        pagesPrinted = printer.printPages(2);

        System.out.println("Pages printed " + pagesPrinted + "." + " New total print count = " + printer.getPagePrinted());

        System.out.println(printer.addToner(40));

    }
}

