/*Maurice Hanns Jr. CSC234 09/21/2018
 * This program ask for 
 */

package learnAlgorithms;

import java.util.Scanner;

public class binaryAlg {

public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);  
	
	int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};// an array of integers decared as numbers
	
	System.out.println("Enter the key to search for: ");//prompt user for the key value
	int key = input.nextInt();  //user input saved to key 
	int numberSize = numbers.length; //saves the array size in a variable
	
	int keyIndex = searchArray(numbers, numberSize, key );
	
	//printArray(numbers, numberSize); //I can print the whole array if I choose
	
	if (keyIndex  == -1) {
		System.out.println("\nThe number " + key + " is NOT in the array."); //displays not found if key is not in array
	}
	else {
		System.out.println("The number " + key + " is at index " + keyIndex + ".");
	}
	
}//close main
		
public static int searchArray(int numbers[], int numberSize, int key) {
			
	int mid, low = 0; //values initialized to zero
	int high = numberSize - 1; 
   
	while (high >= low) {
		mid = (high + low) / 2;
		if (numbers[mid] < key) {
			low = mid + 1;
		}
		else if (numbers[mid] > key) {
			high = mid - 1;
		}
		else {
			return mid; //return index value
		}
	}

	return -1; //if the key is not found it will return a negative value  
}

public static void printArray(int numbers[], int numberSize) {
		
	for (int j = 0; j < numberSize; j++) {
			
		//displays each element in the array and which index it is located at
		System.out.println("\nThe number at index " + (j) + " is:" + numbers[j] );

	}//close print for loop
		
	return;
		
}//close printArray

}//close class
