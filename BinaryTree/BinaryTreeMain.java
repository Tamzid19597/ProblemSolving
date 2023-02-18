package BinaryTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CustomBinaryTree binaryTree=new CustomBinaryTree();
        CustomBinaryTree.Node root=binaryTree.buildTree(nodes);
        binaryTree.preorderTraversal(root);
        System.out.println();
        binaryTree.inorderTraversal(root);
        System.out.println();
        binaryTree.postorderTraversal(root);
        System.out.println();
        binaryTree.levelOrderTraversal(root);
        System.out.println(binaryTree.heightOfTheTree(root));
        System.out.println(binaryTree.countNodes(root));
        System.out.println(binaryTree.diameter(root));
    }
}
