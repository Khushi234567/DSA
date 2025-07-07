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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result = new ArrayList<>();
         Queue<TreeNode>q = new LinkedList<>();
         List<Integer>level = new ArrayList<>();
        q.add(root);
        q.add(null);

        if(root == null){
            return result;
        }
       
        while(!q.isEmpty()){
           TreeNode currNode = q.remove();
            if(currNode == null){
                 result.add(level);
                level = new ArrayList<>();
               
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                level.add(currNode.val);
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right !=null){
                    q.add(currNode.right);

            }
        }
        }
        return result; 
    }
}