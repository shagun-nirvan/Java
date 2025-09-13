package LinkedList;

public class singlyLL {

    private Node head;
    private Node tail;
    private int size;

    public singlyLL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    //INSERT USING RECURSION
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp; 
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    
    public void deleteLast(){
        if(size==0){
            return;
        }
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        
    }

    public int deleteIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
          Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;

    }

    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

}
