package modul7.seven3.vehicles;

public class no1Vehicle {
    // Static variables (dimiliki oleh class, dibagi bersama semua objek)
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables (dimiliki secara unik oleh masing-masing objek)
    private String chassisNo;
    private String model;

    // Constructor dengan satu formal parameter String model
    public no1Vehicle(String model) {
        numVehicles++;
        chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
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

    // Method toString() untuk menampilkan make, model, dan nomor chassis dalam baris terpisah
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE +
               "\nThe model type is " + model +
               "\nThe chassis number is " + chassisNo;
    }
}