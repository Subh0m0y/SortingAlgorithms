package ml.cristatus.sort;

import java.util.Comparator;

/**
 * This is the basic class that states the basic functionality that must
 * be implemented by every implementation. Only one method needs to be
 * implemented.
 * <p>
 * <b>NOTE:</b> This hierarchy supports only Generic arrays; primitive arrays
 * are not supported.
 *
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */

public abstract class Sort<T extends Comparable<T>> {

    /**
     * The {@link Comparator} to be used for determining the order of
     * arrangement of the elements. By default, it is
     * {@link Comparator#naturalOrder()}.
     */
    protected Comparator<T> comparator = Comparator.naturalOrder();

    /**
     * @return The {@link Comparator} that is used to determine the order.
     */
    public Comparator getComparator() {
        return comparator;
    }

    /**
     * If the default {@link Comparator} does not fulfil the need for a
     * different ordering, a new {@link Comparator} can be set and used
     * immediately.
     *
     * @param comparator The new {@link Comparator}.
     */
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    /**
     * This method sorts the entire array in the order as specified.
     *
     * @param elements The array of elements to sort.
     */
    @SafeVarargs
    public final void sort(T... elements) {
        sort(0, elements.length, elements);
    }

    /**
     * This method sort the array within the given range in the order as
     * needed.
     *
     * @param p        The inclusive starting index.
     * @param r        The exclusive ending index.
     * @param elements The array of elements to sort.
     */
    public abstract void sort(int p, int r, T... elements);
}
