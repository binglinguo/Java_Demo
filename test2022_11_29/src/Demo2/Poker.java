package Demo2;

public class Poker {
    private String colcr;//花色
    private int points;//点数

    public String getColcr() {
        return colcr;
    }

    public void setColcr(String colcr) {
        this.colcr = colcr;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Poker(String colcr, int points) {//新建一张牌
        this.colcr = colcr;
        this.points = points;
    }

    @Override
    public String toString() {
        return colcr+" "+points;
    }
}
