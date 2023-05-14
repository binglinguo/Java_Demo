

public class test_2022_8_30 {

    void func4(int N) {
        int count = 0;
        for (int k = 0; k < 100; k++) {
            count++;
        }
        System.out.println(count);
    }



    void func1(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count++;
            }
        }
        for (int k = 0; k < 2 * N; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }

    void func2(int N) {
        int count = 0;
        for (int k = 0; k < 2 * N ; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        SeqList seqList=new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.add(4,5);
        seqList.display();
        System.out.println(seqList.contains(2));
        System.out.println(seqList.search(2));
        System.out.println(seqList.getPos(14));
        seqList.setPos(1,99);
        seqList.display();
        seqList.remove(99);
        seqList.display();
        System.out.println(seqList.size());
        seqList.clear();
        seqList.display();
        seqList.add(0,1);
        seqList.display();
    }
}
