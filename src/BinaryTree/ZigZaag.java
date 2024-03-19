package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZaag{
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
        ans=zigzagLevelOrder(root);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }
     public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null){
           return list;
       }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer>levellist=new ArrayList<>();
            for(int i=0;i<len;i++){
            Node temp=queue.poll();
            if(temp.left!=null)
                queue.add(temp.left);
            
            if(temp.right!=null)
                queue.add(temp.right);
            
            if(level%2==0)
                levellist.add(temp.data);
            else
                levellist.add(0,temp.data);
        }
        level++;
        list.add(levellist);
        }
        return list;
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