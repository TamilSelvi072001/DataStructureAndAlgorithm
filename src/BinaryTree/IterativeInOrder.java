package BinaryTree;

import java.util.ArrayList;
import java.util.List;

class IterativeInOrder{
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
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        ans=getTreeTraversal(root);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }
    public static List<List<Integer>> getTreeTraversal(Node root) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		List<Integer> inOrder=new ArrayList<>();
		List<Integer> preOrder=new ArrayList<>();
		List<Integer> postOrder=new ArrayList<>();
		inOrder=inOrderTraversal(root,inOrder);
		preOrder=preOrderTraversal(root,preOrder);
		postOrder=postOrderTraversal(root,postOrder);
		ans.add(inOrder);
		ans.add(preOrder);
		ans.add(postOrder);
		return ans;
	}	
	public static List<Integer> inOrderTraversal(Node root,List<Integer> inOrder){
		if(root==null) return inOrder;
		inOrderTraversal(root.left,inOrder);
		inOrder.add(root.data);
		inOrderTraversal(root.right,inOrder);
		return inOrder;
	}
	public static List<Integer> preOrderTraversal(Node root,List<Integer> preOrder){
		if(root==null) return preOrder;
		preOrder.add(root.data);
		preOrderTraversal(root.left,preOrder);
		preOrderTraversal(root.right,preOrder);
		return preOrder;
	}
	public static List<Integer> postOrderTraversal(Node root,List<Integer> postOrder){
		if(root==null) return postOrder;
		postOrderTraversal(root.left,postOrder);
		postOrderTraversal(root.right,postOrder);
		postOrder.add(root.data);
		return postOrder;
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