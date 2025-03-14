package twoDimArray;

import java.util.*;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Month birthMonth;
		birthMonth = Month.APRIL;
		String gradMonth = "APRIL";
		Month gradMon = Month.valueOf(gradMonth);
		System.out.println(gradMonth);
		
		for(Month mon : Month.values()) 
			System.out.print(mon + " ");
		System.out.println();
		
		int [] intArr2 = new int[7];
		intArr2[0] = 100;
		System.out.println(intArr2);
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(557);
		intList.add(78);
		System.out.println(intList);
		
		for(int i=0;i<intList.size();i++)
			System.out.print(intList.get(i)+" ");
		System.out.println(); 
			
		
		
		int [] intArr = new int[7];
		display(intArr);
		Arrays.fill(intArr,3);
		display(intArr);
		intArr[2]=10;
		intArr[3]=20;
		intArr[6]=34; 
		display(intArr);
		Arrays.sort(intArr);
		display(intArr);
		System.out.println("The elem is  at  index " + Arrays.binarySearch(intArr, 20));
		
		
		
		int[][] twoDimArray = {{400, 500, 700, 1200},
				{500, 600, 800, 1300},
				{600, 750, 890,1600}};
		int sum = 0;
		int count = 0;
		
		for (int floor= 0; floor<twoDimArray.length;floor++) {
			
		}
		
		System.out.println(twoDimArray[1][2]);
		for (int floor= 0; floor<twoDimArray.length;floor++) {
			for (int rooms = 0; rooms < twoDimArray[floor].length;rooms++) {
				System.out.println("$" + twoDimArray[floor][rooms] + " ");
				sum += twoDimArray[floor][rooms];
                count++; //
			}
			System.out.println();
		}
		double average = (double) sum / count;
        System.out.println("Среднее значение: $" + average);
	
				
		
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
