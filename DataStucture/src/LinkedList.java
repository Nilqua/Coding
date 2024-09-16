package src;

public class LinkedList {
    Node head = null;

    void add(Object input) {
        Node temp = new Node(input);
        //40 30 null
        if (head == null) {
            head = temp;
        } else {
            temp.setLink(head);
            head = temp;
        }
    }

    void addLast(Object input){
        Node temp = new Node(input);
        if (head == null) {
            head = temp;
        } else {
            Node trav = head;
            //30 60 null
            while (trav.getLink() != null) {
                trav = trav.getLink();
            }
            trav.setLink(temp);
        }
    }

    void delFirst(){
        if (head == null){
            return;
        } else {
            head = head.getLink();
        }
    }

    void delLast(){
        if (head == null) {
            return;
        } else {
            Node trav = head;
            while (trav.getLink().getLink() != null) {
                trav = trav.getLink();
            }
            trav.setLink(null);
        }
    }

    public void print() {
        Node traverse = head;
        String str = "";
        while (traverse != null) {
            str = str.concat(traverse.toString());
            str = str.concat(" " + traverse.getLink());
            traverse = traverse.getLink();
            if (traverse != null)
                str = str.concat(" | ");
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.add(30);
        test.add(40);
        test.add(500);
        test.add(20);
        test.add(10);
        test.addLast(60);
        test.addLast(100);
        test.print();

        test.delFirst();
        test.print();
        test.delLast();
        test.print();
    }
}
