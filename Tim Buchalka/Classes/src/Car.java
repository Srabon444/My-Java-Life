public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("model5") || validModel.equals("mustang")) {
            this.model = model;
        } else {
            System.out.println("Unknown Model");
        }
    }
    public String getModel() {
        return this.model;
    }
}
