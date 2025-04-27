package Candle;

import java.util.Scanner;

public class DemoCandle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create and set up a regular Candle
        Candle regularCandle = new Candle();
        System.out.println("Enter details for the regular candle:");
        System.out.print("Color: ");
        regularCandle.setColor(input.nextLine());
        System.out.print("Height (in inches): ");
        regularCandle.setHeight(Integer.parseInt(input.nextLine()));
        
        // Create and set up a ScentedCandle
        ScentedCandle scentedCandle = new ScentedCandle();
        System.out.println("\nEnter details for the scented candle:");
        System.out.print("Color: ");
        scentedCandle.setColor(input.nextLine());
        System.out.print("Height (in inches): ");
        scentedCandle.setHeight(Integer.parseInt(input.nextLine()));
        
        // Offer scent choices
        System.out.println("\nAvailable scents:");
        System.out.println("1. Gardenia");
        System.out.println("2. Lavender");
        System.out.println("3. Vanilla");
        System.out.println("4. Pine");
        System.out.print("Enter scent choice: ");
        scentedCandle.setScent(input.nextLine());
        
        // Display both candles
        System.out.println("\nRegular Candle Details:");
        System.out.println("Color: " + regularCandle.getColor());
        System.out.println("Height: " + regularCandle.getHeight() + " inches");
        System.out.println("Price: $" + regularCandle.getPrice());
        
        System.out.println("\nScented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());
        
        input.close();
    }
}
