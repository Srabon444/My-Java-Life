public class Main {

    public static void main(String[] args) {


        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 3, 2, 1, 2);

        Lamp lamp = new Lamp("classic", false, 76);

        BedRoom bedRoom = new BedRoom("Akhis", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }

}
