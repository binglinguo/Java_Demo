package Demo1;

import java.util.Arrays;

class Hash{
    public int val;
    public int valn;
    public Hash next;


    public Hash(){

    }
    public Hash(int val){
        this.val=val;
    }
}
public class Test {
    public static Hash head;

    public static void main(String[] args) {
        int[] nums1=new int[]{1,2,2,1};
        int[] nums2=new int[]{2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static  int[] intersect(int[] nums1, int[] nums2) {
        //if(nums1==null||nums2==null)return null;
        for(int i=0;i<nums1.length;i++){
            Hash cur=head;
            boolean fly=false;
            while(cur!=null){
                if(cur.val==nums1[i]){
                    cur.valn++;
                    fly=true;
                    break;
                }
                cur=cur.next;
            }
            if(!fly){
                Hash newH=new Hash(nums1[i]);
                cur=head;

                while(cur!=null&&cur.next!=null){
                    cur=cur.next;
                }
                if(cur==null){
                    newH.valn++;
                    head=newH;
                }else {
                    cur.next=newH;
                }
            }
        }
        Hash cur1=head;
        while(cur1!=null){
            System.out.print(cur1.val+"n:"+cur1.valn+"  ");
            cur1=cur1.next;
        }
        System.out.println("++++++++++");
        int[] arr=new int[1];
        int k=0;
        for(int i=0;i<nums2.length;i++){
            Hash cur=head;
            while(cur!=null){
                if(cur.val==nums2[i]){
                    cur.valn--;
                    if(cur.valn<=0){
                        if(k==arr.length){
                            arr=Arrays.copyOf(arr,arr.length+1);
                        }
                        arr[k]=cur.val;
                        k++;
                    }

                }
                cur=cur.next;
            }
        }
        return arr;
    }
}
