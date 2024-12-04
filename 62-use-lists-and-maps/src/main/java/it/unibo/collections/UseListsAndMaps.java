package it.unibo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private static final int END = 2000;
    private static final int START = 1000;

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        final List <Integer> arrist = new ArrayList<>();
        
        for(int i=START;i<=END;i++){
            arrist.add(i);
        }
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        List<Integer> linkist = new LinkedList<>(arrist);
        log(linkist);
        
        /*
            * 3) Using "set" and "get" and "size" methods, swap the first and last
            * element of the first list. You can not use any "magic number".
            * (Suggestion: use a temporary variable)
            */
        int temp= arrist.getLast();
        arrist.set(arrist.size()-1, arrist.getFirst());
        arrist.set(0, temp);
        /*
            * 4) Using a single for-each, print the contents of the arraylist.
            */
        final var builder = new StringBuilder();
        for (final int i : arrist) {
            builder.append(i).append(", ");
        }
        if(!builder.isEmpty()){
            builder.delete(builder.length() - 2, builder.length());
        }
        log(builder);
        /*
            * 5) Measure the performance of inserting new elements in the head of
            * the collection: measure the time required to add 100.000 elements as
            * first element of the collection for both ArrayList and LinkedList,
            * using the previous lists. In order to measure times, use as example
            * TestPerformance.java.
            */
        /*
            * 6) Measure the performance of reading 1000 times an element whose
            * position is in the middle of the collection for both ArrayList and
            * LinkedList, using the collections of point 5. In order to measure
            * times, use as example TestPerformance.java.
            */
        /*
            * 7) Build a new Map that associates to each continent's name its
            * population:
            *
            * Africa -> 1,110,635,000
            *
            * Americas -> 972,005,000
            *
            * Antarctica -> 0
            *
            * Asia -> 4,298,723,000
            *
            * Europe -> 742,452,000
            *
            * Oceania -> 38,304,000
            */
            /*
                * 8) Compute the population of the world
                */
        }
        private static void log(final Object message) {
            System.out.println(message); // NOPMD
        }
           
}
