package Demo1;

public class Main2 {
    public static void main(String[] args) {
        int[] arr=new int[]{9,7,5,3,4,6};
        int j=0;
        System.out.println("排序前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int tmp=arr[i];
            for (j = i-1; j >=0 ; j--) {
                if(tmp<arr[j]){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=tmp;
        }
        System.out.println("排序后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
