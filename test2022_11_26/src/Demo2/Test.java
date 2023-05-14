package Demo2;

public class Test {
    public static void main(String[] args){
        myArrayList myArrayList1=new myArrayList();
        myArrayList1.add(1);
        myArrayList1.add(2);
        myArrayList1.add(3);
        myArrayList1.add(4);
        myArrayList1.add(5);
        //System.out.println(myArrayList1.isFull());
        myArrayList1.add(1);
        myArrayList1.add(0,99);
        myArrayList1.add(3,88);
        myArrayList1.add(8,999);
        myArrayList1.display();
        System.out.println(myArrayList1.indexOf(999));
        System.out.println(myArrayList1.get(3));
        System.out.println(myArrayList1.size());
        try{
            myArrayList1.set(8,111);
        }catch(ArraysListException e){
            e.printStackTrace();
        }
        myArrayList1.display();
        myArrayList1.remove(99);
        myArrayList1.remove(88);
        myArrayList1.remove(111);
        myArrayList1.remove(1);
        myArrayList1.display();
        myArrayList1.clear();
        System.out.println("======");
        myArrayList1.display();
    }
}
