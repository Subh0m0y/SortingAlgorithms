package ml.cristatus.sort.util;

/**
 * A simple timer utility meant to keep things simple. Start using the
 * {@linkplain #start()} method and immediately call {@linkplain #getTime()}
 * or {@linkplain #getTimeInSeconds()} when done.
 * <p>
 * A timer can be re-used; just use {@linkplain #start()} again.
 *
 * @author Subhomoy Haldar
 * @version 23-07-2016
 */
public class Stopwatch {
    private long start;

    /**
     * Assigns the starting time and starts the stopwatch.
     */
    public void start() {
        start = System.nanoTime();
    }

    /**
     * @return The time elapsed since {@linkplain #start()} was called.
     */
    public long getTime() {
        return System.nanoTime() - start;
    }

    /**
     * @return The time elapsed in seconds.
     */
    public double getTimeInSeconds() {
        return getTime() * 1e-9;
    }
}
