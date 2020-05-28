public class Sorting<T extends Comparable<T>> {
    private int length;
    private T[] array;

    @SuppressWarnings("unchecked")
    public Sorting() {
        this.array = (T[]) new Comparable[10];
        this.length = 10;
    }

    public Sorting(T[] array) {
        this.array = array;
        this.length = array.length;
    }

    public void printAll() {
        for(int i=0; i<length; i++) {
            System.out.print(array[i]+", ");
        }
    }

    public void selectionSort() {
        selectionSort(length);
    }

    public void selectionSort(int last) {
        if(last==1) return;
        T item = array[0];
        int maxIndex=0;
        for(int i=1; i<last; i++) {
            if(item.compareTo(array[i])<0) {
                item = array[i];
                maxIndex=i;
            }
        }
        array[maxIndex] = array[last-1];
        array[last-1] = item;
        selectionSort(last-1);
    }

    public void bubbleSort() {
        bubbleSort(length);
    }

    public void bubbleSort(int last) {
        if(last==1) return;
        for(int i=0; i<last-1; i++) {
            if(array[i].compareTo(array[i+1])>0) {
                T tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
        bubbleSort(last-1);
    }

}
