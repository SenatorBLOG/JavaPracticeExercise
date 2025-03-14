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
		
		while(readFile.hasNext()) {
			String line = readFile.nextLine();
			
			String[] strArr = line.split(" ");
			for(String s : strArr[]) {
				
			}
			
			int val = Integer.parseInt(line);
			double avg = val /3;
			System.out.println(avg);
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
