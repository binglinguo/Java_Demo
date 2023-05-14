package Demo;

import java.util.Scanner;

class First{
    public String toString(){
        return "First";
    }
}
class Second{
    public String toString(){
        return "Second";
    }
}
class Third{
    public String toString(){
        return "Third";
    }
}
public class Main {
    public static void print(Object object){
        System.out.println(object.toString());
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while(scanner.hasNext()){
            String className=scanner.next();
            print(Class.forName(className).newInstance());
        }
    }
}
