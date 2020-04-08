package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] stuffs = new String[] {"yo", "my names", "joe", "and", "??", "STUFF"};
		printStringList(stuffs);
		printStringListBack(stuffs);
		printStringListOther(stuffs);
		printStringListRandom(stuffs);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStringList(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	 //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringListBack(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printStringListOther(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printStringListRandom(String[] arr) {
		String[] toPrint = arr;
		Random randy = new Random();
		for (int i = 0; i < toPrint.length; i++) {
			boolean notPrint = false;
			while (!notPrint){
				int val = randy.nextInt(toPrint.length);
				if (toPrint[val] != "-1") {
					System.out.println(toPrint[val]);
					toPrint[val] = "-1";
					notPrint = true;
				}
			}
		}
	}
	
	
}
