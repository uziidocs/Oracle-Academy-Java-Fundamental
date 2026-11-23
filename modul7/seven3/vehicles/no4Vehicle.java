package modul7.seven3.vehicles;

public class no4Vehicle {
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables
    private String chassisNo;
    private String model;

    // Constructor superclass Vehicle
    public no4Vehicle(String model) {
        numVehicles++;
        chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // a. Mengubah deklarasi Engine agar mewarisi Vehicle
    public static class Engine extends no4Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // b & c. Constructor yang menerima String model dan meneruskannya ke super constructor
        public Engine(String model) {
            super(model);
        }

        // Public static getter
        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    // Method untuk mengubah static variable MAKE
    public void setMake(String make) {
        MAKE = make;
    }

    // Getter dan Setter untuk chassisNo
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    // Getter dan Setter untuk model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE +
               "\nThe model type is " + model +
               "\nThe chassis number is " + chassisNo +
               "\nThe engine make is " + Engine.getMake() +
               "\nThe engine capacity is " + Engine.getCapacity() + "cc";
    }
}