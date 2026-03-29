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
    static ListNode removeLeadingZero(ListNode head){
        while(head != null && head.val==0 && head.next!=null){
            head=head.next;
        }
        return head;
    }
    static ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=null;
        ListNode curr=null;
        int carray=0;
        l1=removeLeadingZero(l1);
        l2=removeLeadingZero(l2);
        l1=rev(l1);
        l2=rev(l2);
        while(l1 != null || l2 != null || carray != 0){
            int sum=carray;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            ListNode newNode=new ListNode(sum%10);
            carray=sum/10;
            if(res==null){
                res=newNode;
                curr=newNode;
            }
            else{
                curr.next=newNode;
                curr=curr.next;
            }
        }
        return rev(res);
    }
}