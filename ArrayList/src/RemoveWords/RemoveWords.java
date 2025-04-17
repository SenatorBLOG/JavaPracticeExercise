package RemoveWords;

import java.util.*;

public class RemoveWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Phase 1: Add words until sentinel value
        do {
            System.out.println("Enter a word to add (or 'exit' to stop):");
            input = scanner.nextLine();
            if (!input.equals("exit")) {
                words.add(input);
            }
        } while (!input.equals("exit"));

        // Display all words using iterator
        if (!words.isEmpty()) {
            System.out.println("\nCurrent list:");
            Iterator<String> it = words.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        } else {
            System.out.println("\nThe list is empty.");
        }

        // Phase 2: Remove words until sentinel value or list is empty
        while (!words.isEmpty()) {
            System.out.println("\nEnter a word to remove (or 'exit' to stop):");
            input = scanner.nextLine();
            
            if (input.equals("exit")) {
                break;
            }

            // Try to remove the word using iterator
            boolean found = false;
            Iterator<String> it = words.iterator();
            while (it.hasNext()) {
                if (it.next().equals(input)) {
                    it.remove();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Word '" + input + "' not found in the list.");
            }

            // Display updated list
            if (!words.isEmpty()) {
                System.out.println("\nCurrent list:");
                it = words.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
            } else {
                System.out.println("\nThe list is now empty.");
                break;
            }
        }

        if (words.isEmpty()) {
            System.out.println("No more words to remove. Program ended.");
        } else {
            System.out.println("Program ended.");
        }

        scanner.close();
    }
}