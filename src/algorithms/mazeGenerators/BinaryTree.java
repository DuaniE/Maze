package algorithms.mazeGenerators;

public class BinaryTree {
    Node root;

    BinaryTree(Node n){
        this.root = n;
    }

    public boolean addSet(BinaryTree anotherOne){
        if (canMergeTree(anotherOne)){
            addTree(anotherOne);
            return true;
        }
        return false;
    }

    public boolean canMergeTree(BinaryTree bT){
        if (bT.root.value.rowP == this.root.value.rowP && bT.root.value.colP == this.root.value.colP)
            return false;
        return (!this.isSubtree(this.root, bT.root));
    }

    boolean isIdentical(Node current, Node anotheRoot){
        if (current == null && anotheRoot == null)
            return true;
        if (current == null || anotheRoot == null)
            return false;
        return (current.value == anotheRoot.value
                && isIdentical(current.left, anotheRoot.left)
                && isIdentical(current.right, anotheRoot.right));
    }

    boolean isSubtree(Node T, Node S)
    {
        /* base cases */
        if (S == null)
            return true;

        if (T == null)
            return false;

        /* Check the tree with root as current node */
        if (isIdentical(T, S))
            return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        return isSubtree(T.left, S)
                || isSubtree(T.right, S);
    }

//    /*
//    * This method check if you can merge one tree with another
//    * need to check if this method is necessary
//    */
//    public boolean canMergeTree(BinaryTree bT){
//        if (bT.root.value.rowP == this.root.value.rowP && bT.root.value.colP == this.root.value.colP)
//            return false;
//        return this.isInclude(bT.root);
//    }

    public boolean isInclude(Node anotheRoot){
        return isIncludeRecursive(root, anotheRoot);
    }

    private boolean isIncludeRecursive(Node current, Node anotheRoot){
        if (current == null){
            return false;
        }
        if (current.value.colP == anotheRoot.value.colP && current.value.rowP == anotheRoot.value.rowP){
            return true;
        }
        if (this.root.value.colP < anotheRoot.value.colP)
            addNodeRecursive(current.right, anotheRoot);
        else if (current.value.colP >= anotheRoot.value.colP)
            addNodeRecursive(current.left, anotheRoot);
        else
            return true;
        return true;
    }

    /*
     * This method add one tree to another
     */
    private void addTree(BinaryTree toAdd){
        /*if (toAdd.root.left == null && toAdd.root.right == null){
            addNode(root, toAdd.root);
        }*/
        addNode(toAdd.root);
    }


    /*
    * Add node to another node and update the cell wall status
    * */
    public boolean addNode(Node toAdd) {
        String wallPosition = "";
        if(this.root.value.colP == toAdd.value.colP || this.root.value.colP == toAdd.value.colP){
            if (this.root.value.colP == toAdd.value.colP){
                if (this.root.value.rowP == toAdd.value.rowP)
                    return false;
                else if (this.root.value.rowP > toAdd.value.rowP){
                    wallPosition = "up";
                    this.root.value.up = false;
                    toAdd.value.down = false;
                }
                else
                    wallPosition = "down";
                    this.root.value.down = false;
                    toAdd.value.up = false;
            }
            else{
                if (this.root.value.colP > toAdd.value.colP){
                    wallPosition = "left";
                    this.root.value.left = false;
                    toAdd.value.right = false;
                }
                else
                    wallPosition = "right";
                    this.root.value.right = false;
                    toAdd.value.left = false;
            }
            root = addNodeRecursive(root, toAdd);
            return root != null;
        }
        else{
            return false;
        }
    }

    private Node addNodeRecursive(Node current, Node toAdd){
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
