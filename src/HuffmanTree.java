public class HuffmanTree {
    private Node root;

    public HuffmanTree() {
        root = new Node();

    }

    public HuffmanTree(Node root) {
        this.root = root;

    }

    public int getFrequence() {
        return root.getFrequence();

    }

    public Node getRoot() {
        return root;

    }
}
