package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringStuffsAlso = new String[] {"I", "dont", "*sigh*", "are", "we, oh this is the last one"};
		//2. print the third element in the array
		System.out.println(stringStuffsAlso[2]);
		//3. set the third element to a different value
		stringStuffsAlso[2] = "want to do this,";
		//4. print the third element again
		System.out.println(stringStuffsAlso[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < stringStuffsAlso.length; i++) {
			stringStuffsAlso[i] = ".....";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringStuffsAlso.length; i++) {
			System.out.println(stringStuffsAlso[i]);
		}
		//7. make an array of 50 integers
		int[] oofs = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for (int i = 0; i < oofs.length; i++) {
			oofs[i] = randy.nextInt(100) + 1;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestNum = 100;
		for (int i = 0; i < oofs.length; i++) {
			if (oofs[i] < smallestNum) {
				smallestNum = oofs[i];
			}
		}
		System.out.println(smallestNum);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < oofs.length; i++) {
			System.out.println(oofs[i]);
		}
		//11. print the largest number in the array.
		int largestNum = 0;
		for (int i = 0; i < oofs.length; i++) {
			if (oofs[i] > largestNum) {
				largestNum = oofs[i];
			}
		}
		System.out.println(largestNum);
		//12. print only the last element in the array
		System.out.println(oofs[49]);
	}
}
