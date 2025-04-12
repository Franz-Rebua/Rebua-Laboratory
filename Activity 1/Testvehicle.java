import java.util.Scanner;
public class Testvehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Car:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();
        System.out.print("Speed (km/h): ");
        int carSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type: ");
        String carFuelType = sc.nextLine();
        System.out.print("Number of Doors: ");
        int numDoors = sc.nextInt();

        car car = new car(carBrand, carSpeed, carFuelType, numDoors);
        System.out.println("\nCar Details:");
        car.displayInfo();

         System.out.println("\nEnter details for Motorcycle:");
        System.out.print("Brand: ");
        String motorcycleBrand = sc.nextLine();
        System.out.print("Speed (km/h): ");
        int motorcycleSpeed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = sc.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = sc.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();
        sc.close();
}
}
