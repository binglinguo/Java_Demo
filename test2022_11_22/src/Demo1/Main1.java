package Demo1;

import java.util.Scanner;

interface Animal{
    public void to();
}
class First implements Animal{
    public void to(){
        System.out.println("First");
    }
}

class Second implements Animal{
    public void to(){
        System.out.println("Second");
    }
}

class Third implements Animal{
    public void to(){
        System.out.println("Third");
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

class StackList{
    public char[] val=new char[10000];
    public int top=-1;

    public void addStack(char ch){
        this.top++;
        this.val[top]=ch;
    }

    public char getStack(){
        if(top>=0){
            return this.val[top];
        }
        return ' ';
    }

    public void delStack(){
        this.val[top]=0;
        this.top--;
    }
}

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //write your code here.......
        a^=b;
        b^=a;
        a^=b;

        System.out.println(a+" "+b);
    }

    public static boolean isValid(String s) {
        //初始化栈
        StackList stackList=new StackList();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stackList.addStack(s.charAt(i));
            }else {
                if(s.charAt(i)==')'){
                    if(stackList.getStack()!='('){
                        return false;
                    }
                    stackList.delStack();
                }else if(s.charAt(i)=='}'){
                    if(stackList.getStack()!='{'){
                        return false;
                    }
                    stackList.delStack();
                }else if(s.charAt(i)==']'){
                    if(stackList.getStack()!='['){
                        return false;
                    }
                    stackList.delStack();
                }else{
                    return false;
                }
            }
            i++;
        }
        if(stackList.top==-1){
            return true;
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] arr={0,0};
        for(i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }return null;
    }


    public String longestCommonPrefix(String[] strs) {
        StringBuilder str=new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<strs[i].length()&&j<str.length();j++){
                if(strs[i].charAt(j)!=str.charAt(j)){
                    str.delete(j,str.length());
                    break;
                }
            }
            if(str.length()>strs[i].length()){
                str.delete(strs[i].length(),str.length());
            }
        }
        return str.toString();
    }

    public int romanToInt(String s) {
        int num=0;
        int num2=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int num1=0;
            switch(ch){
                case 'I':num1+=1;break;
                case 'V':num1+=5;break;
                case 'X':num1+=10;break;
                case 'L':num1+=50;break;
                case 'C':num1+=100;break;
                case 'D':num1+=500;break;
                case 'M':num1+=1000;break;
            }
            if(num2>num1){
                num1*=-1;
            }
            num2=num1;
            num+=num1;
        }
        return num;
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=0;
        int a=x;
        while(a>0){
            n*=10;
            n+=a%10;
            a/=10;
        }
        if(n==x){
            return true;
        }else {
            return false;
        }
    }

    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[j+1]=nums[i];
                j++;
            }
        }
        return j+1;
    }
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                n--;
                nums[i]=0;
                if(i<nums.length-1){
                    int tmp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=tmp;
                }
            }

        }return n;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead=new ListNode();
        ListNode red=newHead;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                red.next=list1;
                list1=list1.next;
                red=red.next;
            }
            else {
                red.next=list2;
                list2=list2.next;
                red=red.next;
            }
        }
        if(list1!=null){
            red.next=list1;
        }
        else if(list2!=null){
            red.next=list2;
        }
        return newHead.next;
    }
    public static void func(Animal animal) {
        animal.to();
    }

//    public static void main(String[] args) {
//        String[] str = new String[]("First", "Second", "Third");
//        Scanner scanner = new Scanner(System.in);
//        String n = scanner.nextLine();
//        for (int i = 0; i < str.length; i++) {
//            if (n.equals(str[i])) {
//                func(str[i]);
//            }
//        }

    //}
}