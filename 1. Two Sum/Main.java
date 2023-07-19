import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("/***********************************************************************************************************************/");
		System.out.println("Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.");
		System.out.println("You may assume that each input would have exactly one solution, and you may not use the same element twice.");
		System.out.println("You can return the answer in any order.");
		System.out.println("/***********************************************************************************************************************/");
		
		System.out.print("Enter the length of nums: ");
		int[] nums = new int[scan.nextInt()];
		
		System.out.print("Enter its numbers: ");
		for (int i = 0; i < nums.length; i++){
			nums[i] = scan.nextInt();
		}
		
		System.out.print("Enter the target value: ");
		int target = scan.nextInt();
		
		int[] solution = Solution.twoSum(nums, target);
		System.out.print("The numbers that add up to the target in the array are " + solution[1] + " and " + solution[0]);
	}
}
