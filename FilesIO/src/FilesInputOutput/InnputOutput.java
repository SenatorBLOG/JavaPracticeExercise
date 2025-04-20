package FilesInputOutput;
import java.io.*;
import java.util.*;

public class InnputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		writetoAFile();
//		readFromFile();
		readFromFile2();
		
		
		
	}
	public static void readFromFile2() throws FileNotFoundException {
        File file = new File("Values.txt");
        Scanner readFile = new Scanner(file);
        
        while (readFile.hasNext()) {
            String line = readFile.nextLine();
            String[] strArr = line.split(" ");
            
            int sum = 0;
            int count = 0;
            
            // Parse integers and calculate the sum
            for (String s : strArr) {
                try {
                    int val = Integer.parseInt(s); // Parse each value to integer
                    sum += val;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + s);
                }
            }
            
            if (count > 0) {
                double avg = (double) sum / count; // Calculate the average
                System.out.println("Average: " + avg);
            }
        }
        readFile.close();
    }

		
	
	public static void readFromFile() throws FileNotFoundException {
		File file = new File("StudentInfo.txt");
		Scanner readFile = new Scanner(file);
		
		String str;
		String[] strArr;
		while(readFile.hasNext()) {
			str = readFile.nextLine();
			strArr = str.split(" ");
			
			System.out.println(readFile.nextLine());
		}
		
		while(readFile.hasNext()) {
			System.out.println(readFile.nextLine());
		}
		readFile.close();
	}
	public static void writetoAFile() throws IOException {
		FileWriter fw = new FileWriter("StudentInfo.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		
		Student stud1 = new Student(123,"Los");
		pw.println(stud1);
		System.out.println(stud1.toString());
		
//		pw.print("SamaA");
//		pw.print(" 343434\n");
//		pw.println("DavaA 4545");
//		pw.println("Losea 1233");
		System.out.println("Data has saved.");
		pw.close();
	}

}
