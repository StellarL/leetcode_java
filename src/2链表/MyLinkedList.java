/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/30
 * Time: 20:31
 * Description: No Description
 */
class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int len = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index < 0 || index >= len) return -1;
        Node cur = head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        len++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node cur = head;
        if (cur == null) {
            head = newNode;
            len++;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        len++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > len) return;
        Node newNode = new Node(val);
        Node cur = head;
        if (index == 0) {
            newNode.next = cur;
            head = newNode;
            len++;
            return;
        }
        while (--index > 0) {
            cur = cur.next;
        }
        if (cur.next == null) cur.next = newNode;
        else {
            newNode.next = cur.next;
            cur.next = newNode;
        }
        len++;
    }

    public void deleteAtIndex(int index) {
        if (index >= len || index < 0) return;
        //空
        if (head == null) return;
        if (index == 0) {
            if (head.next == null) {
                head = null;
                len = 0;
                return;
            } else {
                head = head.next;
                len--;
                return;
            }
        }

        Node cur = head;
        while (--index > 0) {
            cur = cur.next;
        }
        if (cur.next.next == null) cur.next = null;
        else cur.next = cur.next.next;
        len--;
    }
}
