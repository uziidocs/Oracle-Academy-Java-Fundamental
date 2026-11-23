package modul7.seven3.vehicles;

public class no4TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + no4Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + no4Vehicle.numVehicles);

        no4Vehicle vehicle1 = new no4Vehicle("Vision");
        System.out.println(vehicle1);

        no4Vehicle vehicle2 = new no4Vehicle("Edict");
        System.out.println(vehicle2);

        vehicle2.setMake("Seer");

        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // d. Membuat objek Engine bernama vehicle3 dengan parameter "Fortune"
        no4Vehicle.Engine vehicle3 = new no4Vehicle.Engine("Fortune");

        // e. Menampilkan nomor chassis, model, dan kapasitas mesin menggunakan getter yang sesuai
        System.out.println("Vehicle number " + vehicle3.getChassisNo() +
                           " is a " + vehicle3.getModel() +
                           " model and has an engine capacity of " +
                           no4Vehicle.Engine.getCapacity() + "cc");

        // Menampilkan total akhir kendaraan yang diproduksi
        System.out.println("Number of vehicles manufactured: " + no4Vehicle.numVehicles);
    }
}