package BoolList;

public class Book {
    private String name;//书名
    private String author;//作者
    private String type;//类型
    private int price;//价格
    private boolean isBorrwed;//状态

    public Book(String name, String author, int price , String type ) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBorrwed() {
        return isBorrwed;
    }

    public void setBorrwed(boolean borrwed) {
        isBorrwed = borrwed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                (isBorrwed==true?"已被借出":"未被借出")+
                '}';
    }
}
