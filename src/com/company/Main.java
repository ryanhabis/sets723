package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Not type safe - no gererics, can add any type of objects
        Set hSet1 = new HashSet();

        //This converted to an integer because of auto boxing.
        //autodoxing converts primitave
//        hSet1.add(4);
//        hSet1.add("Hello");
//        hSet1.add(new Scanner(System.in));

        // We use generics to make collections type safe
        // and avoid runtime errors.
        Set<String> hSet = new HashSet();

        //incompatable types
        //hSet.add(4);
        hSet.add("Hello");
        hSet.add("blue");
        hSet.add("red");

        //Set does not allow duplicates - .equals .hashcode is built into it.
        // if two objects are equal both should have the same hash code.
        hSet.add("red");

        //Within a hash set the order is unpredictable
        System.out.println("HashSet - hset = " +hSet.toString());

        Set<String> tset = new TreeSet<>(hSet);
        // This sorts by order
        System.out.println("TreeSet - tset = " + tset.toString());

/**
 * Constructs a new, empty tree set, sorted according to the specified comparator.
 * All elements inserted into the set must be mutually comparable by the specified
 * comparator: comparator.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the set.
 * If the user attempts to add an element to the set that violates this constraint, the
 * add call will throw a ClassCastException.
 */
        Set<String> t2set = new TreeSet(new EgComp());
        t2set.addAll(hSet);
        System.out.println("TreeSet - t2set = " + t2set.toString());

        /**
         * Constructs a new linked hash set with the same elements as the specified collection.
         * The linked hash set is created with an initial capacity sufficient
         * to hold the elements in the specified collection and the default load factor
         */
        Set<String> linkedHasSet = new LinkedHashSet<>(hSet);

        linkedHasSet.add("Hello");
        linkedHasSet.add("blue");
        linkedHasSet.add("red");

        System.out.println("LinkedHashSet = " + linkedHasSet);

        /*
        Returns an iterator over the elements in this set.
        The elements are returned in no particular order
        (unless this set is an instance of some class that provides a guarantee).
         */
        System.out.println("LinkedHashSet = " + linkedHasSet.iterator());

        Set<String> hSet2 = new HashSet<>();
        hSet2.add("blue");
        hSet2.add("red");
        hSet2.add("yellow");

        Set<String> union = new HashSet<>();
        /**
         * Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
         * If the specified collection is also a set, the addAll operation effectively modifies this set so that its value is
         * the union of the two sets.
         * The behavior of this operation is undefined if the specified collection is modified while the operation is in progress.
         */

        /*
        hSet.add("Hello");
        hSet.add("blue");
        hSet.add("red");

        hSet2.add("blue");
        hSet2.add("red");
        hSet2.add("yellow");
         */
        union.addAll(hSet);
        union.addAll(hSet2);

        System.out.println("union = " + union);



        Set<String> intersection = new HashSet<>();
        intersection.addAll(hSet);
        intersection.retainAll(hSet2);
        System.out.println("intersection = " + intersection);


        Set<String> differance = new HashSet<>();
        differance.addAll(hSet);
        differance.removeAll(hSet2);
        System.out.println("differance = " + differance);


    }
}
