class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(n)
    Space complexity: O(n)
    */
    public List<Integer> rightSideView(TreeNode root) {        
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        
        list.add(root.val);
        if(root.left != null) queue.add(root.left);
        if(root.right != null) queue.add(root.right);
        
        while(queue.size() != 0) {
            int levelSize = queue.size();
            TreeNode last = null;
            for(int i = 0; i < levelSize; i++) {
                last = queue.remove();
                if(last.left != null) queue.add(last.left);
                if(last.right != null) queue.add(last.right);
            }
            list.add(last.val);
        }
        
        return list;
    }
}