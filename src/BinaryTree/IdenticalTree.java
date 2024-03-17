package BinaryTree;

public class IdenticalTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.left.right.left = new Node(8);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        root2.right.right.left = new Node(9);
        root2.right.right.right = new Node(10);
        System.out.print(isSameTree(root, root2));
    }
    public static boolean isSameTree(Node p, Node q) {
        if(p==null || q==null)  return p==q;     
        return ((p.data==q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
