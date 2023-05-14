

public class test2022_10_10 {
//    public static void main(String[] args) {
//        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
//        doubleLinkedList.Listeag();
//        doubleLinkedList.display();
//        doubleLinkedList.remove(34);
//        doubleLinkedList.display();
//        doubleLinkedList.addIndex(0,88);
//        doubleLinkedList.display();
//        doubleLinkedList.clear();
//        doubleLinkedList.display();
//    }
    public static void main(String[] args) {
        DoubleLinkedList1 doubleLinkedList1=new DoubleLinkedList1();
        doubleLinkedList1.addFirst(12);
        doubleLinkedList1.addFirst(23);
        doubleLinkedList1.addFirst(34);
        doubleLinkedList1.addFirst(45);
        doubleLinkedList1.addFirst(56);

        doubleLinkedList1.display();
        System.out.println(doubleLinkedList1.size());
    }
}
