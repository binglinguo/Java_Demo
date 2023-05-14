


class Preak1{
    String name;
    int age;

    public  Preak1(){
        ;
    }
//    public Preak(String name,int age){
//        this.name=name;
//        this.age=age;
//
//
     static {
    System.out.println("静态方法初始化");
}

     public Preak1(String name, int age) {
         this.name = name;
         this.age = age;
         System.out.println("构造方法初始化");
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

     @Override
     public String toString() {
         return "Preak{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

public class dome4 {
    public static void main1(String[] args) {
       // Preak preak=new Preak1("羊毛领",12);
//        Preak preak1=new Preak("guo",20);
//        System.out.println(preak);
//        System.out.println(preak1);


    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double height = scanner.nextDouble();//身高
//        double weight = scanner.nextDouble();
//
//        //write your code here......
//        double bod=weight/(height*height);
//        if(bod<18.5){
//            System.out.println("偏瘦");
//        }
//        else if(bod>18.5&&bod<20.9){
//            System.out.println("苗条");
//        }
//        else if(bod>=20.9&&bod<24.9){
//            System.out.println("适中");
//        }
//        else {
//            System.out.println("偏胖");
//        }
//    }
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String str = scanner.next();
//    String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
//    boolean n=str.matches(emailMatcher);
//    if (n){
//        System.out.println("邮箱格式合法");
//    }
//    else {
//        System.out.println("邮箱格式不合法");
//    }
//}

