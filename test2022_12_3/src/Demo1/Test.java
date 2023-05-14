package Demo1;

public class Test {
    public static void main(String[] args) {
        LinkList list=new LinkList();
        list.Listeag();
       // list.display();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(67);
        list.display();
        System.out.println();
        list.remove(1);
        list.removeAllKey(22);


        list.display();
    }
}

