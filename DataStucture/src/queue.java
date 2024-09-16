package src;
import java.util.Random;
import java.util.Scanner;

public class queue {
 private Node queueFront = null;
    private Node queueRear = null;
    private int count = 0;
    queue(){
        queueFront = null;
        queueRear = null;
    }

    public void initializeQueue() {
        queueFront = null;
        queueRear = null;
        count = 0;
    }

    public boolean isEmptyQueue(){
        return ( queueFront == null );

    }

    public boolean isFullQueue() {
        return false;
    }

    public Object front() throws Exception {
        if (isEmptyQueue())
        throw new Exception("QueueUnderflow");
        return queueFront.getInfo();
    }

    public Object back() throws Exception {
        if (isEmptyQueue())
        throw new Exception("QueueUnderflow");
        return queueRear.getInfo();
    }


    public void enQueue(Object newItem) {
        Node newNode = new Node(newItem);
        if ( queueFront == null ) {
        queueFront = newNode;
        queueRear = newNode;
        } else {
        queueRear.setLink(newNode);
        queueRear = queueRear.getLink();
        }
        count++;
    }

   
    public Object deQueue() throws Exception {
        Object itemInfo;
        if (isEmptyQueue())
        throw new Exception("QueueUnderflow");
        itemInfo = queueFront.getInfo();
        queueFront = queueFront.getLink();
        if ( queueFront == null )
        queueRear = null;
        count--;
        return itemInfo;
    }

    public int getSize() {
        return count;
        }

        public void printQueue() {
            Node current = queueFront;
            while (current != null) {
                System.out.print(current.getInfo() + " ");
                current = current.getLink();
            }
        }


public static void main(String[] args) {
    queue odd = new queue();
    queue even = new queue();
    Scanner sc = new Scanner(System.in);

    // int n = r.nextInt(10,21);
    // System.out.println("--- Random Numbers ["+n+"] ---");

    int n = sc.nextInt();
    
    for(int i =0;i<n;i++){
        // int num = r.nextInt(0,101);
        // System.out.print(num+" ");
        int num = sc.nextInt();
        try{
            if(num%2 == 0){
                even.enQueue(num);
            }else{odd.enQueue(num);}
        }catch(Exception e){
        }
    }System.out.println();

    // System.out.println("---  Even Stack [even] ---");
    // for(int i=0;i<n;i++){
    //     try {
    //         System.out.print(even.deQueue()+" ");
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }
    // System.out.println();

    // System.out.println("---  Even Stack [odd] ---");
    // for(int i=0;i<n;i++){
    //     try {
    //         System.out.print(odd.deQueue()+" ");
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }
    // System.out.println();
    System.out.println("--- Even Queue [" + even.getSize() + "] ---");
        even.printQueue();
        System.out.println();

        System.out.println("--- Odd Queue [" + odd.getSize() + "] ---");
        odd.printQueue();
        System.out.println();

        int round = 0;
        int evenWins = 0;
        int oddWins = 0;

        while (!even.isEmptyQueue() && !odd.isEmptyQueue()) {
            round++;
            try {
                int evenFront = (int) even.front();
                int oddFront = (int) odd.front();

                if (evenFront > oddFront) {
                    evenWins++;
                    even.deQueue();
                    odd.enQueue(odd.deQueue());
                } else {
                    oddWins++;
                    odd.deQueue();
                    even.enQueue(even.deQueue());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String winner = even.isEmptyQueue() ? "Even" : "Odd";
        System.out.println("===> Winner is " + winner + "!");
        System.out.println("Round=" + round + ", Win=(E:" + evenWins + ",O:" + oddWins + "), " + (even.isEmptyQueue() ? "Odd" : "Even") + " Left=" + (even.isEmptyQueue() ? odd.getSize() : even.getSize()));
    }
}