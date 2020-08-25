public class Main {

    public static void main(String[] args) {
        Car tesla = new Car();
        Car ford = new Car();
        tesla.setModel("Model5");
        ford.setModel("Mustang");
        System.out.println("Model is " + tesla.getModel());
        System.out.println("Model is " + ford.getModel());

    }
}
