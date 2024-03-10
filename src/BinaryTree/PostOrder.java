package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static void main(String[] args){
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
            postOrderArr.addAll(postOrderTraversal(root.left));
            postOrderArr.addAll(postOrderTraversal(root.right));
            postOrderArr.add(root.data);
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
