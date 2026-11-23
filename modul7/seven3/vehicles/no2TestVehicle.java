package modul7.seven3.vehicles;

public class no2TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + no2Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + no2Vehicle.numVehicles);

        no2Vehicle vehicle1 = new no2Vehicle("Vision");
        System.out.println(vehicle1);

        no2Vehicle vehicle2 = new no2Vehicle("Edict");
        System.out.println(vehicle2);

        // a. Mengubah nilai static variable MAKE melalui instance vehicle2
        vehicle2.setMake("Seer");

        // b. Menampilkan kembali nilai vehicle1 dan vehicle2 menggunakan method toString()
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Menampilkan total akhir kendaraan yang diproduksi
        System.out.println("Number of vehicles manufactured: " + no2Vehicle.numVehicles);
    }
}