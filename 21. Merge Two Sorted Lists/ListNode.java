public class ListNode {
	int val;
	ListNode next;
	
	ListNode(){
	
	}
	
	ListNode(int val){ 
		this.val = val;
	}
	
	ListNode(int val, ListNode next){ 
		this.val = val;
		this.next = next; 
	}
	
	public void getListNodeValues(){
		System.out.print(val + " ");
		if(next != null){
			next.getListNodeValues();
		}
	}
}
