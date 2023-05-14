package Dome2;


class Money implements Cloneable{//钱
    public double m=12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Human implements Cloneable{
    private String name;//姓名
    private int age;//年龄
    public Money money=new Money();//钱

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Human tmp=(Human)super.clone();
        tmp.money=(Money)this.money.clone();
        return tmp;
    }
}
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human1=new Human("山西",15);
        Human human2= (Human) human1.clone();
        System.out.println(human1.getMoney().m);
        System.out.println(human2.getMoney().m);
        System.out.println("============");
        human1.money.m=99;
        System.out.println(human1.getMoney().m);
        System.out.println(human2.getMoney().m);
    }
}
