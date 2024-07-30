package carrent;

public class CARRENTAL {
    
    // Class Members
    private int carId;
    private String carType;
    private float rent;

    // Constructor
    public CARRENTAL(int carId, String carType) {
        this.carId = carId;
        this.carType = carType;
        this.rent = calculateRent(carType);
    }

    // Method to accept CarId and CarType
    public void getCar() {
        System.out.println("Car Id: " + carId);
        System.out.println("Car Type: " + carType);
    }

    // Method to return rent based on car type
    public float getRent() {
        return rent;
    }

    // Private method to calculate rent based on car type
    private float calculateRent(String carType) {
        switch (carType) {
            case "Small Car":
                return 1000;
            case "Van":
                return 800;
            case "SUV":
                return 2500;
            default:
                return 0;
        }
    }

    // Method to display car details
    public void showCar() {
        System.out.println("Car ID: " + carId);
        System.out.println("Car Type: " + carType);
        System.out.println("Rent: " + rent);
    }

    // Main method to test the class
    public static void main(String[] args) {
    	CARRENTAL car1 = new CARRENTAL(1, "Small Car");
        car1.showCar();

        CARRENTAL car2 = new CARRENTAL(2, "SUV");
        car2.showCar();

        CARRENTAL car3 = new CARRENTAL(3, "Van");
        car3.showCar();
    }
}
