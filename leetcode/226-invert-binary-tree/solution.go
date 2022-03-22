func invertTree(root *TreeNode) *TreeNode {
  if (root == nil) {
    return root;
  }

  var t *TreeNode = root.Left;
  root.Left = root.Right;
  root.Right = t;

  invertTree(root.Left);
  invertTree(root.Right);

  return root;
}
