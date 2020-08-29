
class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car  -> StartEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}


class Mclaren extends Car {
    public Mclaren(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mclaren  -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return "Mclaren  -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mclaren  -> brake()";
    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford  -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford  -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford  -> brake()";
    }
}

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()"; //getClass().getSimpleName() helps to know which class is running
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mclaren mclaren = new Mclaren("Mclaren 600LT", 8);
        System.out.println(mclaren.startEngine());
        System.out.println(mclaren.accelerate());
        System.out.println(mclaren.brake());

        Porsche porsche = new Porsche("Main.Porsche 911", 8);
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Ford ford = new Ford("Main.Ford GT", 8);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
}

