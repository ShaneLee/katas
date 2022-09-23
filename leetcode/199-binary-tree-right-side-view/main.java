class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       if (root == null) return Collections.emptyList(); 


        final Queue<TreeNode> q = new ArrayDeque<>();
        final List<Integer> l = new LinkedList<>();

        q.add(root);

        TreeNode cur;

        while (!q.isEmpty()) {
            int n = q.size();

            int i = 0;

            while(i++ < n) {
                cur = q.poll();
                if (i == 1) {
                    l.add(cur.val);
                }

                if (cur.right != null) {
                    q.add(cur.right);
                }

                if (cur.left != null) {
                    q.add(cur.left);
                }
            }

        }

        return l;
        
    }
}
