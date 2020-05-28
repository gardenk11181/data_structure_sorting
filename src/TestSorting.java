public class TestSorting {

    public static void main(String[] args) {
        int length = 1000;
        String[] items = new String[length];
        for(int i=0; i<length; i++) {
            items[i] = ""+(int)(Math.random()*10000);
        }
        Sorting<String> sorting = new Sorting<>(items);

        //test
        long startTime = System.nanoTime();
//        sorting.selectionSort();
//        sorting.bubbleSort();
        sorting.insertionSort();
        long finishTime = System.nanoTime();

        System.out.println((finishTime-startTime)/1000000000.0 +" times used");
        sorting.printAll();

    }
}
