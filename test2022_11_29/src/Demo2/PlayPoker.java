package Demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayPoker {
    public static final String[] colcrs={"♥","♦","♠","♣"};//扑克牌花色


    //生成52张
    public List<Poker> buypokers(){
        List<Poker> list=new ArrayList<>();
        for (int i = 0; i < 4 ; i++) {
            for (int j = 1; j < 14 ; j++) {
                Poker poker=new Poker(colcrs[i],j );
                list.add(poker);
            }
        }
        return list;
    }

    //洗牌
    public void cards(List<Poker> list){
        Random random=new Random();
        for (int i = list.size()-1; i >0 ; i--) {
            int n=random.nextInt(i);
            Poker tmp=list.get(i);
            list.set(i,list.get(n));
            list.set(n,tmp);
        }
    }

    //扎金花
    public List<List<Poker>> Jinhua(List<Poker> list){
        List<List<Poker>> humans=new ArrayList<>();
        List<Poker> hand1 = new ArrayList<>();
        List<Poker> hand2 = new ArrayList<>();
        List<Poker> hand3 = new ArrayList<>();
        humans.add(hand1);
        humans.add(hand2);
        humans.add(hand3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <=2 ; j++) {
                List<Poker> t=humans.get(j);
                t.add(list.remove(0));
            }
        }

        return humans;
    }
}
