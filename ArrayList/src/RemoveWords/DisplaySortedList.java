package RemoveWords;
import java.util.*;

public class DisplaySortedList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Phase 1: Collect and sort words
        do {
            System.out.println("Enter a word (or 'exit' to stop):");
            input = scanner.nextLine();
            if (!input.equals("exit")) {
                words.add(input);
                Collections.sort(words);
                display(words);
            }
        } while (!input.equals("exit"));

        // Phase 2: Collect and sort numbers
        do {
            System.out.println("Enter an integer (or 'exit' to stop):");
            input = scanner.nextLine();
            if (!input.equals("exit")) {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                    Collections.sort(numbers);
                    display(numbers);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid integer. Please try again.");
                }
            }
        } while (!input.equals("exit"));

        scanner.close();
        System.out.println("Program ended.");
    }

    // Generic display method for any ArrayList
    public static <T> void display(ArrayList<T> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Sorted list:");
            for (T item : list) {
                System.out.println(item);
            }
        }
        System.out.println();
    }
}