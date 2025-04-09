package VehicleInsurance;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManagerApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     ArrayList<Car> cars = new ArrayList<>();

     System.out.println("Vehicle Manager Application");
     System.out.println("---------------------------");

     while (true) {
         System.out.println("\nWould you lie to add a car? (yes/no)");
         String response = scanner.nextLine().toLowerCase();
         
         if (!response.equals("yes")) {
             break;
         }

         System.out.print("Enter make: ");
         String make = scanner.nextLine();

         System.out.print("Enter model: ");
         String model = scanner.nextLine();

         System.out.print("Enter year: ");
         int year = Integer.parseInt(scanner.nextLine());

         System.out.print("Enter price: ");
         double price = Double.parseDouble(scanner.nextLine());

         System.out.print("Enter number of doors: ");
         int doors = Integer.parseInt(scanner.nextLine());

         System.out.print("Enter insurance provider: ");
         String provider = scanner.nextLine();

         Car car = new Car(make, model, year, price, doors);
         car.setInsuranceProvider(provider);
         cars.add(car);
     }

     
     System.out.println("\nAll Vehicles in the System:");
     System.out.println("---------------------------");
     for (int i = 0; i < cars.size(); i++) {
         System.out.println("\nVehicle " + (i + 1) + ":");
         cars.get(i).displayDetails();
     }

     scanner.close();
 }
}