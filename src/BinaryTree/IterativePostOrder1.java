package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrder1 {
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
        ans=postOrderTraversal(root);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
     public static List<Integer> postOrderTraversal(Node root){
        List<Integer> postOrderArr=new ArrayList<>();
        if(root==null)
            return postOrderArr;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st1.add(root);
        while(!st1.isEmpty()){
            Node temp=st1.pop();
            st2.add(temp);
            if(temp.left!=null) st1.add(temp.left);
            if(temp.right!=null) st1.add(temp.right);
        }
        while(!st2.isEmpty()){
            postOrderArr.add(st2.pop().data);
        }
        return postOrderArr;
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