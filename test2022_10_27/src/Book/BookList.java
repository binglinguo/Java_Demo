package Book;

public class BookList {
    private Book[] books=new Book[10];
    private int BookSize;
    public  BookList(){
        books[0]=new Book("三国演义","罗贯中",17,"小说");
        books[1]=new Book("西游记","吴承恩",47,"小说");
        books[2]=new Book("水浒传","施耐庵",37,"小说");
        this.BookSize=3;
    }

    public int getBookSize() {
        return BookSize;
    }

    public void setBookSize(int bookSize) {
        BookSize = bookSize;
    }

    /**
     * 获取到pos位置的一本书
     * @param pos
     * @return
     */
    public Book getpos(int pos){
        return books[pos];
    }

    /**
     * 新加入一本书
     * @param pos
     * @param book
     */
    public void setBooks(int pos,Book book){
        this.books[pos]=book;
    }
}
