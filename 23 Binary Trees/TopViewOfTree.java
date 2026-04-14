import java.util.*;
import java.util.LinkedList;

/**
 * This class implements the Top View of a Binary Tree.
 * The top view of a binary tree is the set of nodes visible when looking at the tree from the top.
 * For each vertical line, we only consider the first node that appears in the level order traversal.
 */
public class TopViewOfTree {
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
     * Info class to store node and its horizontal distance
     * Used in level order traversal to track horizontal distances
     */
    static class Info{
        Node node;
        int hd;  // horizontal distance

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    /**
     * Prints the top view of the binary tree
     * Uses level order traversal with horizontal distance tracking
     * Time Complexity: O(n) where n is the number of nodes
     * @param root Root of the binary tree
     */
    public static void topView(Node root) {
        // Queue for level order traversal
        Queue<Info> q = new LinkedList<>();
        // HashMap to store the first node at each horizontal distance
        HashMap<Integer, Node> map = new HashMap<>();

        // Track minimum and maximum horizontal distances
        int min = 0, max = 0;
        q.add(new Info(root,0));
        q.add(null);  // Marker for level end

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                // If queue is empty after removing null, we're done
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);  // Add null marker for next level
                }
            } else {
                // If this horizontal distance is seen for the first time, add to map
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
    
                // Process left child with hd-1
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                // Process right child with hd+1
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        // Print nodes from left to right (min to max horizontal distance)
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
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

        // Print the top view of the tree
        topView(root);
    }
}