package Demo1;

class Computer{
    private String neicun;
    private String gpu;
    public String pingmu;
    public String zhuji;

    public Computer(String neicun, String gpu, String pingmu, String zhuji) {
        this.neicun = neicun;
        this.gpu = gpu;
        this.pingmu = pingmu;
        this.zhuji = zhuji;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "neicun='" + neicun + '\'' +
                ", gpu='" + gpu + '\'' +
                ", pingmu='" + pingmu + '\'' +
                ", zhuji='" + zhuji + '\'' +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer("16+1024","i9","三星","华硕");
        System.out.println(computer);
    }
}
