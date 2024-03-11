package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

public class BFS{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);
        List<List<Integer>> levelOrderTraversal=levelOrder(root);
        for(int i=0;i<levelOrderTraversal.size();i++){
            for(int j=0;j<levelOrderTraversal.get(i).size();j++){
                System.out.print(levelOrderTraversal.get(i).get(j) + " ");
            }
        }

    }
     public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        if(root==null){
            return ans;
        }
        while(!queue.isEmpty()){
            int count=queue.size();
            List<Integer> subans=new ArrayList<>();
            for(int i=0;i<count;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subans.add(queue.poll().val);
            }
            ans.add(subans);
        }
        return ans;
    }
}