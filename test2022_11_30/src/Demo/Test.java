package Demo;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.display();
        list.removeAllKey(2);
        list.display();

    }
}
