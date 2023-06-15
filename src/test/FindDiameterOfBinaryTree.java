package test;

class Tree {

    int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class FindDiameterOfBinaryTree {

    public static int diameter(Tree root) {

        if (root == null) {
            return 0;
        }

        int lHeight = heigth(root.left);
        int rHeight = heigth(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(1 + lHeight + rHeight, Math.max(leftDiameter, rightDiameter));
    }

    public static int heigth(Tree root) {

        if (root == null) {
            return 0;
        }

        int lHeight = heigth(root.left);
        int rHeight = heigth(root.right);

        return 1 + Math.max(lHeight, rHeight);

    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        int result = diameter(root);
        System.out.println(result);

    }
}
