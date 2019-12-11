class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(?)
    */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null) queue.add(root.left);
        if(root.right != null) queue.add(root.right);
        
        while(queue.size() != 0) {
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                TreeNode t = queue.pop();
                TreeNode temp2 = t.left;
                t.left = t.right;
                t.right = temp2;
                if(t.left != null) queue.add(t.left);
                if(t.right != null) queue.add(t.right);
            }
        }
        
        return root;
        
    }
}