package BinaryTree;

public class PreOrderInOrderPostOrder {
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
            List<Integer> ans=new ArrayList<>();
            ans=inorderTraversal(root);
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
        
    }
}
