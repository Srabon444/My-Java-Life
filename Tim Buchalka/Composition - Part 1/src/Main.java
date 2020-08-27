public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240W", dimensions);

        Monitor theMonitor = new Monitor("ROG Monitor", "Asus", 27, new Resolution(1920, 1080));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "V2.54");

        PC thePC = new PC(theCase, theMonitor, motherBoard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherBoard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
