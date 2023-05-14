package Demo2;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        PlayPoker playPoker=new PlayPoker();
        //买牌
        List<Poker> list=playPoker.buypokers();
        System.out.println(list);
        System.out.println("============");
        playPoker.cards(list);
        System.out.println(list);
        List<List<Poker>> ns = playPoker.Jinhua(list);
        for (int i = 0; i < ns.size(); i++) {
            System.out.println(ns.get(i));
        }

    }
}
