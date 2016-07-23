package ml.cristatus.sort;

/**
 * This class implements the insertion-sort algorithm.
 * <p>
 * This algorithm has quadratic time-complexity, i.e. O(n&sup2;). On a
 * practical level, it is the fastest out of selection and bubble sort.
 *
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */
public class InsertionSort<T extends Comparable<T>> extends Sort<T> {

    /**
     * Sorts the given array in the given range using Insertion Sort technique.
     *
     * @param p The inclusive starting index.
     * @param r The exclusive ending index.
     * @param a The elements to be sorted.
     */
    @Override
    public void sort(int p, int r, T... a) {
        for (int i = p + 1; i < r; i++) {
            T element = a[i];
            int j = i;
            // Find the position to insert the element in
            while (j > p && comparator.compare(element, a[j - 1]) < 0) {
                j--;
            }
            if (j == i) continue;   // No insertion needed
            // Shuffle the elements up
            System.arraycopy(a, j, a, j + 1, i - j);
            a[j] = element;
        }
    }
}
