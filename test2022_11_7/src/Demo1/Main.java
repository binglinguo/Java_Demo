package Demo1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }
}

class Data {

    private int x;
    private int y;

     Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

     int getX() {
        return x;
    }

     int getY() {
        return y;
    }

}