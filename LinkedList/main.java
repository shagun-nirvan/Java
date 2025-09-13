package LinkedList;

public class main {
    public static void main(String[] args) {
        singlyLL list = new singlyLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertRec(22,3);
        // list.insertLast(31);
        // list.insert(99, 1);
        // System.out.println(list.deleteFirst()); 
        // list.deleteLast();
        // System.out.println(list.deleteIndex(1));

        // System.out.println(list.find(2));
        list.display();



        //  DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertLast(22);
        // list.insertBtw(51, 2);
        // list.display();



        // CircularLL list = new CircularLL();
        // list.insert(22);
        // list.insert(33);
        // list.insert(44);
        // list.insert(55);

        

        // list.display();
    }
    
}
