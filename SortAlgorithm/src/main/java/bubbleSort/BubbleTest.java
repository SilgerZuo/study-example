package bubbleSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class BubbleTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray();
        BubbleSort.BubbleSort(randomArray);
        RandomArray.printArray(randomArray);

    }
}
