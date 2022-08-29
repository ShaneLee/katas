import java.util.HashMap;
import java.util.Map;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return node;

        Node c = new Node(node.val);
        
        Map<Integer, Node> v = new HashMap<>();

        dfs(node, c, v);

        return c;
    }

    private static void dfs(final Node n, final Node c, final Map<Integer, Node> v) {
        v.put(c.val, c);

        n.neighbors.forEach(nn -> {
            if (v.get(nn.val) == null) {
                Node node = new Node(nn.val);
                c.neighbors.add(node);
                dfs(nn, node, v);
            }
            else {
                c.neighbors.add(v.get(nn.val));
            }

        });

    }
}
