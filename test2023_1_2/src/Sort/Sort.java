package Sort;

public interface Sort {
    public void sort(int[] array);
    public default void swap(int[] array,int i,int j){
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
}
