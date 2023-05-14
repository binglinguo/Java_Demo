package Demo1;

public class Main1 {
    public static void main(String[] args) {
        int[] arr=new int[]{9,7,5,3,4,6};
        System.out.println("排序前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            int min=i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int tmp=arr[min];
                arr[min]=arr[i];
                arr[i]=tmp;
            }
        }
        System.out.println("排序后");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
