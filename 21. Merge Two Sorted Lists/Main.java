import java.util.Scanner;

public class Main{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){		
		System.out.print("You are given the heads of two sorted linked lists list1 and list2.\n\nMerge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.\n\nReturn the head of the merged linked list");
		
		System.out.print("\n\nEnter the number of nodes in list1: ");
		int nNodes = scan.nextInt();
		
		System.out.print("Enter the values of list1: ");
		ListNode list1 = createListNode(nNodes);
		
		System.out.print("\n\nEnter the number of nodes in list2: ");
		nNodes = scan.nextInt();
		
		System.out.print("Enter the values of list2: ");
		ListNode list2 = createListNode(nNodes);
		
		System.out.print("The solution is: ");
		Solution.mergeTwoLists(list1, list2).getListNodeValues();
	}
	
	public static ListNode createListNode(int nNodes){
		if(nNodes > 1){
			nNodes--;
			return new ListNode(scan.nextInt(), createListNode(nNodes));
		}
		return new ListNode(scan.nextInt());
	}
}
