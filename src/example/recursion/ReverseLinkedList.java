package example.recursion;

public class ReverseLinkedList {

    public static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);

        printLinkedList(n1);
        Node reversed = reverseLinkedList(n1);
        System.out.println("");
        printLinkedList(reversed);

    }

    private static Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) return node;
        Node p = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return p;
    }

    private static void printLinkedList(Node node) {
        Node tmp = node;
        while (tmp != null) {
            System.out.print(tmp.val + " -> ");
            tmp = tmp.getNext();
            if (tmp == null) System.out.print("Null");
        }
    }


}
