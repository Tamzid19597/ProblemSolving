package BinaryTree;

public class BST {
    private  Node root;

    public BST() {
        root=null;
    }

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public void insert(int val){
        root=insert_recursive(root,val);
    }
    public Node insert_recursive(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (val<root.data)root.left=insert_recursive(root.left,val);
        if (val> root.data)root.right=insert_recursive(root.right,val);
        return root;
    }
    public void delete(int val){
        if (!search(val)) System.out.println("key doesnt exist");
        else delete_recursively(root,val);
    }
    private Node delete_recursively(Node root,int val){
        if (root==null)return root;
        if (val<root.data){
            root.left=delete_recursively(root.left,val);
        }
        else if (val>root.data){
            root.right=delete_recursively(root.right,val);
        }
        else {
            if (root.left==null)return root.left;
            else if(root.right==null)return root.right;
            root.data=minValue(root.right);
            root.right=delete_recursively(root.right, root.data);
        }
        return root;
    }
    public void inorderTraversal(Node root){
        if (root==null) return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    public boolean search(int val){
        Node node= search_recursive(root,val);
        return node!=null;
    }
    private Node search_recursive(Node root,int val){
        if (root==null || root.data==val)return root;
        if (root.data<val)return search_recursive(root.right,val);
        return search_recursive(root.left,val);
    }
    public int minValue(Node root){
        Node node=minvalue_recursive(root);
        if (node==null) return -1;
        else return node.data;
    }

    private Node minvalue_recursive(Node root){
        if (root==null) return root;
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        bst.inorderTraversal(bst.root);
        System.out.println();
        System.out.println(bst.search(90));
        System.out.println(bst.minValue(bst.root));
        bst.delete(12);
        bst.inorderTraversal(bst.root);
    }
}
