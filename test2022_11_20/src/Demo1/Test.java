package Demo1;

public class Test {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int[] arr = new int[n];
        int j = 0;
        int k = 0;
        int i = 0;
        while(j<nums1.length&&k<nums2.length){
            if(nums1[j] > nums2[k]){
                arr[i]=nums2[k];
                k++;
            }else {
                arr[i]=nums1[j];
                j++;
            }
            i++;
        }
        if(j==nums1.length){
            while(k<nums1.length){
                arr[i]=nums2[k];
                i++;
                k++;
            }
        }else if(k==nums2.length){
            while(j<nums1.length){
                arr[i]=nums1[j];
                i++;
                j++;
            }
        }
        for(int z=0;z<n;z++){
            System.out.print(arr[z]+" ");
        }
        double d=0;
        if(n%2==0){
            d=(arr[n/2-1]+arr[n/2])/2.0;
        }else if(n%2==1){
            d=arr[n/2]*1.0;
        }
        return d;
    }

    public static void main(String[] args) {
        int[] a={};
        int[] b={1};
        double s=findMedianSortedArrays(a,b);
        System.out.println(s);
    }
    public static int isChar(StringBuilder str,char ch){
        if(str.length() == 0) return -1;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return i+1;
            }
        }
        return -1;
    }
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder str = new StringBuilder();
        int n=0;
        for(int i=0;i<s.length();i++){
            int c = isChar(str,s.charAt(i));
            str.append(s.charAt(i));
            if(c!=-1){
                str.delete(0,c);
            }
            if(n<str.length()){
                n=str.length();
            }
        }
        if(n<str.length()){
            n=str.length();
        }
        return n;
    }

    public static void main3(String[] args) {
        int a=lengthOfLongestSubstring("abcabcbb");
        System.out.println(a);
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder add = new  StringBuilder();
        int t = 0;
        while (i >= 0||j >= 0||t != 0){
            int ch1 = i<0 ? 0 :num1.charAt( i ) - '0';
            int ch2 = j<0 ? 0 :num2.charAt( j ) - '0';
            int ch3 = ch1 + ch2 + t;
            add.append( ch3 % 10 );
            t = ch3 / 10;
            i--;
            j--;
        }
        add.reverse();
        return add.toString();
    }

    public String addStrings2(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }

    public static String addStrings3(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder str1=new StringBuilder();
        int t=0;
        while(i>=0||j>=0||t!=0){
            int ch1=i<0?0:num1.charAt(i)-'0';
            int ch2=j<0?0:num2.charAt(j)-'0';
            int ch3=ch1+ch2+t;
            str1.append(ch3%10);
            t=ch3/10;
            i--;
            j--;
        }
        str1.reverse();
        return str1.toString();
    }

    public static void main2(String[] args) {
        //String str=addStrings("99", "123");
        StringBuilder str=new StringBuilder();
        if(str==null){
            System.out.println(str);
        }

    }
        public int StrToInt(String str) {
            str=new String(str);
            if(str.isEmpty())return 0;
            int i=0;
            int flag=1;
            if(str.charAt(0)=='-'){
                flag=-1;
                i++;
            }else if(str.charAt(0)=='+'){
                flag=1;
                i++;
            }
            int sum=0;
            for(;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch>='1'&&ch<='9'){
                    sum*=10;
                    sum+=ch-'0';
                }else {
                    return 0;
                }

            }
            return sum*flag;
        }
    public String addStrings1(String num1, String num2) {
        int x=StrToInt(num1);
        int y=StrToInt(num2);
        int z=x+y;
        //String str=toString(z);
        return null;
    }
    public static void main1(String[] args) {
        //String.valueOf();
    }
}
