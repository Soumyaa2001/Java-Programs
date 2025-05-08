class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private static DNode head;
    private static DNode tail;
    private static int size = 0;

    // Check if the list is empty
    public static boolean isEmpty() {
        return head == null;
    }

    // Insert at the end
    public static void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (isEmpty()) {
            head = tail = newNode; // List is empty, both head and tail are the new node
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println(display());
    }

    // Insert at the beginning
    public static void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        System.out.println(display());
    }

    // Insert at a specific position
    public static void insertAtPosition(int data, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 0) {
            insertAtBeginning(data);
        } else if (pos == size) {
            insertAtEnd(data);
        } else {
            DNode newNode = new DNode(data);
            DNode temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
        }
        System.out.println(display());
    }

    // Remove from the end
    public static void removeFromEnd() {
        if (isEmpty()) {
            System.out.println("Linked List is NULL");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println(display());
    }

    // Remove from the start
    public static void removeFromStart() {
        if (isEmpty()) {
            System.out.println("Linked List is NULL");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println(display());
    }

    // Remove from a specific position
    public static void removeAtPosition(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 0) {
            removeFromStart();
        } else if (pos == size - 1) {
            removeFromEnd();
        } else {
            DNode temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
        System.out.println(display());
    }

    // Search for an element
    public static void search(int data) {
        DNode temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at index: " + index);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Element not found in the list.");
    }

    // Get the size of the list
    public static int getSize() {
        return size;
    }

    // Display the list (forward)
    public static String display() {
        StringBuilder sb = new StringBuilder("[");
        DNode temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(" ,");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Clear the entire list
    public static void clear() {
        while (!isEmpty()) {
            removeFromEnd();
        }
        System.out.println("Linked list has been cleared.");
    }
}

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("---------------------");
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Remove From Beginning");
            System.out.println("4. Remove From End");
            System.out.println("5. Insert At Index");
            System.out.println("6. Remove At Index");
            System.out.println("7. Display");
            System.out.println("8. Get Size");
            System.out.println("9. Exit");
            System.out.println("10. Search An Data");
            System.out.println("11. Clear the Linked List");
            System.out.println("----------------------");
            System.out.println();
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data : ");
                    int data1 = sc.nextInt();
                    DoublyLinkedList.insertAtEnd(data1);
                    break;
                case 2:
                    System.out.println("Enter data at Beginning : ");
                    int data2 = sc.nextInt();
                    DoublyLinkedList.insertAtBeginning(data2);
                    break;
                case 3:
                    DoublyLinkedList.removeFromStart();
                    break;
                case 4:
                    DoublyLinkedList.removeFromEnd();
                    break;
                case 5:
                    System.out.println("Enter Index to Insert : ");
                    int n = sc.nextInt();
                    System.out.println("Enter The Data :");
                    int data3 = sc.nextInt();
                    DoublyLinkedList.insertAtPosition(data3, n);
                    break;
                case 6:
                    System.out.println("Enter Index to Remove : ");
                    int n1 = sc.nextInt();
                    DoublyLinkedList.removeAtPosition(n1);
                    break;
                case 7:
                    System.out.println(DoublyLinkedList.display());
                    break;
                case 8:
                    System.out.println("Size is : " + DoublyLinkedList.getSize());
                    break;
                case 9:
                    flag = false;
                    break;
                case 10:
                    System.out.println("Enter the value to search:");
                    int key = sc.nextInt();
                    DoublyLinkedList.search(key);
                    break;
                case 11:
                    DoublyLinkedList.clear();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
