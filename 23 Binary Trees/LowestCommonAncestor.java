import java.util.ArrayList;

/**
 * This class implements two different approaches to find the Lowest Common Ancestor (LCA)
 * of two nodes in a binary tree.
 */
public class LowestCommonAncestor {
    /**
     * Node class representing a node in the binary tree
     */
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Helper method to get the path from root to a given node
     * @param root Root of the binary tree
     * @param n Target node value to find
     * @param path ArrayList to store the path
     * @return true if path exists, false otherwise
     */
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    /**
     * First approach to find LCA using path comparison
     * Time Complexity: O(n)
     * @param root Root of the binary tree
     * @param n1 First node value
     * @param n2 Second node value
     * @return Lowest Common Ancestor node
     */
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Find the last common node in both paths
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }

    /**
     * Second approach to find LCA using recursive traversal
     * Time Complexity: O(n)
     * @param root Root of the binary tree
     * @param n1 First node value
     * @param n2 Second node value
     * @return Lowest Common Ancestor node
     */
    public static Node lca2(Node root, int n1, int n2){
        // Base cases
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        // If one subtree returns null, return the other
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        // If both subtrees return non-null, current node is LCA
        return root;
    }

    public static void main(String[] args) {
        /*
                          1
                        /   \
                      2      3
                    /  \    /  \
                   4    5  6     7 
        */
        // Create the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Test case: Find LCA of nodes 4 and 7
        int n1=4, n2=7;
        System.out.println(lca2(root, n1, n2).data);
    }
}
