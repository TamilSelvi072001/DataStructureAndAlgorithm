package LinkedList;

public class Length {
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    // Function to insert a node at the beginning of the linked list.
    public static Node insertAtBeginning(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return newNode;
    }

    // Function to insert a node at the end of the linked list.
    public static Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertAtBeginning(head,9);
        head=insertAtBeginning(head,1);
        head=insertAtBeginning(head,4);
        head=insertAtEnd(head,7);
        head=insertAtBeginning(head,3);
        head=insertAtEnd(head,7);
        head=insertAtEnd(head,0);
        head=insertAtEnd(head,2);
        System.out.print(getCount(head));
    }
}
