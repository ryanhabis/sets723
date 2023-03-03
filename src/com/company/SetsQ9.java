package com.company;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Heidi
 */
public class SetsQ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set<Integer> winningnumbers = new HashSet();

        Random rand = new Random();

        do {
            winningnumbers.add(rand.nextInt(41)); //autoboxing -> casting primitive to object   //unboxed when stored to variable type int?
        } while (winningnumbers.size() < 6);

        //prompt player to enter the numbers on their ticket
        Set<Integer> ticket = new HashSet();

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            ticket.add(in.nextInt());
        } while (ticket.size() < 6);

        //use intersect to check if ticket and winning numbers match
        Set<Integer> intersection = new HashSet(winningnumbers);

        intersection.retainAll(ticket); //makes an intersection of the winningnumbers and the ticket

        //int winnings = 100;
        
        int winnings = intersection.size() * 100;

//        for (int i = 1; i <= 6; i++) {
//            if (intersection.size() == i) {
//                winnings = winnings * i;
//            }
//        }
        
        System.out.println("You won " + winnings);
    }

}
