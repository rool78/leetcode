package problems.algoexpert.medium;

public class BSTConstruction {

    public static void main(String[] args) {
        System.out.println("bst");

        BST root = new BST(8);
        root.left = new BST(2);
        root.right = new BST(19);

        root.insert(1);
        System.out.println(root.contains(2));
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        //todos los metodos corren O(n) [seria el caso de tener un bst con forma de linkedlist]
        // worst case y O(log(n)) Average
        //corre O(1) space al ser hacerlo iterativo, si lo hicieramos recursivo tendria un coste


        //O(n)
        public BST insert(int value) {
            BST currentNode = this;
            while (true) {
                if (value > currentNode.value) {
                    if (currentNode.right == null) {
                        currentNode.right = new BST(value);
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                } else {
                    if (currentNode.left == null) {
                        currentNode.left = new BST(value);
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                }
            }

            return this;
        }

        //O(n), el codigo se puede escribir un poco mejor
        public boolean contains(int value) {
            BST currentNode = this;
            while (true) {
                if (currentNode.value == value)
                    return true;
                if (value > currentNode.value) {
                    if (currentNode.right == null)
                        return false;
                    currentNode = currentNode.right;
                } else {
                    if (currentNode.left == null) {
                        return false;
                    }
                    currentNode = currentNode.left;
                }
            }
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            } else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            } else {
                if (left != null && right != null) { //if left and right subtrees are present
                    this.value = right.getMinValue();
                    right.remove(this.value, this);
                } else if (parent == null) { //if only one subtree is present and parent node is missing
                    if (left != null) {
                        this.value = left.value;
                        right = left.right;
                        left = left.left;
                    } else if (right != null) {
                        this.value = right.value;
                        right = right.right;
                        left = right.left;
                    } else {
                        //this is single node tree do nothing
                    }
                } else if (parent.left == this) { //if only one subtree is present and parent node is present
                    parent.left = left != null ? left : right;
                } else if (parent.right == this) {
                    parent.right = left != null ? left : right;
                }
            }
        }

        public int getMinValue() {
            if (left == null) {
                return this.value;
            } else {
                return left.getMinValue();
            }
        }
}

        }
