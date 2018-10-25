package algorithms.InsertionSortAdvancedAnalysis;

// https://www.hackerrank.com/challenges/insertion-sort/problem
public class InsertionSortAdvancedAnalysis {
    private static long countShifts = 0;

    static long insertionSort(int[] arr) {
        countShifts = 0;
        mergesort(arr, new int[arr.length], 0, arr.length - 1);
        return countShifts;
    }

    private static void mergesort(int[] arr, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return;

        int middle = (leftStart + rightEnd) / 2;
        mergesort(arr, temp, leftStart, middle);            //left
        mergesort(arr, temp, middle+1, rightEnd);   //right
        mergeHalves(arr, temp, leftStart, rightEnd);        //halves
    }

    private static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int leftIdx = leftStart;
        int rightIdx = rightStart;
        int index = leftStart;

        while (leftIdx <= leftEnd && rightIdx <= rightEnd) {
            if (arr[leftIdx] <= arr[rightIdx]) {
                temp[index] = arr[leftIdx];
                leftIdx++;
            } else {
                temp[index] = arr[rightIdx];
                countShifts += rightIdx - index;
                rightIdx++;
            }
            index++;
        }


        System.arraycopy(arr, leftIdx, temp, index,leftEnd - leftIdx + 1);
        System.arraycopy(arr, rightIdx, temp, index,rightEnd - rightIdx + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }

    public static void main(String[] args) {
        System.out.println(insertionSort(new int[] {4, 3, 2, 1}));      //6
        System.out.println(insertionSort(new int[] {1, 1, 1, 2, 2}));   //0
        System.out.println(insertionSort(new int[] {2, 1, 3, 1, 2}));   //4
        System.out.println(insertionSort(new int[] {3, 5, 7, 11, 9}));  //1
    }
}
