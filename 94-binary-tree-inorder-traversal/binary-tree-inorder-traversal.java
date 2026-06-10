/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void InorderT(TreeNode Node, ArrayList<Integer> res){
        if(Node==null) return ;

        InorderT(Node.left,res);
        res.add(Node.val);
        InorderT(Node.right,res);    
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        
        InorderT(root,ans);;
        return ans;
        
    }
}