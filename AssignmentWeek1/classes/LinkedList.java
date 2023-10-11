class LinkedList {
    static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

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

    public int getAt(int index) {
        int current = 0;
        Node temp = head;
        while (current < index) {
            temp = temp.next;
            current++;
        }
        return temp.getData();
    }




}