package org.learn.bigo;


/**
 * Big O - describes the performance of an algorithm, how scalable it is (computes runtime complexity)
 * Growth Rates
 * - Constant O(1)
 * - Linear O(n)
 * - Logarithmic O(log n)
 * - Quadratic O(n^2)
 * - Exponential O(2^n)
 */
public class BigOSample {

    /**
     * O(1) runs in constant time
     *
     * @param numbers
     */
    public void log1(int[] numbers) {
        // O(1) - runs in constant time
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);// becomes O(2) but still can be represented O(1)
    }

    /**
     * O(n) runtime complexity increases linearly
     *
     * @param numbers
     */
    public void logN(int[] numbers) {
        // O(1+n+1), O(2+n), O(n), represents a linear growth
        System.out.println(); // O(1)
        for (int number : numbers) { // O(N)
            System.out.println(number);
        }
        System.out.println(); // O(1)

    }

    public void logN(int[] numbers, String[] names) {
        // O(n+m), still O(n) as it grows linearly
        for (int number : numbers) { // O(N)
            System.out.println(number);
        }
        for (String name : names) {// O(m)
            System.out.println(name);
        }

    }


    /**
     * O(n^2) runtime complexity increases quadratically
     * meaning algorithms that run in O(n^2) get slower and slower
     *
     * @param numbers
     */
    public void logN2(int[] numbers) {
        //O(n+n^2), still O(n^2)
        for (int number : numbers) {//O(n)
            System.out.println(number);
        }
        //O(n^2)
        for (int first : numbers) {//O(n)
            for (int second : numbers) {//O(n)
                System.out.println(first + ", " + second);
            }
        }
    }

    /**
     * O(log n) runtime complexity is logarithmic
     * more efficient and more scalable than linear/quadratic
     * slows down as input size grows
     */
    public void logNn() {

    }

    /**
     * O(2^ n) runtime complexity is exponential, opposite of logarithmic growth
     */
    public void log2n() {

    }

}
