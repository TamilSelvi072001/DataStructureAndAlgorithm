package BinaryTree;

import java.util.*;

public class PreOrder{
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
        ans=preOrderTraversal(root);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    } 
    public static List<Integer> preOrderTraversal(Node root){
        List<Integer> preOrderArr=new ArrayList<>();
        if(root==null)
            return preOrderArr;
        preOrderArr.add(root.data);
        preOrderArr.addAll(preOrderTraversal(root.left));
        preOrderArr.addAll(preOrderTraversal(root.right));
        return preOrderArr;
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