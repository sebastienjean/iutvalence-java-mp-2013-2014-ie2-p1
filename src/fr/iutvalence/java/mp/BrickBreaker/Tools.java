package fr.iutvalence.java.mp.BrickBreaker;

// TODO (fixed) rewrite comment (useless)
/**
 * Define some tools that can be used in collisions algorithms
 * @author ochiers
 *
 */
public class Tools
{
    /**
     * Function who say if the number toCompare is between the number a and the
     * number b
     * 
     * @param toCompare
     *            Number to compare
     * @param a
     *            Bound of comparison
     * @param b
     *            Bound of comparison
     * @return true if the number is in, false otherwise
     */
    public static boolean isFloatBetween(float toCompare, float a, float b)
    {
        return (toCompare >= a && toCompare <= b) || (toCompare >= b && toCompare <= a);
    }
}
