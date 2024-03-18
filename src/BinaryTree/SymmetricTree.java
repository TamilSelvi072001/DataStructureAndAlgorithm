package BinaryTree;

public class SymmetricTree {
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
        System.out.print(isSymmetric(root));
    }
    public static boolean isSymmetric(Node root) {
        if(root==null) return true;
        boolean ans=inOrder(root.left,root.right);
        return ans;
    }
    public static boolean inOrder(Node root,Node root2){
        if(root==null && root2==null) return true;
        if((root==null || root2==null) ) return false;
        return root.data==root2.data && inOrder(root.left,root2.right) && inOrder(root.right,root2.left) ;
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

