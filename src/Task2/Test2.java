package Task2;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Mazda 2");
        car1.setYear(2007);
        car1.setColour("Red");
        car1.setPrice(4000.0);

        Engine engine = new Engine();
        engine.setType("Diesel");
        engine.setCapacity(1.6);
        engine.setNumCylinders(3);
        car1.setEngine(engine);

        Transmission transmission = new Transmission();
        transmission.setType("Automatic");
        transmission.setNumGears(6);
        car1.setTransmission(transmission);

        Wheel wheel = new Wheel();
        wheel.setDiameter(19.0);
        wheel.setNumWheels(5);
        wheel.setWidth(225.0);
        wheel.setType("Summer");
        car1.setWheels(wheel);

        PrintInfo info = new PrintInfo();
        info.setCar(car1);
        info.printCarInfo();
    }
}
