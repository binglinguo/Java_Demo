package Demo1;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[]{6,5,9,7,2,8};
        int i=0;
        int j=0;
        boolean fly;
        System.out.println("排序前");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (i = 0; i < arr.length - 1 ; i++) {
            fly=false;
            for (j = 0; j < arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    fly=true;
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            if(!fly){
                break;
            }
        }
        System.out.println("排序后");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
