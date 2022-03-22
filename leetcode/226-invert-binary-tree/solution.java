class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        final var n = root.left;
        root.left = root.right;
        root.right = n;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
