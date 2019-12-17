class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity:
    */
    public void flatten(TreeNode root) {
        if(root == null) return;

        //flatten both children first
        flatten(root.left);
        flatten(root.right);

        //move the left subtree to the right
        TreeNode oldRight = root.right;
        root.right = root.left;
        root.left = null;

        //traverse to the end of the new right subtree to add the original right subtree
        TreeNode current = root;
        while(current.right != null) current = current.right;
        current.right = oldRight;
    }
}