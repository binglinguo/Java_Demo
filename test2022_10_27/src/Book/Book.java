package Book;

public class Book {
    private String name;//书名
    private String  author;//作者
    private int price;//价格
    private String type;//类型
    private boolean isBorrwed;//是否借出

     public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrwed() {
        return isBorrwed;
    }

    public void setBorrwed(boolean borrwed) {
        isBorrwed = borrwed;
    }

    @Override
    public String toString() {
        return "book{" +
                "  书名='" + name + '\'' +
                ", 作者='" + author + '\'' +
                ", 价格=" + price +
                ", 类型='" + type + '\'' +
                ((isBorrwed==true)?", 已被借出":", 未被借出") +
                '}';
    }
}
