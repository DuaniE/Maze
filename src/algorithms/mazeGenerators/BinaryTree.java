package algorithms.mazeGenerators;

public class BinaryTree {
    Node root;

    public boolean addSet(BinaryTree anotherOne){
        if (root.canMerge(anotherOne.root.value)){
            addTree(anotherOne);
            return true;
        }
        return false;
    }

    private void addTree(BinaryTree toAdd){
        /*if (toAdd.root.left == null && toAdd.root.right == null){
            addNode(root, toAdd.root);
        }*/
        addNode(toAdd.root);
    }

    public boolean addNode(Node toAdd) {
        root = addNodeRecursive(root, toAdd);
        return root != null;
    }

    public Node addNodeRecursive(Node current, Node toAdd){
        if (current == null){
            return toAdd;
        }
        if (current.value.colP < toAdd.value.colP)
            addNodeRecursive(current.right, toAdd);
        else if (current.value.colP >= toAdd.value.colP)
            addNodeRecursive(current.left, toAdd);
        else
            return current;
        return current;
    }
}
