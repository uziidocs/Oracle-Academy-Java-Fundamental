package modul7.seven3.vehicles;

public class no3TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + no3Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + no3Vehicle.numVehicles);

        no3Vehicle vehicle1 = new no3Vehicle("Vision");
        System.out.println(vehicle1);

        no3Vehicle vehicle2 = new no3Vehicle("Edict");
        System.out.println(vehicle2);

        vehicle2.setMake("Seer");

        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        System.out.println("Number of vehicles manufactured: " + no3Vehicle.numVehicles);
    }
}