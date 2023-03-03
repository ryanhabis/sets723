package com.company;

import java.util.*;

public class exc3
{
    public static void main(String[] args)
    {
        String [] words = {"one", "two", "three"};


        Set <String> s1 = new HashSet();

        for (String s : words) {
            s1.add(s);

        }

        System.out.println("Og set: " + s1);

        Set <String> s2 = new HashSet (Arrays.asList(words));
        System.out.println("Og set: " + s2);

        //  Arrays.asList(words);

        Scanner in = new Scanner (System.in);

//      System.out.println("Enter a word to remove: ");
//      String input = in.next();
//      s1.remove(input);
//      System.out.println("After removal: " + s1);
//
//       System.out.println("Enter a word to add: ");
//      String add = in.next();
//
//
//      if (s1.add(add) == false) { //it was in already in set
//        System.out.println("Word already in set.");
//    }
//
        for (String s : s1) { //proves enhanced for loop does not enhance underlying set!
            //not touching actual set, while iterating over set, its like you have a copy of it or just referring to it, not actual set!
            s = s.toUpperCase();
            System.out.println("Should work now: " + s); //s seems to represent actual els
        }

        System.out.println("Upper: " + s1);


        //solution: create an iterator
        //Generics used -> string
        Iterator<String> iter1 = s1.iterator(); //iterators do not have add method, only remove
        while (iter1.hasNext()) {
            String el = "";
            el = iter1.next();
            el = el.toUpperCase();
//          iter1.remove(); //removes current element
//          //then add to set
//          s1.add(element.toUpperCase()); //this does not work as u cannot change set as u iterate over it! this is the rule for sets. Will crash
//          ConcurrentModificationException!!!!
        }

        System.out.println("Els to uppercase using iterator: " + s1);

        //therefore, iterator and enhanced for loop do the same thing
        //iterator was what u had to use before there were enhanced for loops
        //now we use enhanced for loops I think


        //solution for changing set to uppercase:
        //make a copy
        Set <String> s1copy = new HashSet ();

        Iterator <String> iter2 = s1.iterator();  //iterate through the og set! so that we can make changes to the other one
        //iterators do not have add method, only remove
        while (iter2.hasNext()) {
            String el = "";
            el = iter2.next(); //you can make changes to a diff set within a loop, just not to the set u are iterating through :)
            //so, we change a DIFF set to uppercase, and then just copy over the set after the loop

            //why remove?
            iter2.remove(); //remove as u will no longer be using og set
            s1copy.add(el.toUpperCase()); //add the uppercase elements to the copy -> this should work as u are not changing the els/set u are looping through, u r changing another one
        }
        s1 = s1copy;
        System.out.println("Uppercase with copy conversion method: " + s1);



        //Change every second word in the set to lowercase
        //make a copy
        Set <String> s1tolower = new HashSet();

        //for every second, create a flag to change and reset each time
        boolean flag = true;

        Iterator <String> iter3 = s1.iterator(); //set it to the og iterator so that it loops through old els so u can change new ones
        String el = "";

        while (iter3.hasNext()) {
            if (flag == true) {

                el = iter3.next();
                iter3.remove(); //clear old array
                // change and add to new one in lowercase
                s1tolower.add(el.toLowerCase());
                flag = false;
            }
            else {
                //add without changing to lowercase
                // iter4.remove();
                s1tolower.add(el.toUpperCase());
                flag = true; //reset to keep going
            }
        }

        //copy over
        s1 = s1tolower;
        System.out.println("Every second to lower: "  + s1);

        //as hashsets order them their own way, when u present every second one in lowercase, it will always display all messed up
        //treesets wouldn't work either as they follow a 'natural order', based on compareto (numbers)
        //therefore, everysecond one is not possible

        //everytime u use an iterator over a hashset, it reorders them differently lol
        // no set pattern or order

        //half els could be changed to lowercase

        //use a list instead
        Set <String> s4 = (Set<String>) new ArrayList();

        boolean flag2 = true;

        Iterator <String> iter4 = s1.iterator(); //set it to the og iterator so that it loops through old els so u can change new ones
        String element = "";

        while (iter4.hasNext()) {
            if (flag) {

                element = iter4.next();
                iter4.remove(); //clear old array
                // change and add to new one in lowercase
                s1tolower.add(element.toLowerCase());
                flag2 = false;
            }
            else {
                //add without changing to lowercase
                // iter4.remove();
                s1tolower.add(element.toUpperCase());
                flag2 = true; //reset to keep going
            }
        }
    }
}
