package Demo1;

public class Test {
    public void crSort(int[] elem){
        int min=0;
        for(int i=0;i<elem.length;i++){
            min=i;
            for (int j = i; j <elem.length ; j++) {
                if(elem[min]>elem[j]){
                    min=j;
                }
            }
            if(min!=i){
                int tmp=elem[i];
                elem[i]=elem[min];
                elem[min]=tmp;
            }
        }
    }
}
