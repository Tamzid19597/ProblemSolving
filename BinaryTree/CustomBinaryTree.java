package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree {
    private int idx=-1;
    static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node buildTree(int[]nodes){
        if (nodes[++idx]==-1){
            return null;
        }
        Node node=new Node(nodes[idx]);
        node.left=buildTree(nodes);
        node.right=buildTree(nodes);
        return node;
    }
    public void preorderTraversal(Node root){
        if (root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public void inorderTraversal(Node root){
        if (root==null){
            System.out.print(-1+" ");
        }
        preorderTraversal(root.left);
        System.out.print(root.data+" ");
        preorderTraversal(root.right);
    }
    public void postorderTraversal(Node root){
        if (root==null){
            System.out.print(-1+" ");
        }
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public void levelOrderTraversal(Node root){
        if (root==null)return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curr=q.remove();
            if (curr==null){
                System.out.println();
                if (q.isEmpty())break;
                else q.add(null);
            }
            else {
                System.out.print(curr.data+"");
                if (curr.left!=null)q.add(curr.left);
                if (curr.right!=null)q.add(curr.right);
            }
        }
    }
    public int heightOfTheTree(Node root){
        if (root==null)return 0;
        int leftHeight=heightOfTheTree(root.left);
        int rightHeight=heightOfTheTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public int countNodes(Node root){
        if (root==null)return 0;
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        return leftNodes+rightNodes+1;
    }
    public int sumOfNodes(Node root){
        if (root==null)return 0;
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public int diameter(Node root){
        if (root==null)return 0;
        int d1=heightOfTheTree(root.left)+heightOfTheTree(root.right)+1;
        int d2=diameter(root.left);
        int d3=diameter(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }

}
