package Demo1;

 class Best1{
    protected int a=99;
}

public  class Test {
    protected int a=99;
    public static void main2(String[] args) {
        Best1 best=new Best1();
        best.a=10;
        System.out.println(best.a);
    }

    public static void main1(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    public static boolean halvesAreAlike(String s) {
        char[] t={'a','e','i','o','u','A','E','I','O','U'};
        int count=0;
        String array=s.substring(0,s.length()/2);
        char[] array2=array.toCharArray();
        for(char x:array2){
            for(int i=0;i<t.length;i++){
                if(x==t[i]){
                    count++;
                }
            }
        }
        String array1=s.substring(s.length()/2);
        char[] array3=array1.toCharArray();
        for(char x:array3){
            for(int i=0;i<t.length;i++){
                if(x==t[i]){
                    count--;
                }
            }
        }
        return count==0;
    }
}
