package ml.cristatus.sort.util;

import java.util.Random;

/**
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */
public class ArrayUtils {
    public static Integer[] generateSortedIntegers(int limit, boolean reverse) {
        Integer[] integers = new Integer[limit];
        for (int i = 0; i < limit; i++) {
            integers[i] = reverse ? limit - i : i;
        }
        return integers;
    }

    public static <T> void shuffle(T[] a) {
        Random random = new Random();
        int limit = a.length - 1;
        for (int i = 0; i < limit; i++) {
            int j = i + random.nextInt(limit - i);
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
