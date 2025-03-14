package RemoveWords;

import java.util.*;


public class RemoveWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> words = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		do {
			System.out.println("Type new word to add to the list or \"exit\" to stop.");
			System.out.println();
			
			input = scanner.nextLine();
			if(!input.equals("exit")) {
				words.add(input);
			}
			
			
			Iterator<String> it = words.iterator();
			while(it.hasNext()) {
				String word = it.next();
				System.out.println("Current list:" + word);
			}
			
		}while(it.hasNext()); 
		
		Iterator<String> it = words.iterator();
		while(it.hasNext()); 
		System.out.println("You have exited program.");
		
		
			if(input.equals(words))
				it.remove();
		
		
	}

}
