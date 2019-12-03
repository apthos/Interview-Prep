class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n) (amount of nodes)
    Space complexity: O(1)
    */
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;

        //first prune the children to see if the root should be deleted
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        
        //only scenario a node should be deleted is if there is no possible 1 in the subtrees
        if(root.val == 0 && root.left == null && root.right == null) return null;
        return root;
    }
}