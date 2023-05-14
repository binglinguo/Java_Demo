package Demo2;

public interface Sort {
    public void sort(int[] array);
    public default void swap(int[] array, int i, int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }
}
