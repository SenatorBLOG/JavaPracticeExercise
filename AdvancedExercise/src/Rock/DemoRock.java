package Rock;

import java.util.Scanner;

public class DemoRock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rock Sample Catalog");
        System.out.println("U - Unclassified Rock");
        System.out.println("I - Igneous Rock");
        System.out.println("S - Sedimentary Rock");
        System.out.println("M - Metamorphic Rock");
        System.out.print("Enter rock type (U/I/S/M): ");
        String choice = input.nextLine().toUpperCase();
        
        Rock rockSample;
        
        if (!choice.matches("[UISM]")) {
            // Invalid choice - create default Rock
            rockSample = new Rock(0, 0);
        } else {
            // Get sample details
            System.out.print("Enter sample number: ");
            int sampleNumber = input.nextInt();
            System.out.print("Enter weight in grams: ");
            double weight = input.nextDouble();
            
            // Create appropriate rock type
            switch (choice) {
                case "I":
                    rockSample = new IgneousRock(sampleNumber, weight);
                    break;
                case "S":
                    rockSample = new SedimentaryRock(sampleNumber, weight);
                    break;
                case "M":
                    rockSample = new MetamorphicRock(sampleNumber, weight);
                    break;
                default:  // "U"
                    rockSample = new Rock(sampleNumber, weight);
            }
        }
        
        // Display rock details
        displayRockDetails(rockSample);
        
        input.close();
    }
    
    public static void displayRockDetails(Rock rock) {
        System.out.println("\nRock Sample Details:");
        System.out.println("Type: " + rock.getDescription());
        System.out.println("Sample #: " + rock.getSampleNumber());
        System.out.println("Weight: " + rock.getWeight() + " grams");
    }
}
