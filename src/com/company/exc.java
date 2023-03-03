package com.company;

import java.util.HashSet;
import java.util.Set;

public class exc
{
    public static void main(String[] args)
    {
        Set <String> guitar = new HashSet();
        guitar.add("Gina");
        guitar.add("George");
        guitar.add("Anne");
        guitar.add("Rob");
        guitar.add("Alan");
        guitar.add("Jean");
        guitar.add("Jack");

        Set <String> drum = new HashSet();
        drum.add("Fred");
        drum.add("Dan");
        drum.add("Alan");
        drum.add("Anne");
        drum.add("Rob");
        drum.add("Jerry");
        drum.add("Jack");

        Set <String> flute = new HashSet();
        flute.add("Joe");

        displayAllInstruments(drum,guitar);
        drumsOnly(drum,guitar);
        guitarOnly(drum,guitar);
        eitherGuitarOrDrums(drum,guitar);
        onlyFlute(guitar,drum,flute);
    }

    /**
     * All the people that play the instruments
     * @param drum
     * @param guitar
     */
    public static void displayAllInstruments(Set<String>drum, Set<String>guitar)
    {
        Set<String> allInstruments = new HashSet<>();
        allInstruments.addAll(drum);
        allInstruments.addAll(guitar);

        System.out.println("All instruments"+allInstruments.toString());
    }

    /**
     * People that only play the drums
     * @param drums
     * @param guitar
     */
    public static void drumsOnly(Set<String> drums,Set<String> guitar)
    {
        /*
        Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).
         */
        Set<String> drumsOnly = new HashSet<>();
        /*
        Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
        If the specified collection is also a set, the addAll operation effectively modifies this set so that its value is
        the union of the two sets.
        The behavior of this operation is undefined if the specified collection is modified while the operation is in progress.
         */
        drumsOnly.addAll(drums);
        /*
        Removes from this set all of its elements that are contained in the specified collection (optional operation).
         If the specified collection is also a set,
         this operation effectively modifies this set so that its value is the asymmetric set difference of the two sets
         */
        drumsOnly.removeAll(guitar);

        System.out.println("Drums only = " + drumsOnly.toString());
    }


    /**
     * People the only play the guitar
     * @param drums
     * @param guitar
     */
    public static void guitarOnly(Set<String> drums,Set<String> guitar)
    {
        Set<String> guitarOnly = new HashSet<>();
        /*
        Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
        If the specified collection is also a set, the addAll operation effectively modifies this set so that its value is
        the union of the two sets.
        The behavior of this operation is undefined if the specified collection is modified while the operation is in progress.
         */
        guitarOnly.addAll(guitar);
        /*
        Removes from this set all of its elements that are contained in the specified collection (optional operation).
         If the specified collection is also a set,
         this operation effectively modifies this set so that its value is the asymmetric set difference of the two sets
         */
        guitarOnly.removeAll(drums);

        System.out.println("Guitars only = " + guitarOnly.toString());
    }

    /**
     * People the play 2 instruments
     * @param drums
     * @param guitar
     */
    public static void eitherGuitarOrDrums(Set<String> drums,Set<String> guitar)
    {
        Set<String> twoInstruments = new HashSet<>();
        /*
        Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
        If the specified collection is also a set, the addAll operation effectively modifies this set so that its value is the
        union of the two sets.
        The behavior of this operation is undefined if the specified collection is modified while the operation is in progress.
         */
        twoInstruments.addAll(guitar);

        /*
        Retains only the elements in this set that are contained in the specified collection (optional operation).
        In other words, removes from this set all of its elements that are not contained in the specified collection.
        If the specified collection is also a set,
        this operation effectively modifies this set so that its value is the intersection of the two sets.
         */
        twoInstruments.retainAll(drums);

        System.out.println("People the play 2 interments = " + twoInstruments.toString());
    }
    public static void onlyFlute(Set<String> guitar,Set<String>drums,Set<String>flute)
    {
        Set<String> onlyFlute = new HashSet<>();

        onlyFlute.addAll(flute);
        onlyFlute.retainAll(drums);
        onlyFlute.retainAll(guitar);
        System.out.println("Only flute = " + onlyFlute.toString());
    }

}
