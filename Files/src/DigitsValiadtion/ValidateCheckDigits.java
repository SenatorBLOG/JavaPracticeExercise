package DigitsValiadtion;
import java.io.*;
public class ValidateCheckDigits {
    public static void main(String[] args) {
        String inputFile = "valid_accounts.txt";
        String outputFile = "ValidAccountNumbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.matches("\\d{6}")) {
                    int sum = 0;
                    for (int i = 0; i < 5; i++) {
                        sum += Character.getNumericValue(line.charAt(i));
                    }
                    int lastDigit = Character.getNumericValue(line.charAt(5));
                    int checkDigit = sum % 10;

                    if (lastDigit == checkDigit) {
                        System.out.println(line + " is VALID ");
                        writer.write(line);
                        writer.newLine();
                    } else {
                        System.out.println(line + " is INVALID ");
                    }
                } else {
                    System.out.println(line + " is not a 6-digit number ");
                }
            }

            System.out.println("\nValidation complete. Valid accounts saved to: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
