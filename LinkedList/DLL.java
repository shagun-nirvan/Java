package LinkedList;

public class DLL {

    private Node head;
    private int size;

    public void insertFirst(int val){
        Node node =  new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.prev = temp;
        node.next = null;

    }

    public void insertBtw(int val, int index){
         if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node prevPtr = head;
        Node nextPtr = head.next;
        for(int i=0;i<index-1;i++){
            prevPtr = prevPtr.next;
            nextPtr = nextPtr.next;
        }
        Node node =  new Node(val);
        node.next = nextPtr;
        nextPtr.prev = node;
        node.prev = prevPtr;
        prevPtr.next = node;
        size++;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }
    
    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }
}
