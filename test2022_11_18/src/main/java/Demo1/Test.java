package Demo1;

public class Test {
    public static int KMP(String str,String sub,int pos){
        if(str==null||sub==null)return -1;
        int nStr=str.length();
        int nSub=sub.length();
        if(nStr==0||nSub==0)return -1;
        if(pos<0||pos>nSub)return -1;
        int[] next=new int[nSub];
        getnext(sub,next);
        int i=pos;
        int j=0;
        while(i<nStr&&j<nSub){
            if(j==-1||str.charAt(i)==sub.charAt(j)){
                i++;
                j++;
            }else {
                j=next[j];
            }
        }
        if(j>=nSub){
            return i-j;
        }
        return -1;
    }
    public static void getnext(String sub,int[] next){
        next[0]=-1;
        next[1]=0;
        int i=2;
        int k=0;
        while(i<sub.length()){
            if(k==-1||sub.charAt(i-1)==sub.charAt(k)){
                next[i]=k+1;
                k++;
                i++;
            }else {
                k=next[k];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(KMP("abcabc", "abc", 0));
        System.out.println(KMP("dkjashdjk","ash",0));
    }
}
