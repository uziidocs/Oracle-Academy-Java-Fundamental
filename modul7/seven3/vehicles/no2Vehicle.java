package modul7.seven3.vehicles;

public class no2Vehicle {
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables
    private String chassisNo;
    private String model;

    // Constructor
    public no2Vehicle(String model) {
        numVehicles++;
        chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
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
               "\nThe chassis number is " + chassisNo;
    }
}