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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev=head;
        ListNode curr=head.next;
        int i=1;
        int prev_cri_pos=0;
        int fir_cri_pos=0;

        int mindis=Integer.MAX_VALUE;



        while(curr.next!=null){
           
            if ((curr.val < prev.val && curr.val < curr.next.val) || (curr.val > prev.val && curr.val > curr.next.val)) {


                if(prev_cri_pos == 0){
                    prev_cri_pos=i;
                    fir_cri_pos=i;
                }
                else{
                    mindis = Math.min(mindis,i-prev_cri_pos);

                    prev_cri_pos = i;
                }
                
            }
            i++;
            prev=curr;
            curr=curr.next;
        }
        if(mindis == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }



       return new int[] {mindis,prev_cri_pos - fir_cri_pos};

    }
}