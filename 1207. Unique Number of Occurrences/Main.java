import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.\n\nEnter the amount of values: ");
		int amount = scan.nextInt();
		
		int[] numbers = new int[amount];
		
		for(int i = 0; i < amount; i++){
			System.out.print("Enter the " + (i + 1) + ((i == 0) ? "st" : (i == 1) ? "nd" : (i == 2) ? "rd" : "th") + " number: ");
			numbers[i] = scan.nextInt();
		}
		
		System.out.print("The number of occurrences of each value in the array is " + (Solution.uniqueOccurrences(numbers) ? "" : "not ") + "unique");
	}
}
