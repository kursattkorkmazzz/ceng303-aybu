class LinkedList {

    // Inner class represent node in LinkedList
    static class Node{
        private int data;
        private Node next;

        // Constructor for creating a node with given data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        // Constructor for creating a node with given data and next node
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;


    // Inserts a new node with the given data at the beginning of the LinkedList
    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // Inserts a new node with given data at the end of the LinkedList
    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Inserts a new node with the given data at the specified index in the LinkedList
    public void insertAt(int data, int index) {
        Node newNode = new Node(data);
        int current = 0;
        Node temp = head;

        while (current < index - 1) {
            temp = temp.next;
            current++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Returns data stored in node at the given index in LinkedList
    public int getAt(int index) {
        int current = 0;
        Node temp = head;
        while (current < index) {
            temp = temp.next;
            current++;
        }
        return temp.data;
    }

}