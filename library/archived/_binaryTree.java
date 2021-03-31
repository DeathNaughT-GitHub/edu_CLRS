class _binaryTree {
    public static void main(String[] args) {
        BinaryTree BTree = new BinaryTree();
        BTree.add(50);
        BTree.add(40);
        BTree.add(60);
        BTree.add(35);
        BTree.add(45);
        BTree.add(55);
        BTree.add(65);
        BTree.add(52);
        BTree.add(30);
        BTree.add(70);

        BTree.inorder();

        BTree.delete(60);
        BTree.inorder();

    }
}

class BinaryTree {
    Node root;
    int size;
    
    BinaryTree() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add (int val) {
        root = add(root, val);
        size++;
    }

    public boolean search(int val) {
        return search(root, val);
    }

    public void delete (int val) {
        root = delete (root, val);
        size--;
    }

    public void inorder() {
        inorder(root, 0);
    }

    private Node add (Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val <= node.val) {
            node.left = add(node.left, val);
        } else {
            node.right = add(node.right, val); 
        }       

        return node;
    }

    private Node delete (Node node, int val) {
        if (node == null) {
            return node;
        }

        if (val < node.val) {
            node.left = delete (node.left, val);
        }

        else if (val > node.val) {
            node.right = delete (node.right, val);
        }

        // when =
        else {

            if (node.left == null && node.right == null)
            return null;
            
            else if (node.left == null) {
                return node.right;
            }

            else if (node.right == null) {
                return node.left;
            }

            else {
                Integer nextMin = getMin(node.right);
                node.val = nextMin;
                node.right = delete (node.right, nextMin);
            }

        }
        return node;

    }

    private Integer getMin (Node node) {
        if (node.left != null) {
            return getMin(node.left);
        }
        return node.val;
    }

    private boolean search(Node node, int val) {
        if (node.val == val) {
            return true;
        }

        if (node.left != null) {
            if (search(node.left, val))
                return true;
        }
        
        if (node.right != null) {
            if (search(node.right, val))
            return true;
        }

        return false;
    }

    private void inorder(Node node, int level) {
        if (node != null) {
            System.out.print("[" + node.val + "]");
            inorder(node.left, level + 1);
            inorder(node.right, level + 1);
        }
        else {
            System.out.println();
        }

    }
}

class Node {
    int val;
    Node left;
    Node right;

    Node() {
        val = 0;
        left = right = null;
    }

    Node (int val) {
        this.val = val;
        left = right = null;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(Node node) {
        left = node;
    }

    public void setRight(Node node) {
        right = node;
    }

}