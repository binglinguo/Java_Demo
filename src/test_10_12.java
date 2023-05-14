/**
 * @author Created by ${冰激凌} on
 * 2022/10/12 21:43
 */
class Dog1{

}
public class test_10_12 {
    public static void main1(String[] args) {
        DoubleLinkedList1 doubleLinkedList1=new DoubleLinkedList1();

            doubleLinkedList1.addFirst(34);
            doubleLinkedList1.addLast(34);
            doubleLinkedList1.addLast(34);
            doubleLinkedList1.addLast(34);
            doubleLinkedList1.addLast(34);
            doubleLinkedList1.addLast(34);
            doubleLinkedList1.addIndex(2,100);
            System.out.println(doubleLinkedList1.contains(1000));
            doubleLinkedList1.display();
            doubleLinkedList1.remove(34);
            doubleLinkedList1.display();
            doubleLinkedList1.removeAllKey(34);

            doubleLinkedList1.display();
            doubleLinkedList1.clear();
            doubleLinkedList1.display();

    }
}
