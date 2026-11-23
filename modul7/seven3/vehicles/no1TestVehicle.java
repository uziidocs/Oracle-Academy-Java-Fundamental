package modul7.seven3.vehicles;

public class no1TestVehicle {
    public static void main(String[] args) {
        // Mengakses static variable langsung melalui nama class sebelum ada objek dibuat
        System.out.println("Manufacturer: " + no1Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + no1Vehicle.numVehicles);

        // Membuat objek pertama (vehicle1) dengan model "Vision"
        no1Vehicle vehicle1 = new no1Vehicle("Vision");
        System.out.println(vehicle1);

        // Membuat objek kedua (vehicle2) dengan model "Edict"
        no1Vehicle vehicle2 = new no1Vehicle("Edict");
        System.out.println(vehicle2);

        // Menampilkan total akhir kendaraan yang diproduksi
        System.out.println("Number of vehicles manufactured: " + no1Vehicle.numVehicles);
    }
}