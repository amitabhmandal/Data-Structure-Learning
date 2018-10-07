package binary.search.tree.learning;

//We can keep any type of object
public class BinarySearchTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    // Insert Rules
    // If the tree is empty then the first insert becomes the root

    // If the tree is not empty then we compare the data to be inserted with the root
    // node and if it is smaller then we go to the left and repeat the process
    // till we reach the leaf node where we insert the data

    // if the tree is not empty then we compare the data to be inserted with the root
    // node and if it is greater then we go to the right and repeat the process
    // till we reach the leaf node where we insert the data.
    
    public static void insertNode() {
        Tree insertTreeNode = new Tree();
        insertTreeNode.insertTreeNode(25);
        insertTreeNode.insertTreeNode(20);
        insertTreeNode.insertTreeNode(15);
        insertTreeNode.insertTreeNode(27);
        insertTreeNode.insertTreeNode(30);
        insertTreeNode.insertTreeNode(29);
        insertTreeNode.insertTreeNode(26);
        insertTreeNode.insertTreeNode(22);
        insertTreeNode.insertTreeNode(32);
        
        
    }

}

class Tree {

    // We need this because we want to access the root node as once if we have the root node
    // then we have everything else.
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insertTreeNode(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}

class TreeNode {
    private int data;
    private int duplicateCounter;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
        // When we insert data for the first time, it will be a leaf node and hence
        // we dont have anything to insert into the left child or right child.
    }

    public void insert(int value) {

        // Concepts:
        // Check whether the data already exists in the tree or not
        // This being duplicate hence we don't want to do anything and kicking it out
        if (value == this.data) {
            return;
        }

        // if the value is not duplicate then it is either to be inserted either
        // in the left child or right child.

        // left child checking
        if (value < this.data) {
            // found insertion point if the left child is null
            if (this.leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }

        } else {//right child
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(value);
            } else {
                this.rightChild.insert(value);
            }
        }

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDuplicateCounter() {
        return duplicateCounter;
    }

    public void setDuplicateCounter(int duplicateCounter) {
        this.duplicateCounter = duplicateCounter;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}