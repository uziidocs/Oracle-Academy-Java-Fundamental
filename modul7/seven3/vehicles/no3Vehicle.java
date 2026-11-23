package modul7.seven3.vehicles;

public class no3Vehicle {
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables
    private String chassisNo;
    private String model;

    // Constructor
    public no3Vehicle(String model) {
        numVehicles++;
        chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // b. Nested static class Engine di bawah constructor
    public static class Engine {
        // c & d. Dua private static final variable dengan nilai tetap
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // e. Tidak ada constructor di dalam class Engine

        // f. Dua public static getter untuk MAKE dan CAPACITY
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

    // g. Memperbarui toString() untuk menampilkan make dan capacity mesin dari static class Engine
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE +
               "\nThe model type is " + model +
               "\nThe chassis number is " + chassisNo +
               "\nThe engine make is " + Engine.getMake() +
               "\nThe engine capacity is " + Engine.getCapacity() + "cc";
    }
}