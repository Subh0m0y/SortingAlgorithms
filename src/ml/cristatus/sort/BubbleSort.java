package ml.cristatus.sort;

/**
 * This class implements the classic bubble-sort algorithm. There are a
 * couple of tweaks provided to make the algorithm as efficient as possible,
 * by avoiding a few wasteful iterations when possible.
 * <p>
 * This algorithm has quadratic time-complexity, i.e. O(n&sup2;), but the
 * constant factors are higher than those of selection and insertion sort.
 * Therefore, in practical cases, it takes the most time.
 *
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    /**
     * Sorts the given array in the given range using Bubble Sort technique.
     *
     * @param p The inclusive starting index.
     * @param r The exclusive ending index.
     * @param a The elements to be sorted.
     */
    @Override
    public void sort(int p, int r, T... a) {
        // The last iteration is unnecessary as all elements are sorted by then
        int limit = r - 1;
        // To see if any element was swapped (i.e. sorting is not over)
        boolean swapped = true;
        for (int i = p; i < limit && swapped; i++) {
            swapped = false;
            // The limit keeps reducing as the end gets incrementally sorted
            for (int j = p; j < limit - i; j++) {
                if (comparator.compare(a[j], a[j + 1]) > 0) {
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
