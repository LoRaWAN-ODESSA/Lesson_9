package Task2;

public class Car {
    private String model;
    private int year;
    private String colour;
    private double price;
    private Engine engine;
    private Transmission transmission;

    private Wheel[] wheels;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getEngineType() {
        return engine.getType();
    }

    public int getNumCylinders() {
        return engine.getNumCylinders();
    }

    public double getEngineCapacity() {
        return engine.getCapacity();
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getTransmissionType() {
        return transmission.getType();
    }

    public int getTransmissionGears() {
        return transmission.getNumGears();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWheels(Wheel wheel) {
        wheels = new Wheel[wheel.getNumWheels()];
        for (int i = 0; i < wheel.getNumWheels(); i++) {
            Wheel numWheel = new Wheel();
            numWheel.setDiameter(wheel.getDiameter());
            numWheel.setWidth(wheel.getWidth());
            numWheel.setType(wheel.getType());
            numWheel.setNumWheels(wheel.getNumWheels());
            wheels[i] = numWheel;
        }
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
