class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                return new ListNode(list1.val, mergeTwoLists(list2, list1.next));
            } return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        } else if(list1 == null && list2 != null){
            return new ListNode(list2.val, list2.next);
        } else if(list1 != null && list2 == null){
            return new ListNode(list1.val, list1.next);
        } return null;
    }
}
