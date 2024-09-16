package src;
import java.util.Random;

public class Stack {
    private Node top = null;
    private int size = 0;

    public Stack() {
        top = null;
    }

    public void initializeStack() {
        top = null;
    }

    public boolean isEmptyStack() {
        return (top == null);
    }

    public boolean isFullStack() {
        return false;
    }

    public void push(Object newItem) {
        Node newNode = new Node(newItem);
        newNode.setLink(top);
        top = newNode;
        size++;
    }

    public Object pop() throws Exception {
        if (isEmptyStack()) {
            throw new Exception("StackUnderFlow");
        }
        Object item = top.getInfo();
        top = top.getLink();
        size--;
        return item;
    }

    public Object peek() throws Exception {
        if (isEmptyStack()) {
            throw new Exception("StackUnderFlow");
        }
        return top.getInfo();
    }

    public int getSize() {
        return size;
    }

    // public void printAllInfo() {
    // Node traverse = top;
    // while (traverse != null) {
    // System.out.print(traverse.getInfo() + " " + traverse.getLink());
    // System.out.print(" | ");
    // traverse = traverse.getLink();
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        Stack randStack = new Stack();
        Stack evenStack = new Stack();
        Stack oddStack = new Stack();
        Random rand = new Random();

        int n = rand.nextInt(10, 21);
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(0, 101);
            randStack.push(num);
        }

        System.out.println("--- Random Numbers [" + randStack.size + "] ---");
        while (!randStack.isEmptyStack()) {
            try {
                if ((int)randStack.peek() % 2 == 0) {
                    evenStack.push(randStack.peek());
                } else {
                    oddStack.push(randStack.peek());
                }
                System.out.print(randStack.pop() + " ");
            } catch (Exception e) {
                System.out.println(e);
                return;
            }
        }

        System.out.println();
        System.out.println("--- Even Stack [" + evenStack.size + "] ---");
        Stack evenStack_New = new Stack();
        while (!evenStack.isEmptyStack()) {
            try {
                evenStack_New.push(evenStack.pop());
                System.out.print(evenStack_New.peek() + " ");
            } catch (Exception e) {
                System.out.println(e);
                return;
            }
        }

        System.out.println();
        System.out.println("--- Odd Stack [" + oddStack.size + "] ---");
        Stack oddStack_New = new Stack();
        while (!oddStack.isEmptyStack()) {
            try {
                oddStack_New.push(oddStack.pop());
                System.out.print(oddStack_New.peek() + " ");
            } catch (Exception e) {
                System.out.println(e);
                return;
            }
        }
        System.out.println();

        for(int i=0; i<n; i++){
            try {
                if (evenStack_New.isEmptyStack()){
                    System.out.println("===> Odd is the winner!");
                    return;
                } else if (oddStack_New.isEmptyStack()) {
                    System.out.println("===> Even is the winner!");
                    return;
                }
                if ((int)evenStack_New.peek() > (int)oddStack_New.peek()){
                    oddStack_New.pop();
                } else {
                    evenStack_New.pop();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}