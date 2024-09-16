package src;
public class Node {
    private Object info;
    private Node link;

    public Node(Object info, Node link) {
        this.info = info;
        this.link = link;
    }

    public Node(Object info) {
        this(info, null);
    }

    public Node() {
        this(null, null);
    }

    public Object getInfo() {
        return this.info;
    }

    public Node getLink() {
        return this.link;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public String toString() {
        return "" + this.info;
    }
}