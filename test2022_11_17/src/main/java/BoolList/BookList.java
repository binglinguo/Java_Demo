package BoolList;

public class BookList {
    public Book[] books=new Book[10];
    private int BookSize=0;

    public BookList() {
        books[0]=new Book("三国演义","罗贯中",17,"小说");
        books[1]=new Book("西游记","吴承恩",47,"小说");
        books[2]=new Book("水浒传","施耐庵",37,"小说");
        BookSize=3;
    }

    public void setBooks(int pos,Book books) {
        this.books[pos]=books;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public int getBookSize() {
        return BookSize;
    }

    public void setBookSize(int bookSize) {
        BookSize = bookSize;
    }

}
