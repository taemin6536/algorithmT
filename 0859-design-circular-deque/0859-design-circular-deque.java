class DoublyLinkedList {
    DoublyLinkedList left;
    DoublyLinkedList right;
    int val;

    public DoublyLinkedList(final int val) {
        this.val = val;
    }
}
class MyCircularDeque {
    int len;
    int k;
    DoublyLinkedList head;
    DoublyLinkedList tail;

    public MyCircularDeque(int k) {
        head = new DoublyLinkedList(0);
        tail = new DoublyLinkedList(0);
        head.right = tail;
        tail.left = head;
        this.k = k;
        this.len = 0;
    }

    public boolean insertFront(int value) {
        if (!this.isFull()) {
            DoublyLinkedList node = new DoublyLinkedList(value);
            node.right = head.right;
            node.left = head;
            head.right.left = node;
            head.right = node;
            len++;
            return true;
        } else {
            return false;
        }
    }

    public boolean insertLast(int value) {
        if (!this.isFull()) {
            DoublyLinkedList node = new DoublyLinkedList(value);
            node.left = tail.left;
            node.right = tail;
            tail.left.right = node;
            tail.left = node;
            len++;
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteFront() {
        if (!isEmpty()) {
            head.right.right.left = head;
            head.right = head.right.right;
            len--;
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteLast() {
        if (!isEmpty()) {
            tail.left.left.right = tail;
            tail.left = tail.left.left;
            len--;
            return true;
        } else {
            return false;
        }
    }

    public int getFront() {
        return (isEmpty()) ? -1 : head.right.val;
    }

    public int getRear() {
        return (isEmpty()) ? -1 : tail.left.val;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return  len == k;
    }
}
