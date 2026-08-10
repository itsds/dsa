/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null) return list2;
		if(list2 == null) return list1;
        ListNode mergelist=new ListNode();

        ListNode returnList=new ListNode();
        returnList=mergelist;

        while (list1!=null && list2!=null){
            if(list1.val <= list2.val){
                ListNode ln1 = new ListNode(list1.val);
                mergelist.next=ln1;
                mergelist=mergelist.next;
                list1=list1.next;
            }
            else if(list1.val > list2.val){
                ListNode ln2 = new ListNode(list2.val);
                mergelist.next=ln2;
                mergelist=mergelist.next;
                list2=list2.next;
                 
            }

        }
        if(list1==null)
            mergelist.next=list2;

        if(list2==null)
            mergelist.next=list1;


        return returnList.next;
    }
}