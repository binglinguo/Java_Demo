package dome1;


class LinkList {
    public int val;
    public LinkList next;
    public LinkList(int val){
        this.val=val;
    }
}
public class test {

    public static void main(String[] args) {
        LinkList linkList=new LinkList(10);
        System.out.println(linkList.val);
    }
}
