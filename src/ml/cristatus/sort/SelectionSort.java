package ml.cristatus.sort;

/**
 * This class implements the selection-sort algorithm.
 * <p>
 * This algorithm has quadratic time-complexity, i.e. O(n&sup2;). The
 * practical running time is between that of insertion and bubble sort.
 *
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */
public class SelectionSort<T extends Comparable<T>> extends Sort<T> {

    /**
     * Sorts the given array in the given range using Selection Sort technique.
     *
     * @param p The inclusive starting index.
     * @param r The exclusive ending index.
     * @param a The elements to be sorted.
     */
    @Override
    public void sort(int p, int r, T... a) {
        for (int i = p; i < r - 1; i++) {
            int pos = i;
            // find the element that should take this position
            for (int j = i + 1; j < r; j++) {
                if (comparator.compare(a[j], a[pos]) < 0) {
                    pos = j;
                }
            }
            // if the correct element id already in position, skip, else swap
            if (pos == i) continue;
            T temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
    }
}
