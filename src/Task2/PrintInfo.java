package Task2;

public class PrintInfo {
    private Car car;

    public void printCarInfo() {
        carInfo();
        engineInfo();
        transmissionInfo();
        wheelsInformation();
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private void carInfo() {
        System.out.println("Car information:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Colour: " + car.getColour());
        System.out.println("Price $: " + car.getPrice());
    }

    private void engineInfo() {
        System.out.println("\nEngine information:");
        System.out.println("Type: " + car.getEngineType());
        System.out.println("Capacity: " + car.getEngineCapacity());
        System.out.println("Number of cylinders: " + car.getNumCylinders());
    }

    private void transmissionInfo() {
        System.out.println("\nTransmission information:");
        System.out.println("Type: " + car.getTransmissionType());
        System.out.println("Number of gears: " + car.getTransmissionGears());
    }

    private void wheelsInformation() {
        System.out.println("\nWheels information:");
        System.out.println("Diameter: " + car.getWheels()[0].getDiameter());
        System.out.println("Width: " + car.getWheels()[0].getWidth());
        System.out.println("Type: " + car.getWheels()[0].getType());
        System.out.println("Number of wheels: " + car.getWheels()[0].getNumWheels());
    }
}
