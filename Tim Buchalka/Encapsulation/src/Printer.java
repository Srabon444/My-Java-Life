public class Printer {
    private String model;
    private String manufacturer;
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(String model, String manufacturer, int tonerLevel, boolean duplex) {
        this.model = model;
        this.manufacturer = manufacturer;
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
        System.out.println("Model: " + this.model + " Manufacturer: " + manufacturer);
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagesPrinted;
    }
}
