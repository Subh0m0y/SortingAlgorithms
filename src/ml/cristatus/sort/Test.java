package ml.cristatus.sort;

import ml.cristatus.sort.util.ArrayUtils;
import ml.cristatus.sort.util.Stopwatch;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */
public class Test {
    public static void main(String[] args) {
        // Initialization
        int n = 100_000;
        boolean reverse = false;
        Integer[] integers1 = ArrayUtils.generateSortedIntegers(n, reverse);
        Integer[] integers2 = Arrays.copyOf(integers1, n);
        ArrayUtils.shuffle(integers2);

        Sort<Integer> sort = new InsertionSort<>();
        if (reverse) sort.setComparator(Comparator.reverseOrder());

        Stopwatch stopwatch = new Stopwatch();

        // Timing starts
        stopwatch.start();
        sort.sort(integers2);
        double time = stopwatch.getTimeInSeconds();

        // Verification phase
        boolean pass = Arrays.equals(integers1, integers2);
        System.out.println(pass ? "Sorted in " + time + " seconds." : "Error.");
    }
}
